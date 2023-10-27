/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

import Geometry.Model.Position;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author urassh
 */
public class Font {
    //font-family
    public static final String SERIF  = "serif";
    public static final String GOTHIC = "ＭＳ ゴシック";
    
    //font-weight
    public static final int BOLD = 1;
    public static final int SEMI_BOLD = 2;
    public static final int NORMAL = 3;
    public static final int LIGHT = 4;
    public static final int THIN = 5;
    
    public static final Color BLACK = new Color(50, 50, 50);
    
    private final Graphics graphics;
    private final String content;
    private final Position position;
    private final Color color;
    private final java.awt.Font font;
    
    public Font(Graphics graphics, Position position, String content, String fontFamily, Color color, int fontWeight, int fontSize) {
        this.font = new java.awt.Font(fontFamily,fontWeight,fontSize);
        this.graphics = graphics;
        this.color = color;
        this.content = content;
        this.position = position;
    }
    
    public void draw() {
        graphics.setFont(font);
        graphics.setColor(color);
        graphics.drawString(content, position.x, position.y);
    }
}
