package com.tka.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.tka.model.Match;

@Repository
public class MatchDao {

	List<Match> list = new ArrayList<Match>();

	public String addNewMatch(Match match) {

		if (list.isEmpty() == true) {

			list.add(match);
			return "New Match Added Successfully!" + match.getMatchId();
		}
		if (list.isEmpty() != true) {
			for (Match match1 : list) {
				if (match1.getMatchId() != match.getMatchId()) {

					list.add(match);

					return "New Match Added Successfully!" + match.getMatchId();
				} else
					return "Match Already Present in List";

			}
		}

		return "Match already Present in List";

	}

	public List<Match> getAllMatches() {

		return list;
	}

	public Object getMatchByID(int id) {

		for (Match match : list) {

			if (id == match.getMatchId()) {

				return match;
			}
		}

		return "Invalid id. Please try again!";
	}

	public String updateMatchByID(int id, Match match) {

		for (Match match1 : list) {
			if (id == match1.getMatchId()) {

				list.set(id, match);

				return " Match Updated!";
			}
		}

		return "Invalid ID! Please try again!";
	}

	public String deleteMatch(int id) {

		for (Match match1 : list) {

			if (id == match1.getMatchId()) {

				list.remove(match1);
				return "Match deleted";
			}
		}

		return "Macth id not found!";
	}

}
