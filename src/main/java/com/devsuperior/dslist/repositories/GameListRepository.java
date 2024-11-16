package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
/*Para essa classe usar o CRUD no banco de dados usamos extends JpaRepository <Game, Long>  Passamos a classe e o tipo do ID com parametos*/

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
