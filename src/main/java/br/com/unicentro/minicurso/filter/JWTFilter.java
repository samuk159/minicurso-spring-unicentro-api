package br.com.unicentro.minicurso.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Jwts;

public class JWTFilter extends GenericFilterBean {
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;	
		
		if (!"OPTIONS".equals(request.getMethod()) && !request.getServletPath().startsWith("/auth/login")) {           
			String token = request.getHeader("Authorization");
			
			try {
				Jwts.parser().setSigningKey("SUA_CHAVE_SECREATA").parseClaimsJws(token).getBody(); 
				chain.doFilter(req, res);
            } catch (Exception e) {
                e.printStackTrace();
            }
		} else {
			chain.doFilter(req, res);
		}	
	}

}

