package com.ticolls.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticolls.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
