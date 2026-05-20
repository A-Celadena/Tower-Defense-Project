import java.awt.Color;

/**
 * Write a description of class RapidTower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RapidTower extends Tower
{
    // TODO: Write the constructor.
    public RapidTower(int x, int y) {
        super(x, y, 80, 4, 75, 5);
    }

    // TODO: Override getColor() and return Color.GREEN.
    
    // getColor for the RapidTower class will return the color GREEN
    public Color getColor() {
        return Color.GREEN;
    }
}