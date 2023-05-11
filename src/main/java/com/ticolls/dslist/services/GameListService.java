package com.ticolls.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticolls.dslist.dto.GameListDTO;
import com.ticolls.dslist.entities.GameList;
import com.ticolls.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    public List<GameListDTO> findAll() {
        List<GameList> data = repository.findAll();
        List<GameListDTO> dtos = data.stream().map(GameListDTO::new).toList();

        return dtos;
    }
}
