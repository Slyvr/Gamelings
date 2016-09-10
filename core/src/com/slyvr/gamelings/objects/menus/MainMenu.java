package com.slyvr.gamelings.objects.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.slyvr.gamelings.MyGame;
import com.slyvr.gamelings.objects.Ent;
import com.slyvr.gamelings.objects.Menu;

public class MainMenu extends Menu{

	private static boolean moonbehind;
	private static boolean mooncenter;
	private static int moonCounter;
	private static boolean shipdown;
	
	public MainMenu(){
		load();
	}
	
	public void load(){
		this.setName("main");
		
		ArrayList<Ent> ents = new ArrayList<Ent>();
		
		Ent logo = new Ent();
		logo.setName("logo");
		logo.setImg(MyGame.getGlobal().getImgByName("logo"));
		logo.setPosBox(new Rectangle((Gdx.graphics.getWidth()/2)-(logo.getImg().getTex().getWidth()/2),
				Gdx.graphics.getHeight() - 300,
				logo.getImg().getTex().getWidth(),
				logo.getImg().getTex().getHeight()));
		ents.add(logo);
		
		Ent btnNewGame = new Ent();
		btnNewGame.setName("btnNewGame");
		btnNewGame.setImg(MyGame.getGlobal().getImgByName("btnNewGame"));
		btnNewGame.setPosBox(new Rectangle((int) ((Gdx.graphics.getWidth()/2)-(btnNewGame.getImg().getTex().getWidth()/2)),
				logo.getPosBox().getY()-btnNewGame.getImg().getTex().getHeight()+50,
				btnNewGame.getImg().getTex().getWidth(),
				btnNewGame.getImg().getTex().getHeight()));
		ents.add(btnNewGame);
		
		Ent btnOptions = new Ent();
		btnOptions.setName("btnOptions");
		btnOptions.setImg(MyGame.getGlobal().getImgByName("btnOptions"));
		btnOptions.setPosBox(new Rectangle((int) ((Gdx.graphics.getWidth()/2)-(btnOptions.getImg().getTex().getWidth()/2)),
				btnNewGame.getPosBox().getY()-btnOptions.getImg().getTex().getHeight()-15,
				btnOptions.getImg().getTex().getWidth(),
				btnOptions.getImg().getTex().getHeight()));
		ents.add(btnOptions);
		
		Ent btnExit = new Ent();
		btnExit.setName("btnExit");
		btnExit.setImg(MyGame.getGlobal().getImgByName("btnExit"));
		btnExit.setPosBox(new Rectangle((int) ((Gdx.graphics.getWidth()/2)-(btnExit.getImg().getTex().getWidth()/2)),
				btnOptions.getPosBox().getY()-btnExit.getImg().getTex().getHeight()-15,
				btnExit.getImg().getTex().getWidth(),
				btnExit.getImg().getTex().getHeight()));
		ents.add(btnExit);
		
		this.setEnts(ents);
	}
	
	public void update(float stateTime){
		updateButtons();
		updateButtonHover();
	}
	
	public void updateButtons(){
		if (Gdx.input.justTouched()){
			Rectangle mousePos = new Rectangle(Gdx.input.getX(),Gdx.graphics.getHeight()-Gdx.input.getY(),1,1);
			for(Ent e : this.getEnts()){
				Rectangle ePos = new Rectangle(e.getPosBox());
				ePos.setX(ePos.getX());
				ePos.setY(ePos.getY());
				if (e.getName().contains("btn")){
					if (mousePos.overlaps(ePos)){
						if (e.getName().equals("btnOptions")){
							MyGame.getGlobal().setCurrentMenu(MyGame.getGlobal().getMenuByName("options"));
						}
						if (e.getName().equals("btnNewGame")){
							MyGame.getGlobal().setCurrentMenu(MyGame.getGlobal().getMenuByName("createchar"));
						}
						if (e.getName().equals("btnExit")){
							Gdx.app.exit();
						}
					}
				}
			}
		}
	}
}
