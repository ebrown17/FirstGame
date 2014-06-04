package com.ebrown.firstgame.entity.mob;

import java.util.ArrayList;

import com.ebrown.firstgame.graphics.Sprite;

public class SpriteAnimation {
	

	private ArrayList<Sprite> sprites;
	private int tick, cur_sprite, speed;
	
	public SpriteAnimation(Sprite[] sprites) {
	    this.sprites = new ArrayList<Sprite>();
	    tick = 0;
	    cur_sprite = 0;
	
	    for (Sprite sprite : sprites) {
	        this.sprites.add(sprite);
	    }
	}
	
	public SpriteAnimation() {
	    sprites = new ArrayList<Sprite>();
	    tick = 0;
	    cur_sprite = 0;
	}
	
	public void setSpeed(int speed) {
	    this.speed = speed;
	}
	
	public void addSprite(Sprite sprite) {
	    sprites.add(sprite);
	}
	
	public void resetAnim(){
		cur_sprite=0;
	}
	
	public Sprite next() {
	    tick++;
	
	    if (tick >= speed) {
	        tick = 0;
	        cur_sprite++;
	
	        if (cur_sprite >= sprites.size()) {
	            cur_sprite = 0;
	        }
	    }
	
	    return sprites.get(cur_sprite);
	}
}	