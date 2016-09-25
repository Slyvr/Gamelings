package com.slyvr.gamelings.load;

import java.util.ArrayList;

import com.slyvr.gamelings.objects.Menu;
import com.slyvr.gamelings.objects.menus.GameSelectMenu;
import com.slyvr.gamelings.objects.menus.MainMenu;
import com.slyvr.gamelings.objects.menus.OptionsMenu;
import com.slyvr.gamelings.objects.menus.PlatformBattleMenu;
import com.slyvr.gamelings.objects.menus.PlayerSetupMenu;
import com.slyvr.gamelings.objects.menus.SplashMenu;

/**
 * This class loads the in game menu screens and populates them with 
 * all the entities and where they're lcoated
 * @author Matt Schrum - slyvr89
 * @date 10/25/2013
 */
public class LoadMenus {

	public static ArrayList<Menu> load(){
		ArrayList<Menu> menus = new ArrayList<Menu>();
		
		menus.add(new SplashMenu());
		menus.add(new MainMenu());
		menus.add(new OptionsMenu());
		menus.add(new GameSelectMenu());
		menus.add(new PlayerSetupMenu());
		menus.add(new PlatformBattleMenu());
		
		return menus;
	}
}
