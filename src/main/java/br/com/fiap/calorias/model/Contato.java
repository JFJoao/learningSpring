package br.com.fiap.calorias.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tbl_contato2")
public class Contato {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "CONTATO2_SEQ"
    )
    @SequenceGenerator(
            name = "CONTATO2_SEQ",
            sequenceName = "CONTATO2_SEQ",
            allocationSize = 50
    )
    private Long id;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "data_nascimento")
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private String email;
    private LocalDate dataNascimento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(id, contato.id) && Objects.equals(nome, contato.nome) && Objects.equals(email, contato.email) && Objects.equals(dataNascimento, contato.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, dataNascimento);
    }
}
