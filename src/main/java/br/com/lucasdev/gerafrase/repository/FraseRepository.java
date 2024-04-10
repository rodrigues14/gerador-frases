package br.com.lucasdev.gerafrase.repository;

import br.com.lucasdev.gerafrase.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f ORDER BY RANDOM() LIMIT 1")
    Frase buscarFraseAleatoria();
}
