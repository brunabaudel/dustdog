package br.ufpe.cin.dustdog.objects.spot;

import br.ufpe.cin.dustdog.Assets;
import br.ufpe.cin.dustdog.objects.DynamicGameObject;
import br.ufpe.cin.dustdog.objects.LaneState;
import br.ufpe.cin.dustdog.objects.specialItems.Tornado;

public class Spot extends DynamicGameObject {

	public static final float SPOT_POSITION_Y = 0.5f;
	public static final float SPOT_VELOCITY_X = 10f;

	public static final float SPOT_WIDTH = 1.66f;
	public static final float SPOT_HEIGHT = 2.5f;

	public static final float SPOT_COLLISION_WIDTH = 0.82f;
	public static final float SPOT_COLLISION_HEIGHT = 1.6f;
	public static final float SPOT_COLLISION_POSITION_X = 0.4f;
	
	public static final float LEFT_LANE_POSITION_X = 1.8f;
	public static final float CENTRAL_LANE_POSITION_X = 4f;
	public static final float RIGHT_LANE_POSITION_X = 6.2f;
	
	public static final int SPOT_NUMBER_LIVES = 3;

	public SpotState spotState;
	public LaneState laneState;

	public float stateTime;
	public boolean visible;
	
	public int numberLives;
	
	public Tornado tornado;
	
	public boolean hasCachedCommand;
	public SwipeDirection cachedCommand;

	public Spot(float x, float y, float width, float height) {
		super(x, y, width, height);
		
		goForward();
		
		laneState = LaneState.CENTRAL;
		visible = true;
		
		numberLives = SPOT_NUMBER_LIVES;
		
		hasCachedCommand = false;
	}

	public void update(float deltaTime, SwipeDirection swipeDirection) {
		position.x += velocity.x * deltaTime;
		bounds.x = position.x + SPOT_COLLISION_POSITION_X;
		
		// Only apply spot movement (given the swipe) if it is going forward, otherwise let it finish that movement (ignoring the swipe)
		if (spotState == SpotState.GOING_FORWARD) {
			
			if (hasCachedCommand) {
				swipeDirection = cachedCommand;
				hasCachedCommand = false;
			}

			switch (swipeDirection) {
			case LEFT:
				velocity.x = -SPOT_VELOCITY_X;
				spotState = SpotState.GOING_LEFT;
				stateTime = 0;
				
				Assets.playSound(Assets.moveLeftSound);

				break;

			case RIGHT:
				velocity.x = SPOT_VELOCITY_X;
				spotState = SpotState.GOING_RIGHT;
				stateTime = 0;
				
				Assets.playSound(Assets.moveRightSound);

				break;

			case UP:
				spotState = SpotState.JUMPING;

				break;

			case DOWN:
				spotState = SpotState.CROUCHING;

				break;

			case NONE:
				break;
			}
		}
		else {
			if (!hasCachedCommand && swipeDirection != SwipeDirection.NONE) {
				cachedCommand = swipeDirection;
				hasCachedCommand = true;
			}
		}

		switch (spotState) {
		case GOING_RIGHT:

			switch (laneState) {
			case CENTRAL:
				if (position.x >= RIGHT_LANE_POSITION_X) {
					position.x = RIGHT_LANE_POSITION_X;
					laneState = LaneState.RIGHT;
					goForward();
				}

				break;
			case LEFT:
				if (position.x >= CENTRAL_LANE_POSITION_X) {
					position.x = CENTRAL_LANE_POSITION_X;
					laneState = LaneState.CENTRAL;
					goForward();
				}

				break;

			case RIGHT:
				position.x = RIGHT_LANE_POSITION_X;
				goForward();

				break;
			}

			break;

		case GOING_LEFT:

			switch (laneState) {
			case CENTRAL:
				if (position.x <= LEFT_LANE_POSITION_X) {
					position.x = LEFT_LANE_POSITION_X;
					laneState = LaneState.LEFT;
					goForward();
				}

				break;

			case LEFT:
				position.x = LEFT_LANE_POSITION_X;
				goForward();

				break;

			case RIGHT:
				if (position.x <= CENTRAL_LANE_POSITION_X) {
					position.x = CENTRAL_LANE_POSITION_X;
					laneState = LaneState.CENTRAL;
					goForward();
				}

				break;
			}

			break;

		case GOING_FORWARD:
			break;

		case JUMPING:
			goForward(); // TODO: call this within an if-condition to check whether movement is over
			break;	

		case CROUCHING:
			goForward(); // TODO: call this within an if-condition to check whether movement is over
			break;
		}

		stateTime += deltaTime;
	}

	private void goForward() {
		velocity.x = 0;
		spotState = SpotState.GOING_FORWARD;
		
		stateTime = 0;
	}
}
