import java.util.ArrayList;
import java.awt.Color;

/**
 * Write a description of class Speedster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// The Speedster class will instantiate a speedy enemy with low heatlh, faster speed, and more gold
public class Speedster extends Enemy
{
    // TODO: Write the constructor.
    public Speedster (ArrayList<Waypoint> path) {
        super(25, 5, 15, path);
    }

    // TODO: Override getColor() and return Color.YELLOW.
    
    // getColor for the Speedster class will return the color YELLOW
    public Color getColor() {
        return Color.YELLOW;
    }
}