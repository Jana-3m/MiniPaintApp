/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


import java.util.HashMap;
import java.util.Map;
import java.awt.*;

/**
 *
 * @author USER
 */
public class Rectangle extends ShapeAbs {

    public double width;
    public double length;
    protected double side;

    public Rectangle(Point position, Map<String, Double> properties, Color color, Color fillColor) {
        super(position, color,fillColor);
        this.length= properties.get("length");
        this.width=properties.get("width");
        properties.put("length", side);
        properties.put("width", side);
    }

    @Override
    public void draw(Graphics g) {
        int x = (int) getPosition().getX();
        int y = (int) getPosition().getY();
        g.setColor(getColor());
        g.fillRect(x, y, (int) width, (int) length);
    }
}


    /*
    @Override
    public void draw(java.awt.Graphics canvas)
    {
        canvas.setColor(color);
        int length = (int) (double) properties.get("length");   //casting for drawRecr
        int width = (int) (double) properties.get("width");
        canvas.drawRect(position.x, position.y, width, length);
        canvas.setColor(fillColor);
        canvas.fillRect(position.x, position.y, width, length);
    }
    //public Point getPosition(); 
    //public void setProperties(Map<String,Double> properties);
    //public Map <String, Double> getProperties();
    //public void setColor(Color color);
    //public Color getColor();
    //public void setFillColor(Color color);
    //public Color getFillColor();
    //public void draw(java.awt.Graphics canvas); - done*/

