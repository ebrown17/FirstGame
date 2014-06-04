package com.ebrown.firstgame.entity.mob;

import com.ebrown.firstgame.graphics.Screen;
import com.ebrown.firstgame.graphics.Sprite;
import com.ebrown.firstgame.input.Keyboard;

public class Player extends Mob {
	
	private long lastTime=0,now=0;
	private Keyboard input;
	private Sprite sprite;
	private int anim =0;
	private boolean walking =false;
	private int walk = 0;
	private int walkSpeed = 200;
	private Sprite[] anim_up = {Sprite.player_up_4,Sprite.player_up_3,Sprite.player_up_2,Sprite.player_up_1};
	private Sprite[] anim_down = {Sprite.player_down_4,Sprite.player_down_3,Sprite.player_down_2,Sprite.player_down_1};
	private Sprite[] anim_right = {Sprite.player_right_4,Sprite.player_right_1,Sprite.player_right_2,Sprite.player_right_3};
	private Sprite[] anim_left = {Sprite.player_left_4,Sprite.player_left_1,Sprite.player_left_2,Sprite.player_left_3};
	private SpriteAnimation animUp = new SpriteAnimation(anim_up);
	private SpriteAnimation animDown = new SpriteAnimation(anim_down);
	private SpriteAnimation animRight = new SpriteAnimation(anim_right);
	private SpriteAnimation animLeft = new SpriteAnimation(anim_left);
	
	public Player(Keyboard input){
		this.input = input;
		
	}
	
	public Player(int x, int y,Keyboard input){
		this.x =x;
		this.y =y;
		this.input = input;
	}
	
	public void update(){
		
		int xa =0, ya=0;
		if(anim<8000){
			anim++;
		}else anim =0;
				
		if(input.up)ya--;
		if(input.down)ya++;
		if(input.left)xa--;
		if(input.right)xa++;
		
		if(xa !=0 || ya !=0){
			lastTime = System.currentTimeMillis();
			move(xa,ya);
			walking = true;
			
		} else {
			now = System.currentTimeMillis()-lastTime;
			if(now>25)
			walking= false;
		}
		
	}
	
	public void render(Screen screen){		
		
		if(dir==0){
			
			
			if(walking){
				
				animUp.setSpeed(50);
				sprite=animUp.next();
				
			
			}else {
				sprite = Sprite.player_up;
				animUp.resetAnim();
			}
		}
		if(dir==1){ 
			
			if(walking){
				
				animRight.setSpeed(50);
				sprite=animRight.next();				
			
			} else {
				sprite = Sprite.player_right;
				animRight.resetAnim();
			}
		
		}
		if(dir==2){
			
			if(walking){
				
				animDown.setSpeed(50);
				sprite=animDown.next();
				
			
			}else {
				sprite = Sprite.player_down;
				animDown.resetAnim();
			}
		}
		if(dir==3){
			
			if(walking){
				
				animLeft.setSpeed(50);
				sprite=animLeft.next();
				
			
			} else {
				sprite = Sprite.player_left;
				animLeft.resetAnim();
			}
		}
		screen.renderPlayer(x-32, y-32, sprite);
					
		
	}
	


}


