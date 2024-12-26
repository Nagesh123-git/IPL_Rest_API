package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Player;
import com.tka.service.PlayerService;

@RestController
@RequestMapping("/api")

public class PlayerController {

	@Autowired
	PlayerService playerService;

	@PostMapping("/player")

	public String addPlayer(@RequestBody Player player) {

		return playerService.addPlayer(player);

	}

	@GetMapping("/players")
	public List<Player> getAllPlayer() {

		return playerService.getAllPlayer();

	}

	@GetMapping("/player/{id}")

	public Object getPlayerById(@PathVariable int id) {

		return playerService.getPlayerById(id);
	}

	@PutMapping("/player/{id}")

	public String updatePlayerById(@RequestBody Player player, @PathVariable int id) {

		return playerService.updatePlayerById(id, player);

	}

	@DeleteMapping("/player/{id}")

	public String deletePlayer(@PathVariable int id) {

		return playerService.deletePlayer(id);

	}

}
