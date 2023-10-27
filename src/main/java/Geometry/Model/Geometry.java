/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry.Model;

/**
 *
 * @author urassh
 */
public class Geometry {
    //三角形以上のどんな多角形でも、このデータモデルが使えるようにするための配列。
    public Position[] positions = new Position[3];
    public int width;
    public int height;
    
    public Geometry(int x, int y, int width, int height) {
        this.positions[0] = new Position(x, y);
        this.width  = width;
        this.height = height;
    }
    
    public Geometry(Position point1, Position point2, Position point3) {
        this.positions[0] = point1;
        this.positions[1] = point2;
        this.positions[2] = point3;
    }
    
    public Geometry(Position point1, Position point2) {
        this.positions[0] = point1;
        this.positions[1] = point2;
    }
    
    public Position[] getPositions() {
        return this.positions;
    }
    
    public Position getPosition() {
        return this.positions[0];
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getHeight() {
        return this.height;
    }
}
