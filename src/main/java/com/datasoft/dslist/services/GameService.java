package com.datasoft.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datasoft.dslist.DTO.GameMinDTO;
import com.datasoft.dslist.entities.Game;
import com.datasoft.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x-> new GameMinDTO(x)).toList();
		
	}

}
