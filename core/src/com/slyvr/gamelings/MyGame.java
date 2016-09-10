package com.slyvr.gamelings;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.slyvr.gamelings.load.LoadImgs;
import com.slyvr.gamelings.load.LoadMenus;
import com.slyvr.gamelings.objects.Global;

public class MyGame extends ApplicationAdapter {
	private static Global global;
	
	@Override
	public void create () {
		global = new Global();
		global.setDefaultScreenWidth(1366);
		global.setDefaultScreenHeight(768);
		global.setImgs(LoadImgs.load());
		global.setMenus(LoadMenus.load());
		global.setCurrentMenu(global.getMenuByName("splash"));
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
	}
	
	public void resize(int width, int height) {
		global.getViewport().update(width, height);
	}
	
	public static Global getGlobal(){
		return global;
	}
}
