package com.slyvr.gamelings.objects;

import com.slyvr.gamelings.objects.controllers.GameController;

public class Player {

	private int id;
	private String name;
	private boolean ai;
	private GameController ctrl;

	public Player(){
		
	}
	
	public Player(int id){
		this.id = id;
		this.name = "Player "+id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAi() {
		return ai;
	}
	public void setAi(boolean ai) {
		this.ai = ai;
	}
	public GameController getCtrl() {
		return ctrl;
	}
	public void setCtrl(GameController ctrl) {
		this.ctrl = ctrl;
	}
	
}
