package Variables;
/*https://stackoverflow.com/questions/1794141/java-instance-variables-vs-local-variables*/
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GoodIdea {
   ...

    public List<Integer> findColor(Color value ) {
        List<Integer> results = new ArrayList<Integer>();
        boolean map;
        for(int i = 0; i < map.length; i++ ) {
            if( map[index] == value ) {
                results.add( i );
            }
        }
        return results;
    }

    public List<Integer> findOppositeColors( Color value ) {
        List<Integer> results = new ArrayList<Integer>();
        for( int i = 0; i < map.length; i++ ) {
            if( map[index] != value ) {
                results.add( i );
            }
        }
        return results;
    }
}
