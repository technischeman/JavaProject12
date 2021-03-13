import java.util.ArrayList;
import java.util.Iterator;

public class practice10 {
    public static void main(String[] args) {
        ArrayList<String>liste_1=new ArrayList<>();
        liste_1.add("ahhdk");
        liste_1.add("ahskdk");
        liste_1.add("ahhdnndk");
        Iterator<String>iterator= liste_1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
