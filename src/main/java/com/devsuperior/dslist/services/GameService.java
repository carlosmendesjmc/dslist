package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component  /*Registrando a classe que vai ser um componente do sistema pode utiliar o @Service tambem(termo injetar componetes no sistema) */
public class GameService {

    @Autowired
    private GameRepository gameRepository;  /*injetando uma instacia GameRepository dentro do GameService*/

    @Transactional(readOnly = true) /*aqui tem uma anotação de boas praticas, para ficar transacional, garanti que a operação com o banco de dados vai acontecer (Acide- Atômica, consistente, isolada e duravel)/  */
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);  /* para converter o resultado de Game para GameDTO */
        return dto;
    }

    /*Criando um metodo, aqui a classe Service retorna um DTO*/
    /*findALl() é uma função que vai retornar uma lista de da classe GameMinDTO*/
    /*Criando o retorno e armazenando na variavell result a lista de busca feita no banco pelo repository e convertida automaticamente */
    @Transactional(readOnly = true)
    public List<GameMinDTO> finAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
    /*Criando metodo que retorna lista passando o id*/
    @Transactional(readOnly = true)
    public List<GameMinDTO> finByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }



}
