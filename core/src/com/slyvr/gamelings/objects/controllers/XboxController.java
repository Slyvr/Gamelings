package com.slyvr.gamelings.objects.controllers;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.PovDirection;
import com.badlogic.gdx.math.Vector3;

public class XboxController extends GameController{
	
	public static final int BUTTON_X = 2;
    public static final int BUTTON_Y = 3;
    public static final int BUTTON_A = 0;
    public static final int BUTTON_B = 1;
    public static final int BUTTON_BACK = 6;
    public static final int BUTTON_START = 7;
    public static final PovDirection BUTTON_DPAD_UP = PovDirection.north;
    public static final PovDirection BUTTON_DPAD_DOWN = PovDirection.south;
    public static final PovDirection BUTTON_DPAD_RIGHT = PovDirection.east;
    public static final PovDirection BUTTON_DPAD_LEFT = PovDirection.west;
    public static final int BUTTON_LB = 4;
    public static final int BUTTON_L3 = 8;
    public static final int BUTTON_RB = 5;
    public static final int BUTTON_R3 = 9;
    public static final int AXIS_LEFT_X = 1; //-1 is left | +1 is right
    public static final int AXIS_LEFT_Y = 0; //-1 is up | +1 is down
    public static final int AXIS_LEFT_TRIGGER = 4; //value 0 to 1f
    public static final int AXIS_RIGHT_X = 3; //-1 is left | +1 is right
    public static final int AXIS_RIGHT_Y = 2; //-1 is up | +1 is down
    public static final int AXIS_RIGHT_TRIGGER = 4; //value 0 to -1f
	
	public XboxController(Controller ctrl) {
		super(ctrl);
		this.setaCode(BUTTON_A);
		this.setbCode(BUTTON_B);
		this.setxCode(BUTTON_X);
		this.setyCode(BUTTON_Y);
		this.setStartCode(BUTTON_START);
		this.setdPadUp(BUTTON_DPAD_UP);
		this.setdPadDown(BUTTON_DPAD_DOWN);
		this.setdPadLeft(BUTTON_DPAD_LEFT);
		this.setdPadRight(BUTTON_DPAD_RIGHT);
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
		
		return false;
	}
}
