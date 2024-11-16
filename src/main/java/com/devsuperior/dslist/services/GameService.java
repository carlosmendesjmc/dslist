package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  /*Registrando a classe que vai ser um componente do sistema pode utiliar o @Service tambem(termo injetar componetes no sistema) */
public class GameService {

    @Autowired
    private GameRepository gameRepository;  /*injetando uma instacia GameRepository dentro do GameService*/

    /*Criando um metodo, aqui a classe Service retorna um DTO*/
    /*findALl() é uma função que vai retornar uma lista de da classe GameMinDTO*/
    /*Criando o retorno e armazenando na variavell result a lista de busca feita no banco pelo repository e convertida automaticamente */
    public List<Game> finAll() {
        List<Game> result = gameRepository.findAll();
        return result;

    }

}
