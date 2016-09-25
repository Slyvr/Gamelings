package com.slyvr.gamelings.load;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.slyvr.gamelings.objects.Img;

/**
 * This class creates new Img classes to an arraylist containing a searchable name and the image data
 * @author Matt Schrum - slyvr89
 * @date 10/25/2013
 */
public class LoadImgs {

	public static ArrayList<Img> load(){
		ArrayList<Img> imgs = new ArrayList<Img>();
		
		//LOGOS
		imgs.add(new Img(new Texture(Gdx.files.internal("data/logos/logo.png")),"logo"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/logos/logoSlyvrOnline.png")),"logoSlyvrOnline"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/logos/logoSlyvrOnlineCredits.png")),"logoSlyvrOnlineCredits"));
		
		//MENU ITEMS
		imgs.add(new Img(new Texture(Gdx.files.internal("data/menuitems/platformbattle_select.png")),"platformbattle_select"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/menuitems/tankrace_select.png")),"tankrace_select"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/menuitems/soccer_select.png")),"soccer_select"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/menuitems/morecomingsoon_select.png")),"morecomingsoon_select"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/imgs/whitecover.png")),"whitecover"));
		
		//BUTTONS
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnGameSelect.png")),"btnGameSelect"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnLoad.png")),"btnLoad"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnLoad_hover.png")),"btnLoad_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnNewGame.png")),"btnNewGame"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnNewGame_hover.png")),"btnNewGame_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnOptions.png")),"btnOptions"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnOptions_hover.png")),"btnOptions_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnExit.png")),"btnExit"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnExit_hover.png")),"btnExit_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnBack.png")),"btnBack"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnBack_hover.png")),"btnBack_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnFullscreen.png")),"btnFullscreen"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnFullscreen_hover.png")),"btnFullscreen_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnAudio.png")),"btnAudio"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnAudio_hover.png")),"btnAudio_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnVideo.png")),"btnVideo"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnVideo_hover.png")),"btnVideo_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnSave.png")),"btnSave"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnSave_hover.png")),"btnSave_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnSave1.png")),"btnSave1"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnSave1_hover.png")),"btnSave1_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnSave2.png")),"btnSave2"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnSave2_hover.png")),"btnSave2_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnSave3.png")),"btnSave3"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnSave3_hover.png")),"btnSave3_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnNext.png")),"btnNext"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnNext_hover.png")),"btnNext_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnPrev.png")),"btnPrev"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnPrev_hover.png")),"btnPrev_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnRandomize.png")),"btnRandomize"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnCreate.png")),"btnCreate"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnCreate_hover.png")),"btnCreate_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnCredits.png")),"btnCredits"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnCredits_hover.png")),"btnCredits_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnStart.png")),"btnStart"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnStart_hover.png")),"btnStart_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnReturn.png")),"btnReturn"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnReturn_hover.png")),"btnReturn_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnMainMenu.png")),"btnMainMenu"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnMainMenu_hover.png")),"btnMainMenu_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnBar.png")),"btnBar"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnSlider.png")),"btnSlider"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnShip.png")),"btnShip"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnShip_hover.png")),"btnShip_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnCrew.png")),"btnCrew"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnCrew_hover.png")),"btnCrew_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnCraft.png")),"btnCraft"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnCraft_hover.png")),"btnCraft_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnDeconstruct.png")),"btnDeconstruct"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnDeconstruct_hover.png")),"btnDeconstruct_hover"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnRandomizeText.png")),"btnRandomizeText"));
		imgs.add(new Img(new Texture(Gdx.files.internal("data/btns/btnRandomizeText_hover.png")),"btnRandomizeText_hover"));

		return imgs;
	}
	
	public static TextureRegion[] generateTextureRegions(String datapath){
		TextureRegion[] regions = new TextureRegion[12];
		
		regions[0] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),28,0,24,32);
		regions[1] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),52,0,24,32);
		regions[2] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),76,0,24,32);
		
		regions[3] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),28,32,24,32);
		regions[4] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),52,32,24,32);
		regions[5] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),76,32,24,32);
		
		regions[6] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),28,64,24,32);
		regions[7] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),52,64,24,32);
		regions[8] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),76,64,24,32);
		
		regions[9] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),28,96,24,32);
		regions[10] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),52,96,24,32);
		regions[11] = new TextureRegion(new Texture(Gdx.files.internal(datapath)),76,96,24,32);
		
		return regions;
	}
}
