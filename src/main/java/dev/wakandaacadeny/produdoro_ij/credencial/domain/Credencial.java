package dev.wakandaacadeny.produdoro_ij.credencial.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Document(collection = "Credencial")
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Credencial {

    @MongoId(targetType = FieldType.STRING)
    @Getter
    private String usuario;
    private String senha;

    public Credencial(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = new BCryptPasswordEncoder().encode(senha);
    }
    public String getPassword(){
        return senha;
    }
}
