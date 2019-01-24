package org.know.micro.services.limitmicroservice.controller;

import org.know.micro.services.limitmicroservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KnowGroup
 */
@RestController
public class LimitServiceResource {

    @Autowired
    public Configuration config;
    
    @GetMapping("/limit-service-config")
    public Configuration limitServiceConfig(){
        return config;
    }
}
