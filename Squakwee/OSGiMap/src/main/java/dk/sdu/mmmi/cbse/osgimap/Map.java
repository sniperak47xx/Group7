/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.osgimap;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

/**
 *
 * @author Borgar Bordoy
 */
public class Map implements IEntityProcessingService {

    private Rectangle[] blocks; // Tiles - invisible
    private Image[] blockImage; // Image for the tile
    private Image RED_LAND; // Actual PNG image
    int arraySize = 500;
    int x, y;

    @Override
    public void process(GameData gameData, World world) {

        RED_LAND = new ImageIcon("C:/Users/Cathy/Desktop/land1s.png").getImage();
        blocks = new Rectangle[500];
        blockImage = new Image[500];

        loadArrays();
        for (int i = 0; i < arraySize; i++) {

            if (x >= 500) {
                x = 0;
                y += 20;
            }

            blockImage[i] = RED_LAND;
            blocks[i] = new Rectangle(x, y, 20, 20);

            x += 20;
        }
    }

    private void loadArrays() {
        for (int i = 0; i < arraySize; i++) {

            if (x >= 500) {
                x = 0;
                y += 20;
            }

            blockImage[i] = RED_LAND;
            blocks[i] = new Rectangle(x, y, 20, 20);

            x += 20;
        }
    }
}
