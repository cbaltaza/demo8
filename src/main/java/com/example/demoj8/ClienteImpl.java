package com.example.demoj8;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
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
		String uRLf = "https://sandbox.belvo.com/api/invoices/?link={id}";
		String uRLAux = uRLf.replace("{id}", id);
		   String userAndPass = "33e035a2-4d13-467c-ab7c-0f7a3d1605cc:5yGpoWU87*njiK7_cObWozHNv465lbFqPhdxBww4b5#O_t0LF7Oou7L@Mtpi*Lht";
			log.info("Datos uRLAux {} ", uRLAux);
			String pwdf = Base64.getEncoder().encodeToString(userAndPass.getBytes());
			log.info("Datos pwdf {}", pwdf);

			 
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.add("Authorization", "Basic " + pwdf);
		log.info("Datos headers {}", headers);

		ResponseEntity<String> salida = restTemplate.exchange(uRLAux, HttpMethod.GET, new HttpEntity<Object>(headers), String .class);
		
		log.info("Datos de Salida del metodo post para Guardar en base de datos {}", salida.getBody());
		
	}
	

	
}
