package com.ebrown.firstgame.level.tile;

import com.ebrown.firstgame.graphics.Screen;
import com.ebrown.firstgame.graphics.Sprite;

public class GrassTile extends Tile {

	public GrassTile(Sprite sprite) {
		super(sprite);
		
	}
	
	public void render(int x, int y,Screen screen){

		screen.renderTile(x, y, this);	
		
	}

}
