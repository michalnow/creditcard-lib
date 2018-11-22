package pl.jkan.clientDetails;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class ClientController {

    @Autowired
    private ClientDetailsRepository clientRepository;


    public ClientController(ClientDetailsRepository clientRepository){
        this.clientRepository = clientRepository;
    }


    @PostMapping("/clients")
    public void addClient(@RequestBody ClientDetails clientDetails){
        clientRepository.addClientDetails();
    }

    @GetMapping("/clients")
    public List<ClientDetails> getClients(){
        return clientRepository.getClients();
    }

}