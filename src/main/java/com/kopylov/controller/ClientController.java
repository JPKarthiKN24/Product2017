package com.kopylov.controller;

import com.kopylov.model.Client;
import com.kopylov.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientController {
    private ClientService clientService;

    @Autowired
    @Qualifier("clientService")
    public void setClientService(ClientService clientService){
        this.clientService=clientService;
    }

    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public String reg(Model model){
        model.addAttribute("client", new Client());
        return "registration";
    }

    @RequestMapping(value = "registration/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute Client client){
        this.clientService.addClient(client);
    return "home";
    }

}
