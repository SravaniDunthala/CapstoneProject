package com.registration.capstoneproject.controller;

public class CreditCheck {

	private int score;

	public CreditCheck(int score) {
		this.setScore(score);
		// TODO Auto-generated constructor stub
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "CreditCheck [score=" + score + "]";
	}
	

}
