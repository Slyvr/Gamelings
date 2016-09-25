package com.slyvr.gamelings.load;

import java.util.ArrayList;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import com.slyvr.gamelings.objects.Player;
import com.slyvr.gamelings.objects.controllers.GameController;
import com.slyvr.gamelings.objects.controllers.OtherController;
import com.slyvr.gamelings.objects.controllers.XboxController;

public class LoadPlayers {

	public static ArrayList<Player> load(){
		ArrayList<Player> players = new ArrayList<Player>();
		
		int id=0;
		
		for(Controller ctrl : Controllers.getControllers()){
			GameController gCtrl = new GameController(ctrl);
			if (ctrl.getName().toLowerCase().contains("xbox") && ctrl.getName().toLowerCase().contains("ps2") && 
					ctrl.getName().toLowerCase().contains("adapter")){
				gCtrl = new OtherController(ctrl);
				gCtrl.setType("OTHER");
				gCtrl.setId(id);
			}
			else if (ctrl.getName().toLowerCase().contains("ps2")){
				gCtrl = new OtherController(ctrl);
				gCtrl.setType("OTHER");
				gCtrl.setId(id);
			}
			else if (ctrl.getName().toLowerCase().contains("xbox") && ctrl.getName().contains("360")){
				gCtrl = new XboxController(ctrl);
				gCtrl.setType("XBOX");
				gCtrl.setId(id);
			}
			else{
				gCtrl = new OtherController(ctrl);
				gCtrl.setType("OTHER");
				gCtrl.setId(id);
			}
			
			Player player = new Player(id);
			player.setCtrl(gCtrl);
			players.add(player);
			
			id++;
		}
		
		return players;
	}
}
