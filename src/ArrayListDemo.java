import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> isimListesi = new ArrayList<>();
        isimListesi.add("Ayşe");
        isimListesi.add("Ahmet");
        System.out.println(isimListesi);
        System.out.println(isimListesi.get(0));
        isimListesi.set(1,"Mehmet");
        System.out.println(isimListesi);
        isimListesi.remove(0);
        System.out.println(isimListesi);
        System.out.println("Listede olan eleman sayısı: " + isimListesi.size());
        System.out.println("listemizde Mehmet ismi: " + isimListesi.contains("Mehmet"));
        isimListesi.add("Elif");
        isimListesi.add("Eda");
        System.out.println(isimListesi);
        System.out.println("Eda isminin sırası:" + isimListesi.indexOf("Eda"));
        System.out.println(isimListesi.isEmpty());
        System.out.println("--------");

        for (String isim:isimListesi){
            System.out.println(isim);
        }
    }
}
