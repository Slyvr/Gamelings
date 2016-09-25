package com.slyvr.gamelings.objects.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.slyvr.gamelings.MyGame;
import com.slyvr.gamelings.objects.Ent;
import com.slyvr.gamelings.objects.Menu;
import com.slyvr.gamelings.objects.Player;
import com.slyvr.gamelings.objects.controllers.GameController;

public class PlayerSetupMenu extends Menu{
	
	public PlayerSetupMenu(){
		load();
	}
	
	public void load(){
		this.setName("playersetup");
		
		ArrayList<Ent> ents = new ArrayList<Ent>();
		
		int playerBoxWidth = 500;
		int playerBoxHeight = 300;
		
		Ent p1Bg = new Ent();
		p1Bg.setName("p1Bg");
		p1Bg.setImg(MyGame.getGlobal().getImgByName("whitecover"));
		p1Bg.setPosBox(new Rectangle((Gdx.graphics.getWidth()/2)-playerBoxWidth - 15,
				(Gdx.graphics.getHeight()/2)+ 15,
				playerBoxWidth,
				playerBoxHeight));
		ents.add(p1Bg);
		
		Ent p1Title = new Ent();
		p1Title.setName("p1Title");
		p1Title.setFont(MyGame.getGlobal().getFontByName("Consolas32"));
		p1Title.setText("Player 1");
		p1Title.setPosBox(new Rectangle(p1Bg.getPosBox().getX() + 5,
				p1Bg.getPosBox().getY() + playerBoxHeight - 10,
				0,0));
		p1Title.setColor(Color.BLUE);
		ents.add(p1Title);
		
		Ent p1Data = new Ent();
		p1Data.setName("p1Data");
		p1Data.setFont(MyGame.getGlobal().getFontByName("Consolas16"));
		p1Data.setText("Test");
		p1Data.setPosBox(new Rectangle(p1Bg.getPosBox().getX() + 5,
				p1Bg.getPosBox().getY() + playerBoxHeight - 110,
				0,0));
		p1Data.setColor(Color.BLUE);
		ents.add(p1Data);
		
		Ent p2Bg = new Ent();
		p2Bg.setName("p2Bg");
		p2Bg.setImg(MyGame.getGlobal().getImgByName("whitecover"));
		p2Bg.setPosBox(new Rectangle((Gdx.graphics.getWidth()/2)+ 15,
				(Gdx.graphics.getHeight()/2)+ 15,
				playerBoxWidth,
				playerBoxHeight));
		ents.add(p2Bg);
		
		Ent p2Title = new Ent();
		p2Title.setName("p2Title");
		p2Title.setFont(MyGame.getGlobal().getFontByName("Consolas32"));
		p2Title.setText("Player 2");
		p2Title.setPosBox(new Rectangle(p2Bg.getPosBox().getX() + 5,
				p2Bg.getPosBox().getY() + playerBoxHeight - 10,
				0,0));
		p2Title.setColor(Color.BLUE);
		ents.add(p2Title);
		
		Ent p2Data = new Ent();
		p2Data.setName("p2Data");
		p2Data.setFont(MyGame.getGlobal().getFontByName("Consolas16"));
		p2Data.setText("Test");
		p2Data.setPosBox(new Rectangle(p2Bg.getPosBox().getX() + 5,
				p2Bg.getPosBox().getY() + playerBoxHeight - 110,
				0,0));
		p2Data.setColor(Color.BLUE);
		ents.add(p2Data);
		
		Ent p3Bg = new Ent();
		p3Bg.setName("p3Bg");
		p3Bg.setImg(MyGame.getGlobal().getImgByName("whitecover"));
		p3Bg.setPosBox(new Rectangle((Gdx.graphics.getWidth()/2)-playerBoxWidth - 15,
				(Gdx.graphics.getHeight()/2)-playerBoxHeight - 15,
				playerBoxWidth,
				playerBoxHeight));
		ents.add(p3Bg);
		
		Ent p3Title = new Ent();
		p3Title.setName("p3Title");
		p3Title.setFont(MyGame.getGlobal().getFontByName("Consolas32"));
		p3Title.setText("Player 3");
		p3Title.setPosBox(new Rectangle(p3Bg.getPosBox().getX() + 5,
				p3Bg.getPosBox().getY() + playerBoxHeight - 10,
				0,0));
		p3Title.setColor(Color.BLUE);
		ents.add(p3Title);
		
		Ent p3Data = new Ent();
		p3Data.setName("p3Data");
		p3Data.setFont(MyGame.getGlobal().getFontByName("Consolas16"));
		p3Data.setText("Test");
		p3Data.setPosBox(new Rectangle(p3Bg.getPosBox().getX() + 5,
				p3Bg.getPosBox().getY() + playerBoxHeight - 110,
				0,0));
		p3Data.setColor(Color.BLUE);
		ents.add(p3Data);
		
		Ent p4Bg = new Ent();
		p4Bg.setName("p4Bg");
		p4Bg.setImg(MyGame.getGlobal().getImgByName("whitecover"));
		p4Bg.setPosBox(new Rectangle((Gdx.graphics.getWidth()/2)+ 15,
				(Gdx.graphics.getHeight()/2)-playerBoxHeight - 15,
				playerBoxWidth,
				playerBoxHeight));
		ents.add(p4Bg);
		
		Ent p4Title = new Ent();
		p4Title.setName("p4Title");
		p4Title.setFont(MyGame.getGlobal().getFontByName("Consolas32"));
		p4Title.setText("Player 4");
		p4Title.setPosBox(new Rectangle(p4Bg.getPosBox().getX() + 5,
				p4Bg.getPosBox().getY() + playerBoxHeight - 10,
				0,0));
		p4Title.setColor(Color.BLUE);
		ents.add(p4Title);
		
		Ent p4Data = new Ent();
		p4Data.setName("p4Data");
		p4Data.setFont(MyGame.getGlobal().getFontByName("Consolas16"));
		p4Data.setText("Test");
		p4Data.setPosBox(new Rectangle(p4Bg.getPosBox().getX() + 5,
				p4Bg.getPosBox().getY() + playerBoxHeight - 110,
				0,0));
		p4Data.setColor(Color.BLUE);
		ents.add(p4Data);
		
		Ent btnStart = new Ent();
		btnStart.setName("btnStart");
		btnStart.setImg(MyGame.getGlobal().getImgByName("btnStart"));
		btnStart.setPosBox(new Rectangle(Gdx.graphics.getWidth() - btnStart.getImg().getTex().getWidth() - 50,
				0+15,
				btnStart.getImg().getTex().getWidth(),
				btnStart.getImg().getTex().getHeight()));
		btnStart.setSelected(true);
		ents.add(btnStart);
		
		Ent btnBack = new Ent();
		btnBack.setName("btnBack");
		btnBack.setImg(MyGame.getGlobal().getImgByName("btnBack"));
		btnBack.setPosBox(new Rectangle(50,
				0+15,
				btnBack.getImg().getTex().getWidth(),
				btnBack.getImg().getTex().getHeight()));
		ents.add(btnBack);
		
		this.setEnts(ents);
	}
	
	public void update(float stateTime){
		if(!this.isAnimating()){
			updateButtons();
		}
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
						if (e.getName().equals("btnStart")){
							MyGame.getGlobal().changeMenu("gameselect");
						}
					}
				}
			}
		}
		for(Player player : MyGame.getGlobal().getPlayers()){
			if (player.getCtrl() != null){
				updateButtonSelection(player);
			}
		}
	}
	
	public void updateButtonSelection(Player player){
		if (player.getCtrl().isStartJustOn()){
			MyGame.getGlobal().changeMenu("gameselect");
		}
		else if (player.getCtrl().isbJustOn()){
			MyGame.getGlobal().changeMenu("previous");
		}
	}
}
