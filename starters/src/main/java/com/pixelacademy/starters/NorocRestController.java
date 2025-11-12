package com.pixelacademy.starters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NorocRestController {

    @GetMapping
    public String mesaj() {
        return "Hai noroc!1231432222221111111111CLAR?";
    }
}
