package pe.fullstack.security.services;

import java.util.List;

import pe.fullstack.security.controller.request.ClientRequest;
import pe.fullstack.security.controller.response.ClientResponse;

public interface ClientService {
	
	public List<ClientResponse> list();

    public void add(ClientRequest request);

    public void edit(ClientRequest request);

    public void delete(ClientRequest request);
}
