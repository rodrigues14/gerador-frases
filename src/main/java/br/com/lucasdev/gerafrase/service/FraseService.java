package br.com.lucasdev.gerafrase.service;

import br.com.lucasdev.gerafrase.dto.FraseDTO;
import br.com.lucasdev.gerafrase.repository.FraseRepository;
import br.com.lucasdev.gerafrase.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO buscarFraseAleatoria() {
        Frase frase = repository.buscarFraseAleatoria();
        return new FraseDTO(
                frase.getTitulo(),
                frase.getFrase(),
                frase.getPersonagem(),
                frase.getPoster()
        );
    }

}
