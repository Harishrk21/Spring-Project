package com.harish.Config;

import com.harish.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {
    @Bean
//    @Scope("prototype")
    public Desktop desktop1()
    {
        return  new Desktop();
    }


}
