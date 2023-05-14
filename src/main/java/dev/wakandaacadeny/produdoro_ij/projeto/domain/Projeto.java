package dev.wakandaacadeny.produdoro_ij.projeto.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
@Document(collection = "Projeto")
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter

public class Projeto {
    @Id
    private UUID idProjeto;
    private String nome;
    private String descricao;
    @Indexed
    private UUID idUsuario;
    @Indexed
    private UUID idArea;


}

