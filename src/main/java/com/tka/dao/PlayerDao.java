package com.tka.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.tka.model.Player;

@Repository
public class PlayerDao {

	List<Player> list = new ArrayList<Player>();
	Player player;

	public String addPlayer(Player player) {
		if (list.isEmpty() == true) {

			list.add(player);
			return " player Added successfully with ID: " + player.getPlayerId();
		}
		if (list.isEmpty() != true) {
			for (Player player1 : list) {
				if (player1.getPlayerId() != player.getPlayerId()) {

					list.add(player);

					return " player Added successfully with ID: " + player.getPlayerId();
				} else
					return "Player Already Present in List";

			}
		}

		return "Plyer already Present in List";
	}

	public List<Player> getAllPlayer() {

		return list;
	}

	public Object getPlayerById(int id) {
		for (Player player : list) {
			if (id == player.getPlayerId()) {

				return player;
			}

		}

		return "Player not found!";
	}

	public String updatePlayerById(int id, Player player) {

		for (int i = 0; i < list.size(); i++) {

			if (id == list.get(i).getPlayerId()) {

				list.set(i, player);

				return "updated successfully!";
			}
		}
		return "Player id not found please try again!";
	}

	public String deletePlayer(int id) {

		for (Player player : list) {

			if (id == player.getPlayerId()) {

				list.remove(player);
				return "Player deleted";
			}
		}

		return "Player id not found!";
	}
}
