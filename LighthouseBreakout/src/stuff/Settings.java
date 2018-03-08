package stuff;

import java.awt.event.KeyEvent;

import stuff.Style.Theme;

class Settings {
	// display settings
	static int FRAME_TICK_MS = 20;
	static boolean SHOW_FPS_ON_DISPLAY = true;
	static boolean SHOW_RASTER_ON_DISPLAY = true;
	static Theme THEME = Style.Theme.SPOOKY;

	// game engine settings
	static int GAME_TICK_MS = 10;
	static int RESET_TIMEOUT = 300;

	// animation settings
	static boolean DO_ANIMATIONS = true;
	static boolean PLAYER_INVINCEBLE = false;
	static boolean BRICK_COLLISION = true;
	static boolean GAME_RUNNING = false;
	static boolean MENU_VIEW = true;
	static boolean HAX_ON = true;
	static boolean OPTIONS_MENU = false;
	static boolean MOUSE_CONTROL = false;
	static boolean GAME_WON = false;
	static boolean SOUND_XP_START = false;	//on restart
	static boolean SOUND_XP_SHUTDOWN = true; //on game lost
	static boolean SOUND_SAD_TRUMPET = false; //alternative on game lost
	static boolean FONT_CUSTOM = true;
	static int SCORE = 0;
	

	// window settings
	static enum Keys {
		PADDEL_LEFT(KeyEvent.VK_LEFT),
		PADDEL_RIGHT(KeyEvent.VK_RIGHT),
		SWITCH_FPS_DISPLAY(KeyEvent.VK_F),
		PAUSE_GAME(KeyEvent.VK_P),
		SHOW_MENU(KeyEvent.VK_ESCAPE),
		HAX_SWITCH(KeyEvent.VK_C), 
		CONTROL_SWITCH(KeyEvent.VK_M),
		ENGINE_RESET(KeyEvent.VK_R),
		DEBUG(KeyEvent.VK_D), 
		GAME_START(KeyEvent.VK_SPACE);

		int keyCode;

		Keys(int keyCode) {
			this.keyCode = keyCode;
		}
	}
	
	// other settings
	public static final boolean CONNECT_TO_LIGHTHOUSE = !true ;
	public static final String PLAYER_NAME = "YOU";
}
