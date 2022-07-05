package com.version1.BootIntro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public Pet() {
    }

    @Value("Lola")
    public void setName(String name) {
        this.name = name;
    }
}
