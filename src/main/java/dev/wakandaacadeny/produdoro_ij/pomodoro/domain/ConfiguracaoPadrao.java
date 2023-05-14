package dev.wakandaacadeny.produdoro_ij.pomodoro.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "ConfiguracaoPadrao")
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
public class ConfiguracaoPadrao {
    private static final String CODIGO_DEFAULT = "DEFAULT";
    @MongoId(targetType = FieldType.STRING)
    private String codigo;
    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesParaPausaLonga;

}
