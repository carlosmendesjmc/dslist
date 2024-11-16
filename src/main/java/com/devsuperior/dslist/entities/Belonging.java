package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    /*aqui utilizamos um id representando os dois id da classe BelongingPK, uma forma de representa chave estrangeira, que representa mais de um atributo */
    /*O atributo id do tipo Long usado como parametro na classse repository (obs : que nao pode passar mais de um parametro como id) por isso cria esse id chave estrageira que tambem é usando para acessar o Banco de dados  */
    /*assim o Paramento passado como ID tipo Long no repository acessa as classes definidas na BelongingPK utilizando a chave estrangeira*/

    @EmbeddedId
    private BelongingPK id = new BelongingPK();  /*instaciando para o id não ficar nullo*/

    private Integer position;

    public Belonging(){

    }
/*AQUI ESTAMOS CRIANDO O OBJ DO TIPO BELONGING E PASSANDO OS DOIS VALORES PARA UM SÓ ID*/
    public Belonging(Game game, GameList list, Integer position){
        id.setGame(game);
        id.setList(list);
        this.position = position;

    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
