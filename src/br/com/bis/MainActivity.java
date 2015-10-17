package br.com.bis;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;

import br.com.bis.meteoros.scenes.TitleScreen;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//definindo a orientacao como landscape
		setRequestedOrientation(
				ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
				requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(
				WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		//configura a tela
		CCGLSurfaceView glSurfaceView = new CCGLSurfaceView(this);
		setContentView(glSurfaceView);
		CCDirector.sharedDirector().attachInView(glSurfaceView);
		
		//configura CCDirector
		CCDirector.sharedDirector().seScreenSize(320, 480);
		
		//abre a tela principal
		CCScene scene = new TitleScreen().scene();
		CCDirector.sharedDirector().runWithScene(scene);

	}

}
