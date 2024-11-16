package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController      /*Configurando, definindo que esta classe vai ser uma controladora*/
@RequestMapping(value = "/games")   /*Mapeando recurso  /games  seria a rota/caminho  de acesso*/
public class GameController {

    @Autowired  /*injetando Service no controller*/
    private GameService gameService;

    /*Criando um metodo e retorna a busca por id*/
    @GetMapping(value = "/{id}")
    public GameDTO finbById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }


    /*Criando um metodo e retorna uma lista de Games*/
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.finAll();
        return result;
    }


}
