package com.datasoft.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasoft.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
