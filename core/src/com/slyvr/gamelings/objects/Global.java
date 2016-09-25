package com.slyvr.gamelings.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.slyvr.gamelings.load.LoadImgs;
import com.slyvr.gamelings.load.LoadMenus;
import com.slyvr.gamelings.objects.controllers.GameController;

/**
 * This class is the main source for everything to be loaded and where resources are pulled out.
 * Call Global.getImgByName(name) to retrieve any image you need, for instance.
 * 
 * This class also contains some basic variables to determine game defaults and setup information
 * 
 * The current variables keep track of what to be currently displaying or playing in the game.
 * @author Matt Schrum - slyvr89
 * @date 10/25/2013
 */
public class Global {

	private ArrayList<Img> imgs;
	private ArrayList<AudioTrack> tracks;
	private ArrayList<Font> fonts;
	private ArrayList<Menu> menus;
	
	private ArrayList<GameController> controllers;
	private ArrayList<Player> players;
	
	private Menu previousMenu;
	private Menu currentMenu;
	private AudioTrack currentTrack;
	private GameInstance game;
	private GameOptions options;
	
	private int defaultScreenWidth;
	private int defaultScreenHeight;
	private Camera camera;
	private Viewport viewport;
	private SpriteBatch batch;
	
	private float stateTime;
	
	public Global(){
		stateTime = 0f;
		batch = new SpriteBatch();
		camera = new PerspectiveCamera();
		viewport = new FitViewport(1366, 768, camera);
	}
	
	public Img getImgByName(String name){
		for(Img img : imgs)
			if (name.equals(img.getName())) return img;
		return null;
	}
	public AudioTrack getTrackByName(String name){
		for(AudioTrack track : tracks)
			if (track.getName().equals(name)) return track;
		return null;
	}
	public Font getFontByName(String name){
		for(Font font : fonts)
			if (font.getName().equals(name)) return font;
		return null;
	}
	public Menu getMenuByName(String name){
		for(Menu menu : menus)
			if (name.equals(menu.getName())) return menu;
		return null;
	}
	
	public void changeMenu(String name){
		if ("previous".equals(name)){
			Menu menu = this.previousMenu;
			this.setPreviousMenu(this.getCurrentMenu());
			this.setCurrentMenu(menu);
		}
		else{
			this.setPreviousMenu(this.getCurrentMenu());
			this.setCurrentMenu(this.getMenuByName(name));
		}
	}
	
	public ArrayList<Img> getImgs() {
		return imgs;
	}
	public void setImgs(ArrayList<Img> imgs) {
		this.imgs = imgs;
	}
	public ArrayList<AudioTrack> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<AudioTrack> tracks) {
		this.tracks = tracks;
	}
	public ArrayList<Font> getFonts() {
		return fonts;
	}
	public void setFonts(ArrayList<Font> fonts) {
		this.fonts = fonts;
	}
	public ArrayList<Menu> getMenus() {
		return menus;
	}
	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}
	public ArrayList<GameController> getControllers() {
		return controllers;
	}
	public void setControllers(ArrayList<GameController> controllers) {
		this.controllers = controllers;
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	public int getDefaultScreenWidth() {
		return defaultScreenWidth;
	}
	public void setDefaultScreenWidth(int defaultScreenWidth) {
		this.defaultScreenWidth = defaultScreenWidth;
	}
	public int getDefaultScreenHeight() {
		return defaultScreenHeight;
	}
	public void setDefaultScreenHeight(int defaultScreenHeight) {
		this.defaultScreenHeight = defaultScreenHeight;
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(OrthographicCamera camera) {
		this.camera = camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public Viewport getViewport() {
		return viewport;
	}
	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}
	public SpriteBatch getBatch() {
		return batch;
	}
	public void setBatch(SpriteBatch batch) {
		this.batch = batch;
	}
	public Menu getPreviousMenu() {
		return previousMenu;
	}
	public void setPreviousMenu(Menu previousMenu) {
		this.previousMenu = previousMenu;
	}
	public Menu getCurrentMenu() {
		return currentMenu;
	}
	public void setCurrentMenu(Menu currentMenu) {
		this.currentMenu = currentMenu;
	}
	public AudioTrack getCurrentTrack() {
		return currentTrack;
	}
	public void setCurrentTrack(AudioTrack currentTrack) {
		this.currentTrack = currentTrack;
	}
	public GameInstance getGame(){
		return game;
	}
	public void setGame(GameInstance game){
		this.game=game;
	}
	public GameOptions getOptions(){
		return options;
	}
	public void setOptions(GameOptions options){
		this.options=options;
	}
	public float getStateTime() {
		return stateTime;
	}
	public void setStateTime(float stateTime) {
		this.stateTime = stateTime;
	}
	
}
