import java.util.HashSet;

public class practice11 {
    public static void main(String[] args) {
        HashSet<String> set_1 = new HashSet<>();
        HashSet<String> set_2 = new HashSet<>();
        set_2.add("abc");
        //System.out.println("abc".hashCode());
        set_1.add("abc");
        set_1.add("abcd");
        set_1.add("abce");
        set_1.add("abcf");
        set_1.add("abcc");
        set_1.add("abcdcscsvc");
        set_1.add("abccy  cy ");
        set_1.add("abcvcvcc");
        set_1.add("ab c ccc");
        set_1.add("vvabcc");
        set_1.add("abc ccc");
        set_1.add("abcvccc");
        set_1.add("abdffdcc");
        set_1.add("abc vcvcvvcc c ");
        set_1.add("abcfdfc");
        set_1.add("abcdcdc");
        set_1.add("acxcbcc");
        long startfor = System.currentTimeMillis();
        set_1.forEach(xsx -> System.out.println(xsx));
        long finish = System.currentTimeMillis();
        System.out.println(finish - startfor);
        long startarr = System.currentTimeMillis();
        Object[] arry = set_1.toArray();
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]); }
        long finisharr= System.currentTimeMillis();
        System.out.println(finisharr-startarr);
        long startforeachloop= System.currentTimeMillis();
        for (String harf:set_1){
            System.out.println(harf);
        }long finishforeachloop= System.currentTimeMillis();
        System.out.println(finishforeachloop-startforeachloop);
        int elemansayi=set_1.size();
        System.out.println(elemansayi);
        set_1.clear();
        System.out.println(set_1);



}}

