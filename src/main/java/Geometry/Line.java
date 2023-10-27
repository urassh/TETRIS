/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

import Geometry.Model.Geometry;
import Geometry.Model.Position;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author urassh
 */
public class Line implements Shape {
    public Graphics graphics;
    public Color color;
    public Geometry geometry;
    private final Position[] lineVector = new Position[2];
    
    public Line(Graphics graphics, Color color, Geometry geometry) {
        this.graphics = graphics;
        this.color    = color;
        this.geometry = geometry;
        this.lineVector[0] = geometry.getPositions()[0];
        this.lineVector[1] = geometry.getPositions()[1];
    }
    
    @Override
    public void draw() {
        graphics.setColor(color);
        graphics.drawLine(
                lineVector[0].x,
                lineVector[0].y,
                lineVector[1].x,
                lineVector[1].y
        );
    }

    @Override
    public void fill() {
        this.draw();
    }
    
    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    

    @Override
    public Geometry getGeometry() {
        return this.geometry;
    }

    @Override
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
