/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;


import Geometry.Model.Geometry;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author urassh
 */
public final class RoundRectangle extends Rectangle {
    public int roundWidth;
    public int roundHeight;
    
    public RoundRectangle(Graphics graphics, Color color, Geometry geometry, int roundWidth, int roundHeight) {
        super(graphics, color, geometry);
        this.roundWidth = roundWidth;
        this.roundHeight = roundHeight;
    }
    
    @Override
    public void draw() {
        graphics.setColor(color);
        graphics.drawRoundRect(geometry.getPosition().x, geometry.getPosition().y, geometry.width, geometry.height, roundWidth, roundHeight);
    }
    
    @Override
    public void fill() {
        graphics.setColor(color);
        graphics.fillRoundRect(geometry.getPosition().x, geometry.getPosition().y, geometry.width, geometry.height, roundWidth, roundHeight);
    }
}
