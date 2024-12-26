package com.tka.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.PlayerDao;
import com.tka.model.Player;

@Service
public class PlayerService {

	@Autowired

	PlayerDao playerDao;

	public String addPlayer(Player player) {

		return playerDao.addPlayer(player);

	}

	public List<Player> getAllPlayer() {

		return playerDao.getAllPlayer();
	}

	public Object getPlayerById(int id) {
		return playerDao.getPlayerById(id);
	}

	public String updatePlayerById(int id, Player player) {
		return playerDao.updatePlayerById(id, player);
	}

	public String deletePlayer(int id) {

		return playerDao.deletePlayer(id);
	}

}
