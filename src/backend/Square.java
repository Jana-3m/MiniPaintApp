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
public class Square extends Rectangle{
    public Square(Point position, Map<String, Double> properties, Color color, Color fillColor) {
        super(position, properties,color, fillColor);
    }
}
    
    /*public boolean isSquare() 
    {
        Map <String, Double> properties = getProperties();
        if (properties.containsKey("length")&&properties.containsKey("width")) {
            double length = properties.get("length");   //returns diuble
            double width = properties.get("width");
            return length == width; 
        }
        return false;  
    }*/

