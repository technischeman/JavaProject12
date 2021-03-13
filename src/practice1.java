import java.util.HashSet;
import java.util.Iterator;

public class practice1 {
    public static void main(String[] args) {
        HashSet<String>isimler=new HashSet<>();
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("melih");
        isimler.contains("a");
        System.out.println("isismler"+isimler);
        isimler.add("veli");
        System.out.println(isimler);
        int hash1="ali".hashCode();
        int hash2="veli".hashCode();
        int hash3="melih".hashCode();
        System.out.println(hash1);
        System.out.println(hash2);
        System.out.println(hash3);
        boolean icerirmi=isimler.contains("veli");
        boolean icerirmi1=isimler.contains("xdkx");
        System.out.println(icerirmi);
        System.out.println(icerirmi1);
        isimler.remove("melih" +
                "");
        System.out.println(isimler);
        Iterator<String>iterator=isimler.iterator();
        while (iterator.hasNext()){
            System.out.println("isimler"+iterator.next());
        }

    }
}
