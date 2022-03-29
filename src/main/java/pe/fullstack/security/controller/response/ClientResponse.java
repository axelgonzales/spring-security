package pe.fullstack.security.controller.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClientResponse implements Serializable {

	private static final long serialVersionUID = 3731512622883862058L;
	
	private String clientId;
    private String name;
    private String lastname;
    private String phone;
}
