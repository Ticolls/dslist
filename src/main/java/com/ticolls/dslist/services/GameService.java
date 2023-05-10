package com.ticolls.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticolls.dslist.dto.GameMinDTO;
import com.ticolls.dslist.entities.Game;
import com.ticolls.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> data = repository.findAll();
        List<GameMinDTO> dtos = data.stream().map(GameMinDTO::new).toList();

        return dtos;
    }
}
