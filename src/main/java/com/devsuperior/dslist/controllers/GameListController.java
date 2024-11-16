package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController      /*Configurando, definindo que esta classe vai ser uma controladora*/
@RequestMapping(value = "/lists")   /*Mapeando recurso  /games  seria a rota/caminho  de acesso*/
public class GameListController {

    @Autowired  /*injetando Service no controller*/
    private GameListService gameListService;

    @Autowired
    private GameService gameService;


    /*Criando um metodo e retorna uma lista de Games*/
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    /*Criando um metodo e retorna uma lista de Games por id */
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.finByList(listId);
        return result;
    }



}
