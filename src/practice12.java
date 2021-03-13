import java.util.HashSet;
import java.util.Iterator;

public class practice12 {
    public static void main(String[] args) {
        HashSet<Integer> besadet = new HashSet<>();
        besadet.add(15);
        besadet.add(16);
        besadet.add(55);
        besadet.add(25);
        besadet.add(125);
        int sum = 0;
        Iterator<Integer> abc = besadet.iterator();
        while (abc.hasNext()) {
            sum += abc.next();
        } System.out.println(sum);
        Object[] array_ = besadet.toArray();
        for (int i = 0; i < array_.length; i++) {
            System.out.println(array_[i]); }
        System.out.println("son");
        besadet.forEach(sayi -> System.out.println(sayi));
        for (int i = 0; i < besadet.size(); i++) {
        }for (Integer sayi : besadet) {
            sum += sayi; }
        System.out.println(sum); }}

