package Set;

import java.util.HashSet;
import java.util.Set;

public class AprendendoSobreTreeSet {
    public static void main(String[] args) {
        Set<product> set = new HashSet<>();
        set.add(new product("TV", 900.0));
        set.add(new product("Notebook", 1200.0));
        set.add(new product("Tablet", 400.0));

        for ( product JJJ: set){
            System.out.println(JJJ);
        }
    }
}
