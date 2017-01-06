package com.kopylov.service.impl;

import com.kopylov.model.Client;
import com.kopylov.repository.ClientRepository;
import com.kopylov.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("clientService")
public class ClientServiceImpl implements ClientService{

    private ClientRepository clientRepository;

    @Autowired
    public void setClientRepository(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }



    @Transactional
    public void addClient(Client client){
        clientRepository.saveAndFlush(client);
    }
}
