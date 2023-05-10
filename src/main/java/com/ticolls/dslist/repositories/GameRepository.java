package com.ticolls.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticolls.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
