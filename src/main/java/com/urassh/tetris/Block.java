/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author urassh
 */

package com.urassh.tetris;

import Geometry.Model.Geometry;
import Geometry.Model.Position;
import Geometry.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Block extends Rectangle{
    public static final int WIDTH  = 30;
    public static final int HEIGHT = 30;
    private static final Color COLOR = new Color(0,0,0);

    public Block(Graphics graphics, Position position) {
        super(graphics, COLOR,  new Geometry(position.x, position.y, WIDTH, HEIGHT));
    }
}
