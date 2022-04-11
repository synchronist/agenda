package br.com.agenda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Usuario {

    @Column(name="nome")
    private String nome;

    @Id
    @Column(name="id")
    private String id;

    @Column(name="email")
    private String email;

    @Column(name="senha")
    private String senha;

}
