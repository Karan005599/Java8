import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComp {
    public static void main(String[] args) {
        List <Integer> l = new ArrayList<>();
        l.add(2);
        l.add(23);
        l.add(25);
        l.add(7);
        l.add(0);
        Collections.sort(l, (a,b) -> b-a );
        System.out.println(l);
    }

}
