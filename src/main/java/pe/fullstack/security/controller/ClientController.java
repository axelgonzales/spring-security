package pe.fullstack.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import pe.fullstack.security.controller.request.ClientRequest;
import pe.fullstack.security.services.ClientService;

@Controller
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

    private ClientService clientService;

    @PostMapping("/add")
    public String add(ClientRequest beanRequest) {
        clientService.add(beanRequest);
        return "redirect:/";
    }

    @PostMapping("/edit")
    public String edit(ClientRequest beanRequest) {
        clientService.edit(beanRequest);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(ClientRequest beanRequest) {
        clientService.delete(beanRequest);
        return "redirect:/";
    }

}
