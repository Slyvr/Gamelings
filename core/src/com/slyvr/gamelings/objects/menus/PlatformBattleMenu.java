package com.slyvr.gamelings.objects.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.slyvr.gamelings.MyGame;
import com.slyvr.gamelings.objects.Ent;
import com.slyvr.gamelings.objects.Menu;

public class PlatformBattleMenu extends Menu{

	
	public PlatformBattleMenu(){
		load();
	}
	
	public void load(){
		this.setName("game_platformbattle");
		
		ArrayList<Ent> ents = new ArrayList<Ent>();

		
		
		this.setEnts(ents);
	}
	
	public void update(float stateTime){
		
	}
}
