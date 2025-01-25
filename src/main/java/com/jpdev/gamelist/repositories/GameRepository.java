package com.jpdev.gamelist.repositories;

import com.jpdev.gamelist.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameEntity, Long> {
}
