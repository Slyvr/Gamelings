package com.slyvr.gamelings.objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class GameOptions {

	private boolean fullscreen;
	private Float audioVolume;
	
	public GameOptions(){
		fullscreen=false;
		audioVolume=1f;
		try {
			setOptionsTxt(false, 1f);
			initOptionsTxt();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isFullscreen() {
		return fullscreen;
	}

	public void setFullscreen(boolean fullscreen) {
		this.fullscreen = fullscreen;
		try {
			setOptionsTxt(this.fullscreen, this.audioVolume);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Float getAudioVolume() {
		return audioVolume;
	}

	public void setAudioVolume(Float audioVolume) {
		this.audioVolume = audioVolume;
		try {
			setOptionsTxt(this.fullscreen, this.audioVolume);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	float lastUpdateMillis;
	
	public void setOptionsTxt(boolean fullScr, float vol) throws IOException{
		//Only update this and write the file if it hasn't been done in the past 5 seconds
		if (lastUpdateMillis+5000<System.currentTimeMillis()){
			//Check if an options.txt exists, if it doesn't create a default
			String localpath = Gdx.files.getLocalStoragePath();
			if(Gdx.files.isLocalStorageAvailable()){
				FileHandle file = Gdx.files.external(localpath+"/My Documents/Magellan/options.txt");
				String fileString = "fullscreen="+fullScr+"\n"+
								"volume="+vol;
				file.writeString(fileString, false);
				if (!file.exists()){
					try {
						file.file().createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				else{
					writeFile(file.file(),fileString);
				}
			}
			lastUpdateMillis=System.currentTimeMillis();
		}
	}
	
	public void initOptionsTxt(){
		//Check if an options.txt exists, if it doesn't create a default
		String localpath = Gdx.files.getLocalStoragePath();
		if(Gdx.files.isLocalStorageAvailable()){
			FileHandle file = Gdx.files.external(localpath+"/My Documents/Magellan/options.txt");
			if (file.exists()){
				//options.txt exists, read it
				try {
					String xmlString = file.readString();
					xmlString = xmlString.replaceAll("\n", "=");
					String[] options = xmlString.split("=");
					for(int i=0; i<options.length; i++){
						String option = options[i];
						if ("fullscreen".equals(option)){
							String value = options[i+1];
							if ("true".equals(value)) fullscreen=true;
							else fullscreen=false;
						}
						else if ("volume".equals(option)){
							String value = options[i+1];
							audioVolume = Float.parseFloat(value);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	@SuppressWarnings("resource")
	public static void writeFile(File file, String text) throws IOException {
	    FileOutputStream fos = null;
	    try {
	        fos = new FileOutputStream(file);
	        fos.write(text.getBytes("UTF-8"));
	    }
	    catch (IOException e) {
	        fos.close();
	        throw e;
	    }
	}
	
}
