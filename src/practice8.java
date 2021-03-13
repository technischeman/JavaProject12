import java.util.HashSet;
import java.util.Iterator;

public class practice8 {
    public static void main(String[] args) {
        HashSet<String>set_1=new HashSet<>();
        HashSet<String>set_2=new HashSet<>();
        set_2.add("abc");
        System.out.println("abc".hashCode());
        set_1.add("abc");
        set_1.add("abcd");
        set_1.add("abce");
        set_1.add("abcf");
        set_1.add("abcc");
        System.out.println(set_1);
        set_1.add("abcc");
        System.out.println(set_1);
        int hashcode= "abc".hashCode();
        System.out.println(hashcode);
        boolean iceririmi= set_1.contains("abc");
        boolean iceririmid= set_1.contains("x");
        System.out.println(iceririmi);
        System.out.println(iceririmid);
        set_1.remove("abc");
        System.out.println(set_1);
        Iterator<String>iterator=set_1.iterator();
        while (iterator.hasNext()){
            System.out.print("harf="+iterator.next()+" ");


        }
    }
}
