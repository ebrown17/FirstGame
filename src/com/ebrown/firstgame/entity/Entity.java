package com.ebrown.firstgame.entity;

import java.util.Random;

import com.ebrown.firstgame.graphics.Screen;
import com.ebrown.firstgame.level.Level;

public class Entity {
	
	public int x,y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();

	public void update(){
			
	}
	
	public void render(Screen screen){
		
	}
	
	public void remove(){	
		removed = true;
	}
	
	public boolean isRemoved(){
		return removed;
	}
	
}
