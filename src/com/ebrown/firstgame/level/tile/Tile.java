package com.ebrown.firstgame.level.tile;

import com.ebrown.firstgame.graphics.Screen;
import com.ebrown.firstgame.graphics.Sprite;

public class Tile {
	
	public int x,y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile (Sprite.grass);
	public static Tile voidTile = new voidTile(Sprite.voidSprite);
	
	public Tile(Sprite sprite){
		this.sprite = sprite;
	}

	public void render(int x, int y,Screen screen){
		
	}
	
	public boolean solid() {
		return false;
	}
}
