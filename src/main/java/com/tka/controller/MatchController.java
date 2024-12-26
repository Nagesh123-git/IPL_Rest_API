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

import com.tka.model.Match;
import com.tka.service.MatchService;

@RestController
@RequestMapping("/api")
public class MatchController {
	@Autowired

	MatchService matchService;

	@PostMapping("/match")

	public String addNewMatch(@RequestBody com.tka.model.Match match) {

		return matchService.addNewMatch(match);
	}

	@GetMapping("/matches")

	public List<Match> getAllMatches() {

		return matchService.getAllMatches();
	}

	@GetMapping("/match/{id}")

	public Object getMatchByID(@PathVariable int id) {

		return matchService.getMatchByID(id);

	}

	@PutMapping("/match/{id}")

	public String updateMatchByID(@RequestBody Match match, @PathVariable int id) {

		return matchService.updateMatchByID(id, match);

	}

	@DeleteMapping("/match/{id}")

	public String deleteMatch(@PathVariable int id) {

		return matchService.deleteMatch(id);

	}

}
