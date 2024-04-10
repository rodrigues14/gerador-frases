package br.com.lucasdev.gerafrase.controllers;

import br.com.lucasdev.gerafrase.service.FraseService;
import br.com.lucasdev.gerafrase.dto.FraseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO gerarFrase() {
        return service.buscarFraseAleatoria();
    }

}
