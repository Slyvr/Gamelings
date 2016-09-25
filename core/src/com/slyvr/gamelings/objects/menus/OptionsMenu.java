package com.slyvr.gamelings.objects.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.slyvr.gamelings.MyGame;
import com.slyvr.gamelings.objects.Ent;
import com.slyvr.gamelings.objects.Menu;

public class OptionsMenu extends Menu{

	
	public OptionsMenu(){
		load();
	}
	
	public void load(){
		this.setName("options");
		
		ArrayList<Ent> ents = new ArrayList<Ent>();
		
		Ent btnBack = new Ent();
		btnBack.setName("btnBack");
		btnBack.setImg(MyGame.getGlobal().getImgByName("btnBack"));
		btnBack.setPosBox(new Rectangle((Gdx.graphics.getWidth()/2)-(btnBack.getImg().getTex().getWidth()/2),
				0+15,
				btnBack.getImg().getTex().getWidth(),
				btnBack.getImg().getTex().getHeight()));
		btnBack.setSelected(true);
		ents.add(btnBack);
		
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
						if (e.getName().equals("btnBack")){
							MyGame.getGlobal().changeMenu("previous");
						}
					}
				}
			}
		}
	}
}
