package com.example.demoj8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/webhook")
@CrossOrigin(origins = {"http://localhost:80", "http://localhost:4200", "http://localhost:8080", "http://localhost"})
public class WebHookController {
 private static final Logger log = LoggerFactory.getLogger(WebHookController.class);
 
	@Autowired
	private RestTemplate restTemplate;


	/**
	 * Metodo para guardar en alfresco
	 * @param mRequest
	 * @param folder
	 * @param tipo
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful response", response = Solicitud.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Solicitud.class) })
	@PostMapping(value = "/getinvoice", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> createContentSM(@RequestBody Webhook solicitud) {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
    	
    	log.info("Entrada {}", solicitud);
		ResponseEntity<String> response = new ResponseEntity<>("{\"status_code\":200}", HttpStatus.ACCEPTED);


        return response;
    }

   
}
