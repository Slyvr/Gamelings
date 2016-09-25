package com.slyvr.gamelings;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.slyvr.gamelings.load.LoadControllers;
import com.slyvr.gamelings.load.LoadFonts;
import com.slyvr.gamelings.load.LoadImgs;
import com.slyvr.gamelings.load.LoadMenus;
import com.slyvr.gamelings.load.LoadPlayers;
import com.slyvr.gamelings.objects.Global;
import com.slyvr.gamelings.objects.Player;
import com.slyvr.gamelings.updates.UpdateControllers;

public class MyGame extends ApplicationAdapter {
	private static Global global;
	
	@Override
	public void create () {
		global = new Global();
		global.setDefaultScreenWidth(1366);
		global.setDefaultScreenHeight(768);
		global.setImgs(LoadImgs.load());
		global.setFonts(LoadFonts.load());
		global.setMenus(LoadMenus.load());
		global.setCurrentMenu(global.getMenuByName("splash"));
		global.setPlayers(LoadPlayers.load());
//		global.setPlayers(new ArrayList<Player>());
//		for(int i=0; i<4; i++){
//			global.getPlayers().add(new Player(i+1));
//			global.getPlayers().get(i).setAi(true);
//		}
//		global.getPlayers().get(0).setAi(false);
//		LoadControllers.load();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0,0,0,0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		SpriteBatch batch = global.getBatch();
		
		batch.begin();
		
		global.getCurrentMenu().render(batch);
		
		batch.end();
		
		global.getCurrentMenu().update(0);
		
		UpdateControllers.update();
	}
	
	public void resize(int width, int height) {
		global.getViewport().update(width, height);
	}
	
	public static Global getGlobal(){
		return global;
	}
}
