package pl.jkan.clientDetails;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ClientDetailsConfiguration{

    @Bean
    public ClientDetailsRepository repository(){
        return new ClientDetailsRepository();
    }
}