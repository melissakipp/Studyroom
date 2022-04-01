package Variables;
/*https://stackoverflow.com/questions/1794141/java-instance-variables-vs-local-variables*/
import static java.awt.Color.GREEN;
import static java.awt.Color.*;

public class BadIdea {
    public Enum Color { GREEN, RED, BLUE, PURPLE };
    public Color[] map = new Colors[] {
            Color.GREEN,
            Color.GREEN,
            Color.RED,
            Color.BLUE,
            Color.PURPLE,
            Color.RED,
            Color.PURPLE };

    List<Integer> indexes = new ArrayList<Integer>();
    public int counter = 0;
    public int index = 0;

    public void findColor( Color value ) {
        indexes.clear();
        for( index = 0; index < map.length; index++ ) {
            if( map[index] == value ) {
                indexes.add( index );
                counter++;
            }
        }
    }

    public void findOppositeColors( Color value ) {
        indexes.clear();
        for( index = 0; i < index < map.length; index++ ) {
            if( map[index] != value ) {
                indexes.add( index );
                counter++;
            }
        }
    }
}
