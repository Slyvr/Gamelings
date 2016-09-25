package com.slyvr.gamelings.objects.controllers;

public class ControllerManager {

	public static GameController getController(GameController ctrl){
		if (ctrl.getType().equals("XBOX")){
			XboxController xbox = (XboxController) ctrl;
			return xbox;
		}
		else{
			OtherController other = (OtherController) ctrl;
			return other;
		}
	}
}
