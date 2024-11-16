package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController      /*Configurando, definindo que esta classe vai ser uma controladora*/
@RequestMapping(value = "/lists")   /*Mapeando recurso  /games  seria a rota/caminho  de acesso*/
public class GameListController {

    @Autowired  /*injetando Service no controller*/
    private GameListService gameListService;


    /*Criando um metodo e retorna uma lista de Games*/
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }


}
