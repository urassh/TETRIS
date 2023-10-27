/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.urassh.tetris;

import Geometry.Model.Geometry;
import Geometry.Model.Position;
import Geometry.Rectangle;
import Geometry.RoundRectangle;
import Geometry.Triangle;
import Geometry.Line;
import Geometry.Font;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author urassh
 */
public class TETRIS extends Frame {
    private static final int marginX = 80;
    private static final int marginY = 100;
    private static final Field field = new Field();
    
    public static void main(String[] args) {
        TETRIS tetris = new TETRIS();
    }
    
    public TETRIS() {
        super("TETRIS");
        addWindowListener(new WindowListener());
        setSize(600, 800);
        setVisible(true);
        
        this.setBackground(Color.LIGHT_GRAY);
    }
    
    @Override
    public void paint(Graphics graphics) {
        for (int y = 0; y < field.FIELD.length; y++) {
            for (int x = 0; x < field.FIELD[y].length; x++) {
                if (field.FIELD[y][x] == 1) {
                    Block block = new Block(graphics,  new Position(marginX + (x * Block.WIDTH) + x, marginY + (y * Block.HEIGHT) + y));
                    block.fill();
                }
            }
        }
    }
    
    class WindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent event) {
            System.exit(0);
        }
    }
}
