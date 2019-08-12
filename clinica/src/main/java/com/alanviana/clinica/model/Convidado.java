
package com.alanviana.clinica.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Essa anotation torna a classe como entidade no banco de dados
@Table(name="TB_CONVIDADO") //nome da tabela no banco de dados
public class Convidado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id //Vai marcar a variávei ID com chave primária
    @GeneratedValue(generator = "increment") //o JPA irá gerar o identificador
    private Long id;
    
    private String nome;
    private Integer quantidadeAcompanhantes;

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

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }
    
    
    
}
