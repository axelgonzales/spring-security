package pe.fullstack.security.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import pe.fullstack.security.controller.request.ClientRequest;
import pe.fullstack.security.controller.response.ClientResponse;
import pe.fullstack.security.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	
	private List<ClientResponse> clients = new ArrayList<>();

	public List<ClientResponse> list() {
        return clients;
    }

    public void add(ClientRequest request){
    	ClientResponse client = new ClientResponse();
    	client.setClientId(UUID.randomUUID().toString());
    	client.setLastname(request.getLastname());
    	client.setName(request.getName());
    	client.setPhone(request.getPhone());
    	clients.add(client);
    }

    public void edit(ClientRequest request){
    	int contador = 0;
    	for (ClientResponse clientResponse : clients) {
			if (clientResponse.getClientId().equals(request.getId())) {
				clients.get(contador).setLastname(request.getLastname());
		    	clients.get(contador).setName(request.getName());
		    	clients.get(contador).setPhone(request.getPhone());	
		    	break;
			}
			contador ++;
		}
    }

    public void delete(ClientRequest request) {
    	int contador = 0;
    	for (ClientResponse clientResponse : clients) {
    		if (clientResponse.getClientId().equals(request.getId())) {
				clients.remove(contador);
				break;
			}
			contador ++;
		}
    }

}
