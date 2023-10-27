/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Geometry;

import Geometry.Model.Geometry;
import java.awt.Color;

/**
 *
 * @author urassh
 */

public interface Shape {
    void draw();
    void fill();
    Geometry getGeometry();
    void setGeometry(Geometry geometry);
    void setColor(Color color);
}
