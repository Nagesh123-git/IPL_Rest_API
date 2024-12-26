package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.model.Team;

@Repository
public class TeamDao {

	Team team;
	List<Team> list = new ArrayList<Team>();

	public String addTeam(Team team) {

		if (list.isEmpty() == true) {

			list.add(team);
			return "added succcesfuly";
		}

		for (Team team1 : list) {
			if (team1.getTeamId() == team.getTeamId()) {

				return "Team Already Present in List";
			}
		}

		list.add(team);

		return "added succcesfuly";

	}

	public List<Team> addAllTeams() {

		return list;

	}

	public Object GetaTeambyID(int id) {

		for (Team team : list) {

			if (id == team.getTeamId()) {

				return team;

			}

		}
		return "team not found";

	}

	public String updateaTeam(Team team, int id) {

		for (Team team1 : list) {

			if (id == team1.getTeamId()) {

				list.set(id, team);

				return "update succesfully";

			}

		}

		return "team not found";

	}

	public String deleteTeamById(int id) {

		for (Team team : list) {

			if (id == team.getTeamId()) {
				list.remove(id - 1);
				return "delete successfully";

			}

		}
		return "not found";

	}
}
