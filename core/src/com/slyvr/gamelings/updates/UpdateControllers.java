package com.slyvr.gamelings.updates;

import com.slyvr.gamelings.MyGame;
import com.slyvr.gamelings.objects.Player;

public class UpdateControllers {

	public static void update(){
		for(Player player : MyGame.getGlobal().getPlayers()){
			player.getCtrl().setaJustOn(false);
			player.getCtrl().setbJustOn(false);
			player.getCtrl().setxJustOn(false);
			player.getCtrl().setyJustOn(false);
			player.getCtrl().setStartJustOn(false);
			player.getCtrl().setdPadUpJustOn(false);
			player.getCtrl().setdPadDownJustOn(false);
			player.getCtrl().setdPadLeftJustOn(false);
			player.getCtrl().setdPadRightJustOn(false);
			player.getCtrl().setAxisJustUp(false);
			player.getCtrl().setAxisJustDown(false);
			player.getCtrl().setAxisJustLeft(false);
			player.getCtrl().setAxisJustRight(false);
		}
	}
}
