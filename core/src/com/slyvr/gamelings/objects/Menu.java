package com.slyvr.gamelings.objects;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.slyvr.gamelings.MyGame;

/**
 * This class maintains all the data and entities required in a menu
 * @author Matt Schrum - slyvr89
 * @date 10/25/2013
 */
public class Menu {

	private String name;
	private int id;
	private String type;
	private ArrayList<Ent> ents;
	private ArrayList<Menu> subMenus;
	private Menu currentSubMenu;
	private boolean animating;
	private long endAnimTime;
	private Ent currentAnimation;
	
	public Menu(){
		
	}
	
	public void render(SpriteBatch batch){
		for(Ent e : ents){
			e.render(batch);
		}
	}
	
	public void update(float stateTime){
		
	}
	
	public static void updateButtonHover(){
		Rectangle mousePos = new Rectangle(Gdx.input.getX(),Gdx.graphics.getHeight()-Gdx.input.getY(),1,1);
		
		Ent prevHovered = null;
		
		for(Ent e : MyGame.getGlobal().getCurrentMenu().getEnts()){
			Rectangle ePos = new Rectangle(e.getPosBox());
			ePos.setX(ePos.getX());
			ePos.setY(ePos.getY());
			if (mousePos.overlaps(ePos)){
				if (e.getImg() != null && e.getImg().getName().contains("btn") && !e.getImg().getName().contains("hover")){
					Img hoverImg = MyGame.getGlobal().getImgByName(e.getImg().getName()+"_hover");
					if (hoverImg != null) e.setImg(hoverImg);
					e.setSelected(true);
				}
			}
			else if (e.getImg() != null && e.getImg().getName().contains("hover")){
				Img nonHoverImg = MyGame.getGlobal().getImgByName(e.getImg().getName().replace("_hover", ""));
				if (nonHoverImg != null) e.setImg(nonHoverImg);
				e.setSelected(false);
				prevHovered = e;
			}
		}
		
		boolean hasOneHovered = false;
		for(Ent e : MyGame.getGlobal().getCurrentMenu().getEnts()){
			if (e.getImg() != null && e.getImg().getName().contains("hover")){
				hasOneHovered = true;
				break;
			}
		}
		
		if (!hasOneHovered && prevHovered != null){
			Img hoverImg = MyGame.getGlobal().getImgByName(prevHovered.getImg().getName()+"_hover");
			if (hoverImg != null) prevHovered.setImg(hoverImg);
			prevHovered.setSelected(true);
		}
		
		if (MyGame.getGlobal().getCurrentMenu().getSubMenus() != null){
			for(Menu menu : MyGame.getGlobal().getCurrentMenu().getSubMenus()){
				
				prevHovered = null;
				
				for(Ent e : menu.getEnts()){
					Rectangle ePos = new Rectangle(e.getPosBox());
					ePos.setX(ePos.getX());
					ePos.setY(ePos.getY());
					if (mousePos.overlaps(ePos)){
						if (e.getImg() != null && e.getImg().getName().contains("btn") && !e.getImg().getName().contains("hover")){
							Img hoverImg = MyGame.getGlobal().getImgByName(e.getImg().getName()+"_hover");
							if (hoverImg != null) e.setImg(hoverImg);
							e.setSelected(true);
						}
					}
					else if (e.getImg() != null && e.getImg().getName().contains("btn") && e.getImg().getName().contains("hover")){
						Img nonHoverImg = MyGame.getGlobal().getImgByName(e.getImg().getName().replace("_hover", ""));
						if (nonHoverImg != null) e.setImg(nonHoverImg);
						e.setSelected(false);
						prevHovered = e;
					}
				}
				
				hasOneHovered = false;
				for(Ent e : menu.getEnts()){
					if (e.getImg() != null && e.getImg().getName().contains("hover")){
						hasOneHovered = true;
						break;
					}
				}
				
				if (!hasOneHovered && prevHovered != null){
					Img hoverImg = MyGame.getGlobal().getImgByName(prevHovered.getImg().getName()+"_hover");
					if (hoverImg != null) prevHovered.setImg(hoverImg);
					prevHovered.setSelected(true);
				}
			}
		}
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
	public ArrayList<Ent> getEnts() {
		return ents;
	}
	public void setEnts(ArrayList<Ent> ents) {
		this.ents = ents;
	}
	public ArrayList<Menu> getSubMenus(){
		return subMenus;
	}
	public void setSubMenus(ArrayList<Menu> subMenus){
		this.subMenus=subMenus;
	}
	public Menu getCurrentSubMenu(){
		return currentSubMenu;
	}
	public void setCurrentSubMenu(Menu currentSubMenu){
		this.currentSubMenu=currentSubMenu;
	}
	public boolean isAnimating() {
		return animating;
	}
	public void setAnimating(boolean animating) {
		this.animating = animating;
	}
	public long getEndAnimTime() {
		return endAnimTime;
	}
	public void setEndAnimTime(long endAnimTime) {
		this.endAnimTime = endAnimTime;
	}
	public Ent getCurrentAnimation() {
		return currentAnimation;
	}
	public void setCurrentAnimation(Ent currentAnimation) {
		this.currentAnimation = currentAnimation;
	}

	public void setCurrentSubMenuByName(String menuName){
		for(Menu subMenu : subMenus){
			if (menuName.equals(subMenu.getName())){
				this.currentSubMenu = subMenu;
				break;
			}
		}
	}
	
	public Ent getEntByName(String name){
		for(Ent e : ents)
			if (e.getName().equals(name)) return e;
		return null;
	}
	public Menu getSubMenuByName(String name){
		for(Menu m : subMenus)
			if (m.getName().equals(name)) return m;
		return null;
	}
	public Ent getSelectedEnt(){
		for(Ent e : ents){
			if (e.isSelected()){
				return e;
			}
		}
		return null;
	}
	
}
