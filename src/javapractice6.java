import java.util.HashSet;
import java.util.Iterator;

public class javapractice6 {
    public static void main(String[] args) {
        HashSet<String> group1=new HashSet<>();
        HashSet<String> group2=new HashSet<>();
        group1.add("adem");
        group1.add("hasan");
        group1.add("metin");
        group2.add("alp");
        group2.add("hasan");
        group2.add("cem");

        HashSet<String>allnames=new HashSet<>(group1);
        //allnames.addAll(group1);
        allnames.addAll(group2);
        System.out.println(allnames);

    }
}
