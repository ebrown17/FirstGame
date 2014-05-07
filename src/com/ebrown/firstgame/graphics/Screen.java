package com.ebrown.firstgame.graphics;

import java.util.Random;

import com.ebrown.firstgame.level.tile.Tile;

public class Screen {
	
	public int width,height;
	public int[] pixels;
	public final int MAP_SIZE = 64;
	public final int MAP_SIZE_MASK = MAP_SIZE -1;
	public int[] tiles = new int[MAP_SIZE * MAP_SIZE];
	private Random random = new Random();
	
	public Screen (int width, int height ){
		
		this.width=width;
		this.height=height;
		pixels = new int[width*height];
		
		for(int i =0; i <MAP_SIZE * MAP_SIZE; i++){
			tiles[i]=random.nextInt(0xffffff);
			
		}
		
	}
	
	public void render(int xOff, int yOff){
		
		for(int y = 0; y < height; y++){
			int yp = y +yOff;
			if(yp < 0 || yp >= height) continue;
			
			for(int x=0; x<width; x++){
				int xp = x + xOff;
				if(xp < 0 || xp >= width) continue;
				
				pixels[(xp) + (yp) * width] = Sprite.grass.pixels[(x & 15) + (y & 15) * Sprite.grass.SIZE];
			}
		}
		
	}
	
	public void clear(){
		
		for(int i =0; i < pixels.length;i++){
			pixels[i]=0;
		}
	}
	
	
	public void renderTile(int xp, int yp, Tile tile){
		
		for(int y=0; y < tile.sprite.SIZE; y++){
			int ya = y + yp;
			
			for(int x=0; x<tile.sprite.SIZE;x++){
				int xa = x + xp;
				if(xa < 0 || xa >= width || ya < 0 || ya >= width) break;
				pixels[xa + ya * width] = tile.sprite.pixels[x + y * tile.sprite.SIZE];
			}
		}
		
	}
	

}