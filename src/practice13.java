import java.util.HashSet;

public class practice13 {
    public static void main(String[] args) {
        HashSet<Integer>ekle50=new HashSet<>();
        int ilk=0;
        while (ilk<51){
            ekle50.add(ilk);
            ilk++;
        }
        System.out.println(ekle50);
        int sum=0;
        Object[]arry=ekle50.toArray();
        for (Integer sayi:ekle50){
            sum+=sayi;
        }System.out.println(sum);

    }
}
