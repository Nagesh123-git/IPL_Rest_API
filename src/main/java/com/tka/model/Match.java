package com.tka.model;

public class Match {

	private int matchId;
	private  String teamOnename;
	private  String teamTwoname;
	private String date;
	private String venue;
	private String result;
	
	public Match() {
		
	}

	public Match(int matchId, String teamOnename, String teamTwoname, String date, String venue, String result) {
		super();
		this.matchId = matchId;
		this.teamOnename = teamOnename;
		this.teamTwoname = teamTwoname;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getTeamOnename() {
		return teamOnename;
	}

	public void setTeamOnename(String teamOnename) {
		this.teamOnename = teamOnename;
	}

	public String getTeamTwoname() {
		return teamTwoname;
	}

	public void setTeamTwoname(String teamTwoname) {
		this.teamTwoname = teamTwoname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", teamOnename=" + teamOnename + ", teamTwoname=" + teamTwoname + ", date="
				+ date + ", venue=" + venue + ", result=" + result + "]";
	}
	
	
	
	
	

}
