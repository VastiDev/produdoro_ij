package dev.wakandaacadeny.produdoro_ij.area.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "Area")
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter

public class Area {
    @Id
    private UUID idArea;
    private String nome;
    private String descricao;
    @Indexed
    private UUID idUsuario;

}

