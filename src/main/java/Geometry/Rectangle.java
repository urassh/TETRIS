/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

import Geometry.Model.Geometry;
import Geometry.Model.Position;
import java.awt.*;

/**
 *
 * @author urassh
 */
public class Rectangle implements Shape {
    public Graphics graphics;
    public Color color;
    public Geometry geometry;
    
    public Rectangle(Graphics graphics, Color color, Geometry geometry) {
        this.graphics  = graphics;
        this.color     = color;
        this.geometry  = geometry;
    }
    
    @Override
    public void draw() {
        graphics.setColor(color);
        graphics.drawRect(geometry.getPosition().x, geometry.getPosition().y, geometry.width, geometry.height);
    }
    
    @Override
    public void fill() {
        graphics.setColor(color);
        graphics.fillRect(geometry.getPosition().x, geometry.getPosition().y, geometry.width, geometry.height);
    }
    
    @Override
    public Geometry getGeometry() {
        return geometry;
    }

    @Override
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
    
    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    
    public void continuousShape(Position end) {
        Position start = new Position(
                this.getGeometry().getPosition().getX(),
                this.getGeometry().getPosition().getY()
        );
        
        final int rangeX = end.getX() - start.getX();
        final int rangeY = end.getY() - start.getY();
        
        for (int x = start.getX(); x <= rangeX; x++) {
            for (int y = start.getY(); y <= rangeY; y++) {
                Geometry newGeometry = new Geometry(
                        start.getX() + x,
                        start.getY() + y,
                        this.getGeometry().getWidth(),
                        this.getGeometry().getHeight()
                );
                
                this.setGeometry(newGeometry);
                this.fill();
            }
        }
    }
    
    public void linerGradations(Position end, Color startColor, Color endColor) {
        Position start = new Position(
            this.getGeometry().getPosition().getX(),
            this.getGeometry().getPosition().getY()
        );
        
        final int rangeX = end.getX() - start.getX();
        final int rangeY = end.getY() - start.getY();
        
        final double redDiff   = endColor.getRed()   - startColor.getRed();
        final double greenDiff = endColor.getGreen() - startColor.getGreen();
        final double BlueDiff  = endColor.getBlue()  - startColor.getBlue();
        
        for (int x = start.getX(); x <= rangeX; x++) {
            for (int y = start.getY(); y <= rangeY; y++) {
                //開始地点が0, 終了地点が1になる補完係数。
                double factorX = (x - start.getX()) / (double) rangeX;
                double factorY = (y - start.getY()) / (double) rangeY;
                
                int red = (int) (startColor.getRed() + (redDiff * factorX));
                int green = (int) (startColor.getGreen() + (greenDiff * factorY));
                int blue = (int) (startColor.getBlue() + (BlueDiff * factorX));
                
                Color currentColor = new Color(red, green, blue);
                
                Geometry newGeometry = new Geometry(
                        start.getX() + x,
                        start.getY() + y,
                        this.getGeometry().getWidth(),
                        this.getGeometry().getHeight()
                );
                
                this.setGeometry(newGeometry);
                this.setColor(currentColor);
                this.fill();
            }
        }
    }
}
