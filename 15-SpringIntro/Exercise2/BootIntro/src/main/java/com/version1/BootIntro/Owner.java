package com.version1.BootIntro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    @Autowired
    private Pet pet;

    public String getPetName(){
        return pet.getName();
    }
}
