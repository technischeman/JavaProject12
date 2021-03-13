import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class practice2 {
    public static void main(String[] args) {
        int[]dizi={3,4,5};
       Iterator<Integer>iterator= Arrays.stream(dizi).iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
           HashSet<String> isimler=new HashSet<>();
           isimler.add("ali");
           isimler.add("veli");
           isimler.add("melih");
           isimler.forEach(item-> System.out.println(item));
           Object x=isimler.toArray();

       }
    }
}
