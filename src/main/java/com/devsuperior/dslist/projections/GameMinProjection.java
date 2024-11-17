package com.devsuperior.dslist.projections;

public interface GameMinProjection {
/*Criando todos metodos que a query esta retornando*/
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
