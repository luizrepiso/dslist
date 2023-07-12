package com.datasoft.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasoft.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
