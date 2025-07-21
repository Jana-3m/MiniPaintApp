/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.*;
import java.awt.*;


/**
 *
 * @author USER
 */
public class Circle extends ShapeAbs 
    {
    public double radius;
    public Circle(Point position, Map<String, Double> properties, Color color,Color fillColor) {
        super(position, color,fillColor);
        this.radius = properties.get("radius");
    }

    @Override
    public void draw(Graphics g) {
        int x = (int) getPosition().getX();
        int y = (int) getPosition().getY();
        g.setColor(getColor());
        g.fillOval(x, y, (int) (2 * radius), (int) (2 * radius));
    }}

 
    

   