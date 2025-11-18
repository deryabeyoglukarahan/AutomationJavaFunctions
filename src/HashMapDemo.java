import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> ogrenciNotu = new HashMap<>();
        ogrenciNotu.put("Derya",100);
        ogrenciNotu.put("Lütfü",90);
        ogrenciNotu.put("Ecem",80);
        System.out.println(ogrenciNotu);

        System.out.println("Lütfü'nün ders notu:" + ogrenciNotu.get("Lütfü"));
        System.out.println("Bütün anahtar değerleri: " + ogrenciNotu.keySet());
        System.out.println("Bütün değerler:" + ogrenciNotu.values());
        System.out.println("Bütün girdi çiftleri" + ogrenciNotu.entrySet());

        ogrenciNotu.replace("Ecem",90);
        System.out.println(ogrenciNotu);
        ogrenciNotu.remove("Ecem");
        System.out.println(ogrenciNotu);
    }
}
