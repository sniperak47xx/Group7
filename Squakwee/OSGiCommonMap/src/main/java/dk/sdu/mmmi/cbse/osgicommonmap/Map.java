/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.osgicommonmap;

import dk.sdu.mmmi.cbse.common.data.Entity;

/**
 *
 * @author Borgar Bordoy
 */
public class Map extends Entity {

    private int WIDTH, HEIGHT;
    private int[][] data;

    public Map(int WIDTH, int HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.data = new int[WIDTH][HEIGHT];
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}
