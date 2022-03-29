package pe.fullstack.security.controller.request;

import lombok.Data;

@Data
public class ClientRequest {
    private String id;
    private String name;
    private String lastname;
    private String phone;
}
