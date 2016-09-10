package com.slyvr.gamelings.objects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * This is the most basic entity class.
 * This class represents anything that might be rendered to the screen, from menu items to
 * space ships, to the blocks that make up a space ship.
 * 
 * The posBox determines an entity's position on the screen as well as their rectangular dimensions
 * that are used in rendering.
 * The collisionBox determines the rectangular area that can collide with other Ents.
 * 
 * Color determines the shade that an entity may be rendered with.  Setting the color to white
 * makes it render in its normal colors.
 * 
 * Font and text determine whether this entity contains text data to be displayed on the screen.
 * Text is rendered through specified fonts and does not require a width or height, but should be managed
 * through new line characters (/n) when necessary
 * @author Matt Schrum - slyvr89
 * @date 10/25/2013
 */
public class Ent {

	private String name;
	private int id;
	private String type;
	private Rectangle collisionBox;
	private Rectangle posBox;
	private int centerX;
	private int centerY;
	private Font font;
	private String text;
	private Img img;
	private Color color;
	private float rotation;
	private int scaleX;
	private int scaleY;
	private float animSpeed;
	private boolean display;
	private State state;
	private enum State {
		HOVER, CLICKED, JUMP, STAND, INJURED, DEAD
	}
	
	public Ent(){
		color = Color.WHITE;
		scaleX=1;
		scaleY=1;
		animSpeed=1;
		this.posBox = new Rectangle();
		this.collisionBox = new Rectangle();
		this.display = true;
	}
	
	public void render(SpriteBatch batch){
		if (this.isDisplay()){
			batch.setColor(this.getColor());
			if (this.getImg() != null){
				batch.draw(this.getImg().getTex(),
					this.getPosBox().getX(),
					this.getPosBox().getY(),
					this.getPosBox().getWidth(),
					this.getPosBox().getHeight());
			}
			if (this.getFont() != null){
				this.getFont().getFont().setColor(this.getColor());
				this.getFont().getFont().draw(batch, this.getText(), this.getPosBox().getX(), this.getPosBox().getY());
				this.getFont().getFont().setColor(Color.WHITE);
			}
			batch.setColor(Color.WHITE);
		}
	}
	
	public void setX(float x){
		this.posBox.setX(x);
		this.collisionBox.setX(x-1);
	}
	public void setY(float y){
		this.posBox.setY(y);
		this.collisionBox.setY(y-1);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Rectangle getCollisionBox() {
		return collisionBox;
	}
	public void setCollisionBox(Rectangle collisionBox) {
		this.collisionBox = collisionBox;
	}
	public Rectangle getPosBox() {
		return posBox;
	}
	public void setPosBox(Rectangle posBox) {
		this.posBox = posBox;
	}
	public int getCenterX() {
		return centerX;
	}
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}
	public int getCenterY() {
		return centerY;
	}
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	public Font getFont() {
		return font;
	}
	public void setFont(Font font) {
		this.font = font;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Img getImg() {
		return img;
	}
	public void setImg(Img img) {
		this.img = img;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public float getRotation() {
		return rotation;
	}
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}
	public int getScaleX() {
		return scaleX;
	}
	public void setScaleX(int scaleX) {
		this.scaleX = scaleX;
	}
	public int getScaleY() {
		return scaleY;
	}
	public void setScaleY(int scaleY) {
		this.scaleY = scaleY;
	}
	public float getAnimSpeed() {
		return animSpeed;
	}
	public void setAnimSpeed(float animSpeed) {
		this.animSpeed = animSpeed;
	}
	public boolean isDisplay() {
		return display;
	}
	public void setDisplay(boolean display) {
		this.display = display;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}
