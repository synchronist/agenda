package br.com.agenda.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Tarefa {

    @Column(name="nome")
    private String nome;

    @Column(name="concluido")
    private Boolean concluido;

    @Column(name="data_inicial")
    private String dataInicio;

    @Column(name="data_final")
    private String dataFinal;

    @Id
    private Long idUsuario;

}
