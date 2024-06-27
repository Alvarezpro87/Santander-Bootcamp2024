package br.com.alex.desafio.dominio.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Curso {
   private String titulo;
   private String descricao;
   private int cargaHoraria;

}
