package com.tka.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.TeamDao;
import com.tka.model.Team;

@Service
public class TeamService {

	@Autowired

	TeamDao teamDao;

	public String addTeam(Team team) {
		return teamDao.addTeam(team);
	}

	public List<Team> addAllTeams() {

		return teamDao.addAllTeams();
	}

	public Object GetaTeambyID(int id) {

		return teamDao.GetaTeambyID(id);
	}

	public String updateaTeam(Team team, int id) {

		return teamDao.updateaTeam(team, id);

	}

	public String deleteTeamById(int id) {

		return teamDao.deleteTeamById(id);

	}
}
