package com.jpdev.gamelist.services;

import com.jpdev.gamelist.dto.GameMinDTO;
import com.jpdev.gamelist.entities.GameEntity;
import com.jpdev.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<GameEntity> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
