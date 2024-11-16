package com.devsuperior.dslist.services;


import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component  /*Registrando a classe que vai ser um componente do sistema pode utiliar o @Service tambem(termo injetar componetes no sistema) */
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;  /*injetando uma instacia GameRepository dentro do GameService*/



    /*Criando um metodo, aqui a classe Service retorna um DTO*/
    /*findALl() é uma função que vai retornar uma lista de da classe GameMinDTO*/
    /*Criando o retorno e armazenando na variavell result a lista de busca feita no banco pelo repository e convertida automaticamente */
    @Transactional(readOnly = true)
    public List<GameListDTO>findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
