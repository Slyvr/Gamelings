package com.slyvr.gamelings.objects.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.slyvr.gamelings.MyGame;
import com.slyvr.gamelings.objects.Ent;
import com.slyvr.gamelings.objects.Menu;

public class SplashMenu extends Menu{

	
	public SplashMenu(){
		load();
	}
	
	public void load(){
		this.setName("splash");
		
		ArrayList<Ent> ents = new ArrayList<Ent>();

		Ent logo = new Ent();
		logo.setName("logo");
		logo.setImg(MyGame.getGlobal().getImgByName("logoSlyvrOnlineCredits"));
		logo.setPosBox(new Rectangle((Gdx.graphics.getWidth()/2)-(logo.getImg().getTex().getWidth()/2),
				(Gdx.graphics.getHeight()/2)-(logo.getImg().getTex().getHeight()/2),
				logo.getImg().getTex().getWidth(),
				logo.getImg().getTex().getHeight()));
		ents.add(logo);
		
		this.setEnts(ents);
	}
	
	private static long startMillis;
	
	public void update(float stateTime){
		
		if (startMillis==0) startMillis = System.currentTimeMillis();
		else{
			if (startMillis+2000<=System.currentTimeMillis()){
				MyGame.getGlobal().changeMenu("main");
			}
		}
	}
}
