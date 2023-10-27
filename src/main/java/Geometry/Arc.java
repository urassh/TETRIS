/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

import Geometry.Model.Geometry;
import Geometry.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author urassh
 */
public final class Arc extends Rectangle {
    public int startAngle;
    public int endAngle;
    
    public Arc(Graphics graphics, Color color, Geometry geometry, int startAngle, int endAngle) {
        super(graphics, color, geometry);
        this.startAngle = startAngle;
        this.endAngle   = endAngle;
    }
    
    @Override
    public void draw() {
        graphics.setColor(color);
        graphics.drawArc(geometry.getPosition().x, geometry.getPosition().y, geometry.width, geometry.height, startAngle, endAngle);
    }
    
    @Override
    public void fill() {
        graphics.setColor(color);
        graphics.drawArc(geometry.getPosition().x, geometry.getPosition().y, geometry.width, geometry.height, startAngle, endAngle);
    }
}
