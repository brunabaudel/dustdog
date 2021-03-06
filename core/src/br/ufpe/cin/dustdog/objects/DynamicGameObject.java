package br.ufpe.cin.dustdog.objects;

import com.badlogic.gdx.math.Vector2;

public class DynamicGameObject extends GameObject {
	
	public Vector2 velocity;
	public Vector2 accel;

	public DynamicGameObject (float x, float y, float width, float height) {
		super(x, y, width, height);
		
		velocity = new Vector2();
		accel = new Vector2();
	}
	
}