import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // objek Hewan
        ArrayList<String> hewan = new ArrayList<String>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        //print hewan
        System.out.println("List Hewan : " + hewan);


        //objek DeleteHewan
        ArrayList<String> deleteHewan = new ArrayList<String>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        System.out.println("List Hewan dihapus : " + deleteHewan);


        // Menghapus data dari objek Hewan yang ada di objek DeleteHewan
        for (String h : deleteHewan) {
            hewan.removeIf(item -> item.equals(h));
        }

        // Menampilkan isi objek Hewan setelah penghapusan data
        System.out.println("Hasil setelah penghapusan data:\n" + hewan);
    }
}