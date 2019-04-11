/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.osgimap;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.osgicommonmap.Map;

/**
 *
 * @author Borgar Bordoy
 */
public class Activator implements IGamePluginService {

    private String mapID;
    /**
     * The value indicating a clear cell
     */
    private static final int CLEAR = 0;
    /**
     * The value indicating a blocked cell
     */
    private static final int BLOCKED = 1;

    /**
     * The width in grid cells of our map
     */
    private static final int WIDTH = 15;
    /**
     * The height in grid cells of our map
     */
    private static final int HEIGHT = 15;

    /**
     * The rendered size of the tile (in pixels)
     */
    public static final int TILE_SIZE = 20;

    /**
     * The actual data for our map
     */
    private int[][] data = new int[WIDTH][HEIGHT];

    
    @Override
    public void start(GameData gameData, World world) {
        Entity map = createMap(gameData);
        mapID = world.addEntity(map);
    }

    private Entity createMap(GameData gameData) {
        Map map = new Map(WIDTH, HEIGHT);

        for (int y = 0; y < HEIGHT; y++) {
            data[0][y] = BLOCKED;
            data[2][y] = BLOCKED;
            data[7][y] = BLOCKED;
            data[11][y] = BLOCKED;
            data[WIDTH - 1][y] = BLOCKED;
        }
        for (int x = 0; x < WIDTH; x++) {
            if ((x > 0) && (x < WIDTH - 1)) {
                data[x][10] = CLEAR;
            }

            if (x > 2) {
                data[x][9] = BLOCKED;
            }
            data[x][0] = BLOCKED;
            data[x][HEIGHT - 1] = BLOCKED;
        }

        data[4][9] = CLEAR;
        data[7][5] = CLEAR;
        data[7][4] = CLEAR;
        data[11][7] = CLEAR;

        map.setData(data);
        return map;
    }

    @Override
    public void stop(GameData gameData, World world) {
        world.removeEntity(mapID);
    }

}
