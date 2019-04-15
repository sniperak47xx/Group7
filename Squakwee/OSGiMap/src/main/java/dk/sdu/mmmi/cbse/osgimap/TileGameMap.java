package dk.sdu.mmmi.cbse.osgimap;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TileGameMap extends Game {

    SpriteBatch batch;
    Texture img;

    @Override
    public void create() {

        setScreen(new Play());
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
