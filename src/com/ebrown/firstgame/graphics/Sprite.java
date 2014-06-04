package com.ebrown.firstgame.graphics;

public class Sprite {
	
	public final int SIZE;
	private int x,y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	public static Sprite grass = new Sprite(64,0,0,SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(64, 0x663333);
	
	public static Sprite tree1 = new Sprite(64,0,1,SpriteSheet.tiles);
	public static Sprite tree2 = new Sprite(64,0,2,SpriteSheet.tiles);
	public static Sprite tree3 = new Sprite(64,0,3,SpriteSheet.tiles);
	public static Sprite tree4 = new Sprite(64,1,1,SpriteSheet.tiles);
	public static Sprite tree5 = new Sprite(64,2,2,SpriteSheet.tiles);
	public static Sprite tree6 = new Sprite(64,3,3,SpriteSheet.tiles);
	
	/*public static Sprite player0 = new Sprite(16,0,10,SpriteSheet.tiles);
	public static Sprite player1 = new Sprite(16,1,10,SpriteSheet.tiles);
	public static Sprite player2 = new Sprite(16,0,11,SpriteSheet.tiles);
	public static Sprite player3 = new Sprite(16,1,11,SpriteSheet.tiles);*/
	
	public static Sprite player_left = new Sprite(64,0,4,SpriteSheet.tiles);
	public static Sprite player_right = new Sprite(64,0,5,SpriteSheet.tiles);
	public static Sprite player_up = new Sprite(64,0,6,SpriteSheet.tiles);
	public static Sprite player_down = new Sprite(64,0,7,SpriteSheet.tiles);
	
	public static Sprite player_up_1 = new Sprite(64,1,6,SpriteSheet.tiles);
	public static Sprite player_up_2 = new Sprite(64,2,6,SpriteSheet.tiles);
	public static Sprite player_up_3 = new Sprite(64,3,6,SpriteSheet.tiles);
	public static Sprite player_up_4 = new Sprite(64,4,6,SpriteSheet.tiles);
	
	public static Sprite player_down_1 = new Sprite(64,1,7,SpriteSheet.tiles);
	public static Sprite player_down_2 = new Sprite(64,2,7,SpriteSheet.tiles);
	public static Sprite player_down_3 = new Sprite(64,3,7,SpriteSheet.tiles);
	public static Sprite player_down_4 = new Sprite(64,4,7,SpriteSheet.tiles);
	
	public static Sprite player_left_1 = new Sprite(64,1,4,SpriteSheet.tiles);
	public static Sprite player_left_2 = new Sprite(64,2,4,SpriteSheet.tiles);
	public static Sprite player_left_3 = new Sprite(64,3,4,SpriteSheet.tiles);
	public static Sprite player_left_4 = new Sprite(64,4,4,SpriteSheet.tiles);
	
	public static Sprite player_right_1 = new Sprite(64,1,5,SpriteSheet.tiles);
	public static Sprite player_right_2 = new Sprite(64,2,5,SpriteSheet.tiles);
	public static Sprite player_right_3 = new Sprite(64,3,5,SpriteSheet.tiles);
	public static Sprite player_right_4 = new Sprite(64,4,5,SpriteSheet.tiles);
	
	
	public Sprite(int size, int x, int y, SpriteSheet sheet){
		SIZE = size;
		pixels = new int[SIZE*SIZE];
		this.x = x*size;
		this.y = y*size;
		this.sheet = sheet;
		load();		
	}
	
	public Sprite(int size, int color){
		SIZE=size;
		pixels = new int[SIZE*SIZE];
		setColor(color);
	}
	
	private void setColor(int color){
		for(int i =0; i < SIZE*SIZE; i++){
			pixels[i] = color;
		}
	}
	
	
	private void load(){
		for(int y =0; y < SIZE;y++){
			for(int x=0; x < SIZE;x++){
				
				pixels[x+y*SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
				
			}
		}
		
	}

}
