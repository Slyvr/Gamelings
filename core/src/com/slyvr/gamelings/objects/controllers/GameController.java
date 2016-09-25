package com.slyvr.gamelings.objects.controllers;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.ControllerListener;
import com.badlogic.gdx.controllers.PovDirection;
import com.badlogic.gdx.math.Vector3;
import com.slyvr.gamelings.MyGame;

public class GameController implements ControllerListener {

	private int id;
	private Controller ctrl;
	private String type;
	private boolean btnDown;
	
	private int aCode;
	private int bCode;
	private int xCode;
	private int yCode;
	private int startCode;
	private PovDirection dPadUp;
	private PovDirection dPadDown;
	private PovDirection dPadLeft;
	private PovDirection dPadRight;
	private int dPadIntUp;
	private int dPadIntDown;
	private int dPadIntLeft;
	private int dPadIntRight;
	private int axisXCode;
	private int axisYCode;
	
	private boolean aOn;
	private boolean bOn;
	private boolean xOn;
	private boolean yOn;
	private boolean startOn;
	private boolean dPadUpOn;
	private boolean dPadDownOn;
	private boolean dPadLeftOn;
	private boolean dPadRightOn;
	
	private boolean aJustOn;
	private boolean bJustOn;
	private boolean xJustOn;
	private boolean yJustOn;
	private boolean startJustOn;
	private boolean dPadUpJustOn;
	private boolean dPadDownJustOn;
	private boolean dPadLeftJustOn;
	private boolean dPadRightJustOn;
	
	private float axisX;
	private float axisY;
	
	private boolean axisDown;
	private boolean axisUp;
	private boolean axisLeft;
	private boolean axisRight;
	
	private boolean axisJustDown;
	private boolean axisJustUp;
	private boolean axisJustLeft;
	private boolean axisJustRight;
	
	public GameController(Controller ctrl){
		this.ctrl = ctrl;
		this.ctrl.addListener(this);
	}
	
	@Override
	public void connected(Controller controller) {
		
	}

	@Override
	public void disconnected(Controller controller) {
		
	}

	@Override
	public boolean buttonDown(Controller controller, int buttonCode) {
		this.setBtnDown(true);
		
		if (buttonCode == aCode){
			aJustOn = !aOn;
			aOn = true;
		}
		else if (buttonCode == bCode){
			bJustOn = !bOn;
			bOn = true;
		}
		else if (buttonCode == xCode){
			xJustOn = !xOn;
			xOn = true;
		}
		else if (buttonCode == yCode){
			yJustOn = !yOn;
			yOn = true;
		}
		else if (buttonCode == startCode){
			startJustOn = !startOn;
			startOn = true;
		}
		else if (buttonCode == dPadIntUp){
			dPadUpJustOn = !dPadUpOn;
			dPadUpOn = true;
		}
		else if (buttonCode == dPadIntDown){
			dPadDownJustOn = !dPadDownOn;
			dPadDownOn = true;
		}
		else if (buttonCode == dPadIntLeft){
			dPadLeftJustOn = !dPadLeftOn;
			dPadLeftOn = true;
		}
		else if (buttonCode == dPadIntRight){
			dPadRightJustOn = !dPadRightOn;
			dPadRightOn = true;
		}
		
		return false;
	}

	@Override
	public boolean buttonUp(Controller controller, int buttonCode) {
		this.setBtnDown(false);
		
		if (buttonCode == aCode){
			aOn = false;
			aJustOn = false;
		}
		else if (buttonCode == bCode){
			bOn = false;
			bJustOn = false;
		}
		else if (buttonCode == xCode){
			xOn = false;
			xJustOn = false;
		}
		else if (buttonCode == yCode){
			yOn = false;
			yJustOn = false;
		}
		else if (buttonCode == startCode){
			startOn = false;
			startJustOn = false;
		}
		else if (buttonCode == dPadIntUp){
			dPadUpOn = false;
			dPadUpJustOn = false;
		}
		else if (buttonCode == dPadIntDown){
			dPadDownOn = false;
			dPadDownJustOn = false;
		}
		else if (buttonCode == dPadIntLeft){
			dPadLeftOn = false;
			dPadLeftJustOn = false;
		}
		else if (buttonCode == dPadIntRight){
			dPadRightOn = false;
			dPadRightJustOn = false;
		}
		
		return false;
	}

	@Override
	public boolean axisMoved(Controller controller, int axisCode, float value) {
		
		if (axisCode == axisXCode){
			axisX = value;
		}
		if (axisCode == axisYCode){
			axisY = value;
		}
		
		if (axisX < -0.5f){
			if (!axisLeft){ axisJustLeft = true; }
			else { axisJustLeft = false; }
			axisLeft = true;
		}
		else{
			axisLeft = false;
		}
		
		if (axisX > 0.5f){
			if (!axisRight){ axisJustRight = true; }
			else { axisJustRight = false; }
			axisRight = true;
		}
		else{
			axisRight = false;
		}
		
		if (axisY < -0.5f){
			if (!axisUp){ axisJustUp = true; }
			else { axisJustUp = false; }
			axisUp = true;
		}
		else{
			axisUp = false;
		}
		
		if (axisY > 0.5f){
			if (!axisDown){ axisJustDown = true; }
			else { axisJustDown = false; }
			axisDown = true;
		}
		else{
			axisDown = false;
		}
		
		return false;
	}

	@Override
	public boolean povMoved(Controller controller, int povCode, PovDirection value) {
		
		if (value == dPadUp){
			dPadUpJustOn = !dPadUpOn;
			dPadUpOn = true;
		}
		else {
			dPadUpOn = false;
			dPadUpJustOn = false;
		}
		if (value == dPadDown){
			dPadDownJustOn = !dPadDownOn;
			dPadDownOn = true;
		}
		else{
			dPadDownOn = false;
			dPadDownJustOn = false;
		}
		if (value == dPadLeft){
			dPadLeftJustOn = !dPadLeftOn;
			dPadLeftOn = true;
		}
		else{
			dPadLeftOn = false;
			dPadLeftJustOn = false;
		}
		if (value == dPadRight){
			dPadRightJustOn = !dPadRightOn;
			dPadRightOn = true;
		}
		else{
			dPadRightOn = false;
			dPadRightJustOn = false;
		}
		
		return false;
	}

	@Override
	public boolean xSliderMoved(Controller controller, int sliderCode, boolean value) {
		
		return false;
	}

	@Override
	public boolean ySliderMoved(Controller controller, int sliderCode, boolean value) {
		
		return false;
	}

	@Override
	public boolean accelerometerMoved(Controller controller, int accelerometerCode, Vector3 value) {
		
		return false;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Controller getCtrl() {
		return ctrl;
	}
	public void setCtrl(Controller ctrl) {
		this.ctrl = ctrl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isBtnDown() {
		return btnDown;
	}
	public void setBtnDown(boolean btnDown) {
		this.btnDown = btnDown;
	}
	public int getaCode() {
		return aCode;
	}
	public void setaCode(int aCode) {
		this.aCode = aCode;
	}
	public int getbCode() {
		return bCode;
	}
	public void setbCode(int bCode) {
		this.bCode = bCode;
	}
	public int getxCode() {
		return xCode;
	}
	public void setxCode(int xCode) {
		this.xCode = xCode;
	}
	public int getyCode() {
		return yCode;
	}
	public void setyCode(int yCode) {
		this.yCode = yCode;
	}
	public int getStartCode() {
		return startCode;
	}
	public void setStartCode(int startCode) {
		this.startCode = startCode;
	}
	public PovDirection getdPadUp() {
		return dPadUp;
	}
	public void setdPadUp(PovDirection dPadUp) {
		this.dPadUp = dPadUp;
	}
	public PovDirection getdPadDown() {
		return dPadDown;
	}
	public void setdPadDown(PovDirection dPadDown) {
		this.dPadDown = dPadDown;
	}
	public PovDirection getdPadLeft() {
		return dPadLeft;
	}
	public void setdPadLeft(PovDirection dPadLeft) {
		this.dPadLeft = dPadLeft;
	}
	public PovDirection getdPadRight() {
		return dPadRight;
	}
	public void setdPadRight(PovDirection dPadRight) {
		this.dPadRight = dPadRight;
	}
	public int getdPadIntUp() {
		return dPadIntUp;
	}
	public void setdPadIntUp(int dPadIntUp) {
		this.dPadIntUp = dPadIntUp;
	}
	public int getdPadIntDown() {
		return dPadIntDown;
	}
	public void setdPadIntDown(int dPadIntDown) {
		this.dPadIntDown = dPadIntDown;
	}
	public int getdPadIntLeft() {
		return dPadIntLeft;
	}
	public void setdPadIntLeft(int dPadIntLeft) {
		this.dPadIntLeft = dPadIntLeft;
	}
	public int getdPadIntRight() {
		return dPadIntRight;
	}
	public void setdPadIntRight(int dPadIntRight) {
		this.dPadIntRight = dPadIntRight;
	}
	public int getAxisXCode() {
		return axisXCode;
	}
	public void setAxisXCode(int axisXCode) {
		this.axisXCode = axisXCode;
	}
	public int getAxisYCode() {
		return axisYCode;
	}
	public void setAxisYCode(int axisYCode) {
		this.axisYCode = axisYCode;
	}
	public boolean isaOn() {
		return aOn;
	}
	public void setaOn(boolean aOn) {
		this.aOn = aOn;
	}
	public boolean isbOn() {
		return bOn;
	}
	public void setbOn(boolean bOn) {
		this.bOn = bOn;
	}
	public boolean isxOn() {
		return xOn;
	}
	public void setxOn(boolean xOn) {
		this.xOn = xOn;
	}
	public boolean isyOn() {
		return yOn;
	}
	public void setyOn(boolean yOn) {
		this.yOn = yOn;
	}
	public boolean isStartOn() {
		return startOn;
	}
	public void setStartOn(boolean startOn) {
		this.startOn = startOn;
	}
	public boolean isdPadUpOn() {
		return dPadUpOn;
	}
	public void setdPadUpOn(boolean dPadUpOn) {
		this.dPadUpOn = dPadUpOn;
	}
	public boolean isdPadDownOn() {
		return dPadDownOn;
	}
	public void setdPadDownOn(boolean dPadDownOn) {
		this.dPadDownOn = dPadDownOn;
	}
	public boolean isdPadLeftOn() {
		return dPadLeftOn;
	}
	public void setdPadLeftOn(boolean dPadLeftOn) {
		this.dPadLeftOn = dPadLeftOn;
	}
	public boolean isdPadRightOn() {
		return dPadRightOn;
	}
	public void setdPadRightOn(boolean dPadRightOn) {
		this.dPadRightOn = dPadRightOn;
	}
	public boolean isaJustOn() {
		return aJustOn;
	}
	public void setaJustOn(boolean aJustOn) {
		this.aJustOn = aJustOn;
	}
	public boolean isbJustOn() {
		return bJustOn;
	}
	public void setbJustOn(boolean bJustOn) {
		this.bJustOn = bJustOn;
	}
	public boolean isxJustOn() {
		return xJustOn;
	}
	public void setxJustOn(boolean xJustOn) {
		this.xJustOn = xJustOn;
	}
	public boolean isyJustOn() {
		return yJustOn;
	}
	public void setyJustOn(boolean yJustOn) {
		this.yJustOn = yJustOn;
	}
	public boolean isStartJustOn() {
		return startJustOn;
	}
	public void setStartJustOn(boolean startJustOn) {
		this.startJustOn = startJustOn;
	}
	public boolean isdPadUpJustOn() {
		return dPadUpJustOn;
	}
	public void setdPadUpJustOn(boolean dPadUpJustOn) {
		this.dPadUpJustOn = dPadUpJustOn;
	}
	public boolean isdPadDownJustOn() {
		return dPadDownJustOn;
	}
	public void setdPadDownJustOn(boolean dPadDownJustOn) {
		this.dPadDownJustOn = dPadDownJustOn;
	}
	public boolean isdPadLeftJustOn() {
		return dPadLeftJustOn;
	}
	public void setdPadLeftJustOn(boolean dPadLeftJustOn) {
		this.dPadLeftJustOn = dPadLeftJustOn;
	}
	public boolean isdPadRightJustOn() {
		return dPadRightJustOn;
	}
	public void setdPadRightJustOn(boolean dPadRightJustOn) {
		this.dPadRightJustOn = dPadRightJustOn;
	}
	public float getAxisX() {
		return axisX;
	}
	public void setAxisX(float axisX) {
		this.axisX = axisX;
	}
	public float getAxisY() {
		return axisY;
	}
	public void setAxisY(float axisY) {
		this.axisY = axisY;
	}
	public boolean isAxisDown() {
		return axisDown;
	}
	public void setAxisDown(boolean axisDown) {
		this.axisDown = axisDown;
	}
	public boolean isAxisUp() {
		return axisUp;
	}
	public void setAxisUp(boolean axisUp) {
		this.axisUp = axisUp;
	}
	public boolean isAxisLeft() {
		return axisLeft;
	}
	public void setAxisLeft(boolean axisLeft) {
		this.axisLeft = axisLeft;
	}
	public boolean isAxisRight() {
		return axisRight;
	}
	public void setAxisRight(boolean axisRight) {
		this.axisRight = axisRight;
	}
	public boolean isAxisJustDown() {
		return axisJustDown;
	}
	public void setAxisJustDown(boolean axisJustDown) {
		this.axisJustDown = axisJustDown;
	}
	public boolean isAxisJustUp() {
		return axisJustUp;
	}
	public void setAxisJustUp(boolean axisJustUp) {
		this.axisJustUp = axisJustUp;
	}
	public boolean isAxisJustLeft() {
		return axisJustLeft;
	}
	public void setAxisJustLeft(boolean axisJustLeft) {
		this.axisJustLeft = axisJustLeft;
	}
	public boolean isAxisJustRight() {
		return axisJustRight;
	}
	public void setAxisJustRight(boolean axisJustRight) {
		this.axisJustRight = axisJustRight;
	}
	
}
