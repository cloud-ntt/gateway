package com.ntt.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class InicioController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Buenos dias";
    }
}
