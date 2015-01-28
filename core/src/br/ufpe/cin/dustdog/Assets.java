package br.ufpe.cin.dustdog;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public class Assets {

	public final static int SCREEN_WIDTH = 682;
	public final static int SCREEN_HEIGHT = 1024;

	public static Texture backgroundMainScreen;
	public static TextureRegion backgroundRegionMainScreen;

	public static Texture backgroundSettingsScreen;
	public static TextureRegion backgroundRegionSettingsScreen;

	public static Texture backgroundGameScreen;
	public static TextureRegion backgroundRegionGameScreen;

	public static TextureAtlas screenItemsAtlas;
	public static TextureAtlas gameItemsAtlas;

	public static TextureRegion mainScreenLogo;
	public static TextureRegion mainScreenBestScore;
	public static TextureRegion mainScreenBestScoreActive;
	public static TextureRegion mainScreenTapPlay;
	public static TextureRegion mainScreenTapPlayActive;
	public static TextureRegion mainScreenSettingsButton;
	public static TextureRegion mainScreenSettingsButtonActive;

	public static TextureRegion settingsScreenSettingsBox;
	public static TextureRegion settingsScreenMarkedBox;
	public static TextureRegion settingsScreenUnmarkedBox;
	public static TextureRegion settingsScreenCancelButton;
	public static TextureRegion settingsScreenCancelButtonActive;
	public static TextureRegion settingsScreenOkButton;
	public static TextureRegion settingsScreenOkButtonActive;

	public static TextureRegion highscoresScreenHighscoresBox;
	public static TextureRegion highscoresScreenBackButton;
	public static TextureRegion highscoresScreenBackButtonActive;

	public static TextureRegion gameScreenReady;
	public static TextureRegion gameScreenPauseButton;
	public static TextureRegion gameScreenPauseButtonActive;
	public static TextureRegion gameScreenPausedBox;
	public static TextureRegion gameScreenResumeButton;
	public static TextureRegion gameScreenResumeButtonActive;
	public static TextureRegion gameScreenHomeButton;
	public static TextureRegion gameScreenHomeButtonActive;
	public static TextureRegion gameScreenSettingsButton;
	public static TextureRegion gameScreenSettingsButtonActive;
	public static TextureRegion gameScreenScoreBox;
	public static TextureRegion gameScreenBonesBox;
	public static TextureRegion gameScreenGameOver;
	public static TextureRegion gameScreenGameOverScoreBox;
	public static TextureRegion gameScreenGameOverScoreBoxActive;
	public static TextureRegion gameScreenHighscoreBox;
	public static TextureRegion gameScreenHighscoreBoxActive;

	public static TextureRegion spotForwardA;
	public static TextureRegion spotForwardB;
	public static TextureRegion spotForwardC;
	public static TextureRegion spotRightA;
	public static TextureRegion spotRightB;
	public static TextureRegion spotRightC;
	public static TextureRegion spotLeftA;
	public static TextureRegion spotLeftB;
	public static TextureRegion spotLeftC;

	public static Animation spotGoingForwardAnimation;
	public static Animation spotGoingRightAnimation;
	public static Animation spotGoingLeftAnimation;

	public static TextureRegion obstacleStone;
	public static TextureRegion obstacleTree;

	public static TextureRegion garbagePaperBallA;
	public static TextureRegion garbagePaperBallB;
	public static TextureRegion garbagePaperBallC;
	public static TextureRegion garbageCoconutStraw;
	public static TextureRegion garbageCoconutNoStraw;
	public static TextureRegion garbageBottleBrown;
	public static TextureRegion garbageBottleGreen;
	public static TextureRegion garbageBottlePurple;
	public static TextureRegion garbageCanGreen;
	public static TextureRegion garbageCanRed;
	public static TextureRegion garbageCanPurple;
	public static TextureRegion garbageFishbone;

	public static TextureRegion specialItemCookieBox;

	public static FreeTypeFontGenerator fontGenerator;
	public static FreeTypeFontParameter fontParameter;

	public static BitmapFont font48;

	public static Music music;
	public static Sound clickSound;
	public static Sound moveLeftSound;
	public static Sound moveRightSound;
	public static Sound barkSound;
	public static Sound hitStoneSound;
	public static Sound hitTreeSound;
	public static Sound hitGarbageSound;
	public static Sound hitCookieBoxSound;
	public static Sound gameOverScoreSound;

	public static Texture loadTexture(String fileName) {
		return new Texture(Gdx.files.internal(fileName));
	}

	public static TextureAtlas loadTextureAtlas(String fileName) {
		return new TextureAtlas(Gdx.files.internal(fileName));
	}

	public static void load() {
		backgroundMainScreen = loadTexture("backgroundMainScreen.png");
		backgroundRegionMainScreen = new TextureRegion(backgroundMainScreen, 0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

		backgroundSettingsScreen = loadTexture("backgroundSettingsScreen.png");
		backgroundRegionSettingsScreen = new TextureRegion(backgroundSettingsScreen, 0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

		backgroundGameScreen = loadTexture("backgroundGameScreen.png");
		backgroundRegionGameScreen = new TextureRegion(backgroundGameScreen, 0, 0, SCREEN_WIDTH, SCREEN_HEIGHT*2);

		screenItemsAtlas = loadTextureAtlas("screenItems.atlas");
		gameItemsAtlas = loadTextureAtlas("gameItems.atlas");

		mainScreenLogo = screenItemsAtlas.findRegion("logo_dustdog");
		mainScreenBestScore = screenItemsAtlas.findRegion("box_best_score");
		mainScreenBestScoreActive = screenItemsAtlas.findRegion("box_best_score_active");
		mainScreenTapPlay = screenItemsAtlas.findRegion("btn_tap_to_play");
		mainScreenTapPlayActive = screenItemsAtlas.findRegion("btn_tap_to_play_active");
		mainScreenSettingsButton = screenItemsAtlas.findRegion("btn_config");
		mainScreenSettingsButtonActive = screenItemsAtlas.findRegion("btn_config_active");

		settingsScreenSettingsBox = screenItemsAtlas.findRegion("box_config");
		settingsScreenMarkedBox = screenItemsAtlas.findRegion("chk_marked");
		settingsScreenUnmarkedBox = screenItemsAtlas.findRegion("chk_unmarked");
		settingsScreenCancelButton = screenItemsAtlas.findRegion("btn_cancel");
		settingsScreenCancelButtonActive = screenItemsAtlas.findRegion("btn_cancel_active");
		settingsScreenOkButton = screenItemsAtlas.findRegion("btn_ok");
		settingsScreenOkButtonActive = screenItemsAtlas.findRegion("btn_ok_active");

		highscoresScreenHighscoresBox = screenItemsAtlas.findRegion("box_highscores");
		highscoresScreenBackButton = screenItemsAtlas.findRegion("btn_back");
		highscoresScreenBackButtonActive = screenItemsAtlas.findRegion("btn_back_active");

		gameScreenReady = screenItemsAtlas.findRegion("txt_ready");
		gameScreenPauseButton = screenItemsAtlas.findRegion("btn_pause");
		gameScreenPauseButtonActive = screenItemsAtlas.findRegion("btn_pause_active");
		gameScreenPausedBox = screenItemsAtlas.findRegion("box_paused");
		gameScreenResumeButton = screenItemsAtlas.findRegion("btn_resume");
		gameScreenResumeButtonActive = screenItemsAtlas.findRegion("btn_resume_active");
		gameScreenHomeButton = screenItemsAtlas.findRegion("btn_home");
		gameScreenHomeButtonActive = screenItemsAtlas.findRegion("btn_home_active");
		gameScreenSettingsButton = screenItemsAtlas.findRegion("btn_settings");
		gameScreenSettingsButtonActive = screenItemsAtlas.findRegion("btn_settings_active");
		gameScreenScoreBox = screenItemsAtlas.findRegion("box_points");
		gameScreenBonesBox = screenItemsAtlas.findRegion("box_bones");
		gameScreenGameOver = screenItemsAtlas.findRegion("txt_game_over");
		gameScreenGameOverScoreBox = screenItemsAtlas.findRegion("box_final_score");
		gameScreenGameOverScoreBoxActive = screenItemsAtlas.findRegion("box_final_score_active");
		gameScreenHighscoreBox = screenItemsAtlas.findRegion("box_new_highscore");
		gameScreenHighscoreBoxActive = screenItemsAtlas.findRegion("box_new_highscore_active");

		spotForwardA = gameItemsAtlas.findRegion("spot_forward_a");
		spotForwardB = gameItemsAtlas.findRegion("spot_forward_b");
		spotForwardC = gameItemsAtlas.findRegion("spot_forward_c");
		spotRightA = gameItemsAtlas.findRegion("spot_right_a");
		spotRightB = gameItemsAtlas.findRegion("spot_right_b");
		spotRightC = gameItemsAtlas.findRegion("spot_right_c");

		spotLeftA = new TextureRegion(spotRightA);
		spotLeftA.flip(true, false);

		spotLeftB = new TextureRegion(spotRightB);
		spotLeftB.flip(true, false);

		spotLeftC = new TextureRegion(spotRightC);
		spotLeftC.flip(true, false);

		spotGoingForwardAnimation = new Animation(0.1f, spotForwardA, spotForwardB, spotForwardC);
		spotGoingRightAnimation = new Animation(0.05f, spotForwardA, spotRightA, spotRightB, spotRightC, spotRightB, spotRightA, spotForwardA);
		spotGoingLeftAnimation = new Animation(0.05f, spotForwardA, spotLeftA, spotLeftB, spotLeftC, spotLeftB, spotLeftA, spotForwardA);

		obstacleStone = gameItemsAtlas.findRegion("stone");
		obstacleTree = gameItemsAtlas.findRegion("tree");
		obstacleTree.flip(true, false);

		garbagePaperBallA = gameItemsAtlas.findRegion("paperball_a");
		garbagePaperBallB = gameItemsAtlas.findRegion("paperball_b");
		garbagePaperBallC = gameItemsAtlas.findRegion("paperball_c");
		garbageCoconutStraw = gameItemsAtlas.findRegion("coconut_straw");
		garbageCoconutNoStraw = gameItemsAtlas.findRegion("coconut_no_straw");
		garbageBottleBrown = gameItemsAtlas.findRegion("bottle_brown");
		garbageBottleGreen = gameItemsAtlas.findRegion("bottle_green");
		garbageBottlePurple = gameItemsAtlas.findRegion("bottle_purple");
		garbageCanGreen = gameItemsAtlas.findRegion("can_green");
		garbageCanRed = gameItemsAtlas.findRegion("can_red");
		garbageCanPurple = gameItemsAtlas.findRegion("can_purple");
		garbageFishbone = gameItemsAtlas.findRegion("fishbone");
		specialItemCookieBox =  gameItemsAtlas.findRegion("cookie_box");

		fontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/berlin-sans-fb.ttf"));
		fontParameter = new FreeTypeFontParameter();
		fontParameter.size = 48;
		font48 = fontGenerator.generateFont(fontParameter);
		font48.setColor(Color.BLACK);
		fontGenerator.dispose();

		music = Gdx.audio.newMusic(Gdx.files.internal("sounds/soundtrack_loop.mp3"));
		music.setLooping(true);
		music.setVolume(0.3f);

		if (Settings.musicEnabled) music.play();

		clickSound = Gdx.audio.newSound(Gdx.files.internal("sounds/click.wav"));
		moveLeftSound = Gdx.audio.newSound(Gdx.files.internal("sounds/move_left.wav"));
		moveRightSound = Gdx.audio.newSound(Gdx.files.internal("sounds/move_right.wav"));
		barkSound = Gdx.audio.newSound(Gdx.files.internal("sounds/dog_barks.wav"));
		hitStoneSound = Gdx.audio.newSound(Gdx.files.internal("sounds/crash_rock.wav"));
		hitTreeSound = Gdx.audio.newSound(Gdx.files.internal("sounds/crash_wood.wav"));
		hitGarbageSound = Gdx.audio.newSound(Gdx.files.internal("sounds/trash.wav"));
		hitCookieBoxSound = Gdx.audio.newSound(Gdx.files.internal("sounds/cookie_box.wav"));
		gameOverScoreSound = Gdx.audio.newSound(Gdx.files.internal("sounds/count_score.wav"));
	}

	public static void playSound (Sound sound) {
		if (Settings.soundEnabled) sound.play(1);
	}
}
