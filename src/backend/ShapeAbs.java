/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USER
 */

public abstract class ShapeAbs implements Shape {
    private Map<String, Double> properties;
    private Color fillColor;
    public Color color;
    public Point position;
  public ShapeAbs(Point position, Color color,Color fillColor) {
        setPosition(position);
        setColor(color);
        setFillColor(fillColor);
    this.properties = new HashMap<>();
  }
  
     
    @Override
    public void setPosition(Point position) 
    {
        this.position = position;
    }

    @Override
    public Point getPosition() 
    {
        return position;
    }

    @Override
    public void setProperties(Map<String, Double> properties) 
    {
        this.properties = properties;
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color fillColor) 
    {
        this.fillColor = fillColor;
    }

    @Override
    public Color getFillColor() 
    {
        return fillColor;
    }

    @Override
    public abstract void draw(Graphics g);
    
}
