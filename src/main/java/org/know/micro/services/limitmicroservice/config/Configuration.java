package org.know.micro.services.limitmicroservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author KnowGroup
 */
@Component
@ConfigurationProperties("limit-micro-service")
public class Configuration {
    
    public Integer minimum;
    public Integer maximum; 

    public Configuration() {
    }
    
    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }
    
    
}
