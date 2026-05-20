import java.awt.Color;

/**
 * Write a description of class SniperTower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SniperTower extends Tower
{
    // TODO: Write the constructor.
    public SniperTower(int x, int y) {
        super(x, y, 250, 25, 100, 30);
    }

    // TODO: Override getColor() and return Color.PINK.
    
    // getColor for the SniperTower class will return the color PINK
    public Color getColor() {
        return Color.PINK;
    }
}