package br.com.bis.meteoros.scenes;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.types.CGPoint;

import static br.com.bis.meteoros.scenes.DeviceSettings.screenHeight;
import static br.com.bis.meteoros.scenes.DeviceSettings.screenWidth;

public class TitleScreen extends CCLayer{
	
	private ScreenBackground background;
	
	//Preparando a tela inicial
	public CCScene scene(){
		CCScene scene = CCScene.node();
		scene.addChild(this);
		return scene;
	}
	
	public TitleScreen(){
		this.background = new ScreenBackground(Assets.BACKGROUND);
		this.background.setPosition(
				screenResolution(CGPoint.ccp(
						CCDirector.sharedDirector().winSize().width / 2.0f,
						CCDirector.sharedDirector().winSize().height / 2.0f
						)));
		this.addChild(background);
	}

}
