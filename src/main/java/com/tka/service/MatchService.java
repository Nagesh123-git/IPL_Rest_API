package com.tka.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.MatchDao;
import com.tka.model.Match;

@Service
public class MatchService {

	@Autowired
	MatchDao matchDao;

	public String addNewMatch(com.tka.model.Match match) {
		return matchDao.addNewMatch(match);
	}

	public List<Match> getAllMatches() {
		return matchDao.getAllMatches();
	}

	public Object getMatchByID(int id) {
		return matchDao.getMatchByID(id);
	}

	public String updateMatchByID(int id, Match match) {

		return matchDao.updateMatchByID(id, match);
	}

	public String deleteMatch(int id) {

		return matchDao.deleteMatch(id);
	}

}
