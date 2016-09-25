package com.slyvr.gamelings.objects.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.slyvr.gamelings.MyGame;
import com.slyvr.gamelings.objects.Ent;
import com.slyvr.gamelings.objects.Menu;
import com.slyvr.gamelings.objects.Player;
import com.slyvr.gamelings.objects.games.PlatformBattle;

public class GameSelectMenu extends Menu{
	
	private Ent[] gameselects;
	
	public GameSelectMenu(){
		load();
	}
	
	public void load(){
		this.setName("gameselect");
		
		ArrayList<Ent> ents = new ArrayList<Ent>();
		
		gameselects = new Ent[5];
		
		Ent selectPlatformBattle = new Ent();
		selectPlatformBattle.setName("selectPlatformBattle");
		selectPlatformBattle.setImg(MyGame.getGlobal().getImgByName("platformbattle_select"));
		selectPlatformBattle.setPosBox(new Rectangle((Gdx.graphics.getWidth()/2)-(selectPlatformBattle.getImg().getTex().getWidth()/2),
				(Gdx.graphics.getHeight()/2)-(selectPlatformBattle.getImg().getTex().getHeight()/2),
				selectPlatformBattle.getImg().getTex().getWidth(),
				selectPlatformBattle.getImg().getTex().getHeight()));
		gameselects[2] = selectPlatformBattle;
		
		Ent selectTankRace = new Ent();
		selectTankRace.setName("selectTankRace");
		selectTankRace.setImg(MyGame.getGlobal().getImgByName("tankrace_select"));
		selectTankRace.setPosBox(new Rectangle(selectPlatformBattle.getPosBox().getX() - selectTankRace.getImg().getTex().getWidth() - 20,
				(Gdx.graphics.getHeight()/2)-(selectTankRace.getImg().getTex().getHeight()/2),
				selectTankRace.getImg().getTex().getWidth(),
				selectTankRace.getImg().getTex().getHeight()));
		selectTankRace.setColor(new Color(1,1,1,0.5f));
		gameselects[1] = selectTankRace;
		
		Ent selectComingSoon0 = new Ent();
		selectComingSoon0.setName("selectComingSoon0");
		selectComingSoon0.setImg(MyGame.getGlobal().getImgByName("morecomingsoon_select"));
		selectComingSoon0.setPosBox(new Rectangle(selectTankRace.getPosBox().getX() - selectComingSoon0.getImg().getTex().getWidth() - 20,
				(Gdx.graphics.getHeight()/2)-(selectComingSoon0.getImg().getTex().getHeight()/2),
				selectComingSoon0.getImg().getTex().getWidth(),
				selectComingSoon0.getImg().getTex().getHeight()));
		selectComingSoon0.setColor(new Color(1,1,1,0.5f));
		gameselects[0] = selectComingSoon0;

		Ent selectSoccer = new Ent();
		selectSoccer.setName("selectSoccer");
		selectSoccer.setImg(MyGame.getGlobal().getImgByName("soccer_select"));
		selectSoccer.setPosBox(new Rectangle(selectPlatformBattle.getPosBox().getX() + selectSoccer.getImg().getTex().getWidth() + 20,
				(Gdx.graphics.getHeight()/2)-(selectSoccer.getImg().getTex().getHeight()/2),
				selectSoccer.getImg().getTex().getWidth(),
				selectSoccer.getImg().getTex().getHeight()));
		selectSoccer.setColor(new Color(1,1,1,0.5f));
		gameselects[3] = selectSoccer;
		
		Ent selectComingSoon1 = new Ent();
		selectComingSoon1.setName("selectComingSoon1");
		selectComingSoon1.setImg(MyGame.getGlobal().getImgByName("morecomingsoon_select"));
		selectComingSoon1.setPosBox(new Rectangle(selectSoccer.getPosBox().getX() + selectComingSoon1.getImg().getTex().getWidth() + 20,
				(Gdx.graphics.getHeight()/2)-(selectComingSoon1.getImg().getTex().getHeight()/2),
				selectComingSoon1.getImg().getTex().getWidth(),
				selectComingSoon1.getImg().getTex().getHeight()));
		selectComingSoon1.setColor(new Color(1,1,1,0.5f));
		gameselects[4] = selectComingSoon1;
		
		Ent btnGameSelectNext = new Ent();
		btnGameSelectNext.setName("btnGameSelectNext");
		btnGameSelectNext.setImg(MyGame.getGlobal().getImgByName("btnGameSelect"));
		btnGameSelectNext.setPosBox(new Rectangle(selectPlatformBattle.getPosBox().getX() + btnGameSelectNext.getImg().getTex().getWidth() + 20,
				(Gdx.graphics.getHeight()/2)-(btnGameSelectNext.getImg().getTex().getHeight()/2),
				btnGameSelectNext.getImg().getTex().getWidth(),
				btnGameSelectNext.getImg().getTex().getHeight()));
		btnGameSelectNext.setColor(new Color(0,0,0,0));
		ents.add(btnGameSelectNext);
		
		Ent btnGameSelectPrev = new Ent();
		btnGameSelectPrev.setName("btnGameSelectPrev");
		btnGameSelectPrev.setImg(MyGame.getGlobal().getImgByName("btnGameSelect"));
		btnGameSelectPrev.setPosBox(new Rectangle(selectPlatformBattle.getPosBox().getX() - btnGameSelectPrev.getImg().getTex().getWidth() - 20,
				(Gdx.graphics.getHeight()/2)-(btnGameSelectPrev.getImg().getTex().getHeight()/2),
				btnGameSelectPrev.getImg().getTex().getWidth(),
				btnGameSelectPrev.getImg().getTex().getHeight()));
		btnGameSelectPrev.setColor(new Color(0,0,0,0));
		ents.add(btnGameSelectPrev);
		
		Ent btnStart = new Ent();
		btnStart.setName("btnStart");
		btnStart.setImg(MyGame.getGlobal().getImgByName("btnStart"));
		btnStart.setPosBox(new Rectangle(Gdx.graphics.getWidth() - btnStart.getImg().getTex().getWidth() - 50,
				0+15,
				btnStart.getImg().getTex().getWidth(),
				btnStart.getImg().getTex().getHeight()));
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
	
	public void render(SpriteBatch batch){
		for(int i=0; i<gameselects.length-1; i++){
			gameselects[i].render(batch);
		}
		
		super.render(batch);
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
						if (e.getName().contains("btnGameSelectPrev")){
							shiftGamesRight();
						}
						if (e.getName().contains("btnGameSelectNext")){
							shiftGamesLeft();
						}
						if (e.getName().contains("btnStart")){
							startGame();
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
	
	public void shiftGamesRight(){
		// save off first element
		Rectangle nextPosBoxForLast = new Rectangle(gameselects[0].getPosBox());
		Ent last = gameselects[gameselects.length - 1];
        // shift right
        for( int index =gameselects.length-2; index >= 0 ; index-- ){
        	Rectangle nextPosBox = new Rectangle(gameselects[index+1].getPosBox());
        	gameselects[index+1] = gameselects [index];
        	gameselects[index+1].setNextPosBox(nextPosBox);
        	gameselects[index+1].getColor().a = 0.5f;
        }
        // wrap last element into first slot
        gameselects[0] = last;
        gameselects[0].setNextPosBox(nextPosBoxForLast);
        gameselects[2].getColor().a = 1;
        
        for(int i=0; i<gameselects.length; i++){
        	gameselects[i].setPosBox(gameselects[i].getNextPosBox());
        	gameselects[i].setNextPosBox(null);
        }
	}
	
	public void shiftGamesLeft(){
		// save off first element
		Rectangle nextPosBoxForFirst = new Rectangle(gameselects[gameselects.length-1].getPosBox());
		Ent first = gameselects[0];
        // shift right
        for( int index = 1; index <= gameselects.length-1 ; index++ ){
        	Rectangle nextPosBox = new Rectangle(gameselects[index-1].getPosBox());
        	gameselects[index-1] = gameselects [index];
        	gameselects[index-1].setNextPosBox(nextPosBox);
        	gameselects[index-1].getColor().a = 0.5f;
        }
        // wrap last element into first slot
        gameselects[gameselects.length-1] = first;
        gameselects[gameselects.length-1].setNextPosBox(nextPosBoxForFirst);
        gameselects[2].getColor().a = 1;
        
        for(int i=0; i<gameselects.length; i++){
        	gameselects[i].setPosBox(gameselects[i].getNextPosBox());
        	gameselects[i].setNextPosBox(null);
        }
	}
	
	public void updateButtonSelection(Player player){
		if (player.getCtrl().isaJustOn()){
			startGame();
		}
		else if (player.getCtrl().isbJustOn()){
			MyGame.getGlobal().changeMenu("previous");
		}
		else if (player.getCtrl().isdPadLeftJustOn() || player.getCtrl().isAxisJustLeft()){
			shiftGamesRight();
		}
		else if (player.getCtrl().isdPadRightJustOn() || player.getCtrl().isAxisJustRight()){
			shiftGamesLeft();
		}
	}
	
	public void startGame(){
		//Get the selected game and start a game instance
		if (gameselects[2].getName().equals("selectPlatformBattle")){
			MyGame.getGlobal().setGame(new PlatformBattle());
			MyGame.getGlobal().changeMenu("game_platformbattle");
		}
	}
}
