package com.example.demoj8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController(value = "/webhook")
@CrossOrigin(origins = {"http://localhost:80", "http://localhost:4200", "http://localhost:8080", "http://localhost"})
public class WebHookController {

 
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
    	String url = "https://sandbox.belvo.com/api/token/";
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
    	Solicitud soli = new Solicitud();
    	soli.setId("33e035a2-4d13-467c-ab7c-0f7a3d1605cc");
    	soli.setPassword("5yGpoWU87*njiK7_cObWozHNv465lbFqPhdxBww4b5#O_t0LF7Oou7L@Mtpi*Lht");
    	soli.setScopes("read_institutions,write_links,read_consents,write_consents,write_consent_callback,delete_consents");
    	
    	HttpEntity<Solicitud> request = new HttpEntity<>(soli, headers);

		ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);


        return response;
    }

   
}
