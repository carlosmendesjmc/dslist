package com.devsuperior.dslist.projections;

public interface GameMinProjection {
/*Criando todos metodos que a query esta retornando*/
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
