import java.util.Arrays;
import java.util.Iterator;

public class practice9 {
    public static void main(String[] args) {
        int[]int_dizi={3,4,5};
        Iterator<Integer>iterator= Arrays.stream(int_dizi).iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (int i = 0; i <int_dizi.length ; i++) {
            System.out.println("------"+int_dizi[i]);
        }
    }
}
