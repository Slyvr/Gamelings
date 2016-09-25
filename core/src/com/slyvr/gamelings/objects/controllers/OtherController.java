package com.slyvr.gamelings.objects.controllers;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.PovDirection;

public class OtherController extends GameController{

	public static final int BUTTON_X = 2;
    public static final int BUTTON_Y = 3;
    public static final int BUTTON_A = 0;
    public static final int BUTTON_B = 1;
    public static final int BUTTON_START = 7;
    public static final int BUTTON_DPAD_UP = 11;
    public static final int BUTTON_DPAD_DOWN = 10;
    public static final int BUTTON_DPAD_RIGHT = 9;
    public static final int BUTTON_DPAD_LEFT = 8;
    public static final int AXIS_LEFT_X = 1; //-1 is left | +1 is right
    public static final int AXIS_LEFT_Y = 0; //-1 is up | +1 is down
	
	public OtherController(Controller ctrl) {
		super(ctrl);
		this.setaCode(BUTTON_A);
		this.setbCode(BUTTON_B);
		this.setxCode(BUTTON_X);
		this.setyCode(BUTTON_Y);
		this.setStartCode(BUTTON_START);
		this.setdPadIntUp(BUTTON_DPAD_UP);
		this.setdPadIntDown(BUTTON_DPAD_DOWN);
		this.setdPadIntLeft(BUTTON_DPAD_LEFT);
		this.setdPadIntRight(BUTTON_DPAD_RIGHT);
		this.setAxisXCode(AXIS_LEFT_X);
		this.setAxisYCode(AXIS_LEFT_Y);
	}

	@Override
	public void connected(Controller controller) {
		super.connected(controller);
	}

	@Override
	public void disconnected(Controller controller) {
		super.disconnected(controller);
	}

	@Override
	public boolean buttonDown(Controller controller, int buttonCode) {
		super.buttonDown(controller, buttonCode);
		//System.out.println(buttonCode);
		return false;
	}

	@Override
	public boolean buttonUp(Controller controller, int buttonCode) {
		super.buttonUp(controller, buttonCode);
		return false;
	}

	@Override
	public boolean axisMoved(Controller controller, int axisCode, float value) {
		super.axisMoved(controller, axisCode, value);
		return false;
	}

	@Override
	public boolean povMoved(Controller controller, int povCode, PovDirection value) {
		//DPad
		super.povMoved(controller, povCode, value);
		//System.out.println(povCode+" : "+value);
		return false;
	}
}
