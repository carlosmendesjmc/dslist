package com.devsuperior.dslist.dto;


import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();

        /* nesta construtos não passamos atributos como parametos, a variavel neste construtos recebe os valos com o get la da entidade Game*/
        /*passamos a classe Game e a entity e nao precisa de usar o this porque não tem ambiguidade (nomes iguais passados como parametros)*/
    }
    /*no DTO so precisa do get que recebe os valos dos atributos da entidade e insere os valos nesta classe GameMinDTO e nao precisa do set*/
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
