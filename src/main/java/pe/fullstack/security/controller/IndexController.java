package pe.fullstack.security.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import pe.fullstack.security.controller.response.ClientResponse;
import pe.fullstack.security.services.ClientService;

@Controller
@RequestMapping("")
@AllArgsConstructor
public class IndexController {

    private ClientService clientService;

    
    @GetMapping(path = {"", "/"})
    public String index(Model model) {
        List<ClientResponse> clients = clientService.list();
        model.addAttribute("items", clients);
        return "index";
    }
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }


}
