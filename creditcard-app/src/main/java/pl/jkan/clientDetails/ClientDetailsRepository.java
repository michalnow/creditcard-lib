package pl.jkan.clientDetails;

import java.util.List;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class ClientDetailsRepository{
    private ClientDetails clientDetails;
    private List<ClientDetails> list;

    public ClientDetailsRepository(){
        list = new ArrayList<ClientDetails>();
    }

    public void addClientDetails(){
        list.add(new ClientDetails());
    }

    public List<ClientDetails> getClients(){
        return list;
    }

    public String getClient(){
        return clientDetails.getFirstName();
    }
}
