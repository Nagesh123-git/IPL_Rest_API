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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Team;
import com.tka.service.TeamService;

@RestController
@RequestMapping("/api")
public class TeamController {

	@Autowired

	TeamService teamService;

	@PostMapping("/team")
	public String addTeam(@RequestBody Team team) {

		String s = teamService.addTeam(team);
		return s + team.getTeamId();

	}

	@GetMapping("/teams")

	public List<Team> getAllTeams() {

		return teamService.addAllTeams();

	}

	@GetMapping("/team/")

	public Object GetaTeambyID(@RequestParam int id) {

		return teamService.GetaTeambyID(id);

	}

	@PutMapping("/team/")

	String updateaTeam(@RequestParam int id, @RequestBody Team team) {

		return teamService.updateaTeam(team, id);

	}

	@DeleteMapping("/team/{id}")

	String deleteTeamById(@PathVariable int id) {

		return teamService.deleteTeamById(id);

	}

}
