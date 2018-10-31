package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.MG;

public class LocationScreen implements Screen{

    private MG game;
    private Stage ui;
    private Label locationLabel;
    private Skin skin;


    public LocationScreen(final MG game){
        skin = new Skin(Gdx.files.internal("uiskin.json"));
        this.game = game;
        this.ui = new Stage(new ScreenViewport(),game.batch);
        Gdx.input.setInputProcessor(ui);

        this.locationLabel = new Label("MetalGear",skin);
        locationLabel.setPosition(Gdx.graphics.getWidth()/2-locationLabel.getWidth()/2, Gdx.graphics.getHeight()-100);
        ui.addActor(locationLabel);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        ui.act(delta);
        ui.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
