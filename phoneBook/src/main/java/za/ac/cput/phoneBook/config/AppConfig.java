package za.ac.cput.phoneBook.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.phoneBook.phoneBook;
import za.ac.cput.phoneBook.phoneBookInterface;

/**
 * Created by student on 2015/02/16.
 */
@Configuration

public class AppConfig {

    @Bean(name = "phoneB")
    public phoneBookInterface getNumber(){
        return new phoneBook();
    }
    
}
