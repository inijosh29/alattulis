import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class stokalattulis {

    static class Item {
        private String nama;
        private int stok;
        private double harga;

        public Item(String nama, int stok, double harga) {
            this.nama = nama;
            this.stok = stok;
            this.harga = harga;
        }

        public String getNama() {
            return nama;
        }

        public int getStok() {
            return stok;
        }

        public double getHarga() {
            return harga;
        }

        public void tampilkanInfo() {
            System.out.println("Nama barang: " + nama);
            System.out.println("Stok barang: " + stok);
            System.out.println("Harga barang: " + String.format("%.2f", harga));
            System.out.println(); // Baris kosong untuk pemisah
        }
    }

    public static void main(String[] args) {
        // Daftar barang
        List<Item> inventaris = new ArrayList<>();

        // Menambahkan tiga item
        inventaris.add(new Item("Pensil", 100, 2000));
        inventaris.add(new Item("Penghapus", 50, 1500));
        inventaris.add(new Item("Buku", 30, 5000));

        // Menampilkan semua barang dalam inventaris
        System.out.println("Inventaris saat ini:");
        // Mengurutkan barang berdasarkan nama secara alfabetis
        Collections.sort(inventaris, Comparator.comparing(Item::getNama));
        for (Item item : inventaris) {
            item.tampilkanInfo();
        }
    }
}
