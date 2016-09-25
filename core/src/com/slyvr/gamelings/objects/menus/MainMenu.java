package com.slyvr.gamelings.objects.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import com.slyvr.gamelings.MyGame;
import com.slyvr.gamelings.objects.Ent;
import com.slyvr.gamelings.objects.Img;
import com.slyvr.gamelings.objects.Menu;
import com.slyvr.gamelings.objects.Player;

public class MainMenu extends Menu{
	
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
		btnNewGame.setName("btnStart");
		btnNewGame.setImg(MyGame.getGlobal().getImgByName("btnStart_hover"));
		btnNewGame.setPosBox(new Rectangle((int) ((Gdx.graphics.getWidth()/2)-(btnNewGame.getImg().getTex().getWidth()/2)),
				logo.getPosBox().getY()-btnNewGame.getImg().getTex().getHeight()+50,
				btnNewGame.getImg().getTex().getWidth(),
				btnNewGame.getImg().getTex().getHeight()));
		btnNewGame.setSelected(true);
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
							MyGame.getGlobal().changeMenu("options");
						}
						if (e.getName().equals("btnStart")){
							MyGame.getGlobal().changeMenu("playersetup");
						}
						if (e.getName().equals("btnExit")){
							Gdx.app.exit();
						}
					}
				}
			}
		}
		for(Player player : MyGame.getGlobal().getPlayers()){
			if (player.getCtrl() != null){
				updateButtonNavigation(player);
				updateButtonSelection(player);
			}
		}
	}
	
	public void updateButtonNavigation(Player player){
		Ent nextBtn = this.getSelectedEnt();
		ArrayList<Ent> btns = new ArrayList<Ent>();
		for(Ent e : this.getEnts()){
			if (e.getName().contains("btn")){
				btns.add(e);
			}
		}
		if (player.getCtrl().isdPadDownJustOn() || player.getCtrl().isAxisJustDown()){
			for(int i=0; i<btns.size(); i++){
				Ent e = btns.get(i);
				if (e.isSelected()){
					int index = i+1;
					if (i==btns.size()-1){
						index = 0;
					}
					nextBtn = btns.get(index);
				}
			}
		}
		else if (player.getCtrl().isdPadUpJustOn() || player.getCtrl().isAxisJustUp()){
			for(int i=0; i<btns.size(); i++){
				Ent e = btns.get(i);
				if (e.isSelected()){
					int index = i-1;
					if (i==0){
						index = btns.size()-1;
					}
					nextBtn = btns.get(index);
				}
			}
		}
		if (!nextBtn.equals(this.getSelectedEnt())){
			Img nonHoverImg = MyGame.getGlobal().getImgByName(this.getSelectedEnt().getImg().getName().replace("_hover", ""));
			if (nonHoverImg != null) this.getSelectedEnt().setImg(nonHoverImg);
			this.getSelectedEnt().setSelected(false);
			
			Img hoverImg = MyGame.getGlobal().getImgByName(nextBtn.getImg().getName()+"_hover");
			if (hoverImg != null) nextBtn.setImg(hoverImg);
			nextBtn.setSelected(true);
		}
	}
	
	public void updateButtonSelection(Player player){
		if (player.getCtrl().isaJustOn()){
			if (this.getSelectedEnt().getName().equals("btnOptions")){
				MyGame.getGlobal().changeMenu("options");
			}
			if (this.getSelectedEnt().getName().equals("btnStart")){
				MyGame.getGlobal().changeMenu("playersetup");
			}
			if (this.getSelectedEnt().getName().equals("btnExit")){
				Gdx.app.exit();
			}
		}
	}
}
