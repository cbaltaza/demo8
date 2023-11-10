package com.example.demoj8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClienteImpl implements Cliente {

	 private static final Logger log = LoggerFactory.getLogger(WebHookController.class);

	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public void consultarDatos(String id) {
		String uRLf = "https://api.belvo.com/api/invoices/?link={id}";
		String uRLAux = uRLf.replace("{id}", id);
		
		ResponseEntity<String> salida = restTemplate.getForEntity(uRLAux, String.class);
		
		log.info("Datos de Salida del metodo post para Guardar en base de datos", salida);
		
	}
	

	
}
