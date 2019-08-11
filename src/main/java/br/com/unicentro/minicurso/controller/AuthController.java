package br.com.unicentro.minicurso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="/auth")
public class AuthController {

	@GetMapping("/login/usuario/{usuario}/senha/{senha}")
	public String login(@PathVariable("usuario") String usuario, @PathVariable("senha") String senha) {
		if (usuario.equals("root") && senha.equals("admin")) {
			return Jwts.builder()
					.setSubject("root")
	                .signWith(SignatureAlgorithm.HS512, "SUA_CHAVE_SECREATA")
	                .compact();
		} else {
			return null;
		}
	}
	
}
