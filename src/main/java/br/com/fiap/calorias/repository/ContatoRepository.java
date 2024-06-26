package br.com.fiap.calorias.repository;

import br.com.fiap.calorias.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ContatoRepository extends JpaRepository <Contato, Long> {

     Optional<Contato> findByNome(String nome);


     List<Contato> findByDataNascimentoBetween(LocalDate dataInicial, LocalDate dataFinal);

}
