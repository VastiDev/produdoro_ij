package dev.wakandaacadeny.produdoro_ij.tarefa.domain;

import dev.wakandaacadeny.produdoro_ij.usuario.domain.StatusUsuario;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "Tarefa")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder

public class Tarefa {
    @Id
    private UUID idTarefa;
    private String nome;
    private String descricao;
    @Indexed
    private UUID idUsuario;
    @Indexed
    private UUID idArea;
    private UUID idProjeto;
    @Builder.Default
    private StatusTarefa status = StatusTarefa.A_FAZER;

}

