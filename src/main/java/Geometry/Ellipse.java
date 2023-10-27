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
public final class Ellipse extends Rectangle {
    public Ellipse(Graphics graphics, Color color, Geometry geometry) {
        super(graphics, color, geometry);
    }
    
    @Override
    public void draw() {
        graphics.setColor(color);
        graphics.drawOval(geometry.getPosition().x, geometry.getPosition().y, geometry.width, geometry.height);
    }
    
    @Override
    public void fill() {
        graphics.setColor(color);
        graphics.fillOval(geometry.getPosition().x, geometry.getPosition().y, geometry.width, geometry.height);
    }
}
