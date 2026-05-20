import java.util.ArrayList;
import java.awt.Color;

/**
 * Write a description of class Tank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// The Tank class will instantiate a tankier enemy with larger heatlh, slower speed, and more gold
public class Tank extends Enemy
{
    // TODO: Write the constructor.
    public Tank (ArrayList<Waypoint> path) {
        super(200, 1, 30, path);
    }

    // TODO: Override getColor() and return Color.BLUE.
    
    // getColor for the Tank class will return the color BLUE
    public Color getColor() {
        return Color.BLUE;
    }
}