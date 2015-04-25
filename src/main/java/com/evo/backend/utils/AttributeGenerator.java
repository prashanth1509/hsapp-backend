package com.evo.backend.utils;

import com.evo.backend.entities.PropertyAttributes;
import org.springframework.web.client.RestTemplate;

/**
 * Created by prashanth.a on 25/04/15.
 */
public class AttributeGenerator {

    private String endpointURL = "";

    public AttributeGenerator(String pid) {
        this.endpointURL = "https://housing.com/api/v2/rent/" + pid;
    }

    public PropertyAttributes getAttributes(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(this.endpointURL, PropertyAttributeWrapper.class).getAttributes();
    }

}
