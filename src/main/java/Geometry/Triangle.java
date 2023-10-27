/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

import Geometry.Model.Geometry;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author urassh
// */
public final class Triangle implements Shape {
    public Graphics graphics;
    public Color color;
    public Geometry geometry;
    
    private final Polygon triangle;
    
    public Triangle(Graphics graphics, Color color, Geometry geometry) {
        this.graphics = graphics;
        this.color    = color;
        this.geometry  = geometry;
        this.triangle = new Polygon();
    }
    
    private void setPoints() {
        triangle.addPoint(geometry.positions[0].x, geometry.positions[0].y);
        triangle.addPoint(geometry.positions[1].x, geometry.positions[1].y);
        triangle.addPoint(geometry.positions[2].x, geometry.positions[2].y);
    }
    
    @Override
    public void draw() {
        setPoints();
        graphics.drawPolygon(triangle);
    }
    
    @Override
    public void fill() {
        setPoints();
        graphics.setColor(color);
        graphics.fillPolygon(triangle);
    }
    
    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public Geometry getGeometry() {
        return geometry;
    }

    @Override
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
