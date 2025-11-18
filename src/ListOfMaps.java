//Çoklu Liste Örneği
import java.util.ArrayList;
import java.util.HashMap;

public class ListOfMaps {
    public static void main(String[] args) {
        HashMap<String,String> ogrenci1 = new HashMap<>();
        ogrenci1.put("İsim", "Derya");
        ogrenci1.put("Soyisim", "Karahan");
        ogrenci1.put("Ders", "Matematik");
        ogrenci1.put("Not", "90");
        System.out.println(ogrenci1);

        HashMap<String,String> ogrenci2 = new HashMap<>();
        ogrenci2.put("İsim", "Lütfü");
        ogrenci2.put("Soyisim", "Karahan");
        ogrenci2.put("Ders", "Fen Bilimleri");
        ogrenci2.put("Not", "100");
        System.out.println(ogrenci2);

        ArrayList<HashMap<String,String>> ogrenciListesi = new ArrayList<>();
        ogrenciListesi.add(ogrenci1);
        ogrenciListesi.add(ogrenci2);
        System.out.println(ogrenciListesi);
        System.out.println(ogrenciListesi.get(0));
    }
}
