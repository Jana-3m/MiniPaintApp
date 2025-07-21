/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.awt.BasicStroke;

/**
 *
 * @author USER
 */
public class LineSegment extends ShapeAbs {
   public Point endPoint;
    public LineSegment(Point position, Color color, Map<String, Double> properties,Point endPoint) 
    {
        super(position,color,null);
        setPosition(position);
        this.endPoint=endPoint;
        setProperties(properties);
        setColor(this.color);
    }
    @Override
    public void draw(Graphics g) 
    { 
        g.setColor(color);
        g.drawLine(position.x, position.y, endPoint.x, endPoint.y);
    }
    
    @Override
    public void setFillColor(Color color)
    {
    }
    @Override
    public Color getFillColor()
    {
        return null;
    }
    
}
