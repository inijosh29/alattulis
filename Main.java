class AlatTulis {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargaTotal;
  
    // Setter untuk memasukkan nama, stok, harga satuan, dan harga total
    public void setATK(String nama, int stok, int hargaSatuan) {
      this.nama = nama;
      this.stok = stok;
      this.hargaSatuan = hargaSatuan;
      this.hargaTotal = stok * hargaSatuan;
    }
  
    // Getter untuk menampilkan nama, stok, harga satuan, dan harga total
    public void getData() {
      System.out.println("Nama Alat Tulis: " + nama);
      System.out.println("Stok: " + stok);
      System.out.println("Harga Satuan: " + hargaSatuan);
      System.out.println("Harga total jika semua " + nama + " terbeli: " + hargaTotal);
      System.out.println();
    }
  
    // Getter untuk mendapatkan harga total
    public int getHargaTotal() {
      return hargaTotal;
    }
  }
  
  class Penjual {
    private int totalHarga = 0;
  
    // Setter untuk menghitung total harga
    public void setTotalHarga(AlatTulis[] alatTulisBA) {
      for (AlatTulis alatTulis : alatTulisBA) {
        totalHarga += alatTulis.getHargaTotal();
      }
    }
  
    // Getter untuk menampilkan total harga
    public int getTotalHarga() {
      return totalHarga;
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      // Membuat objek alat tulis
      AlatTulis bolpoint = new AlatTulis();
      AlatTulis pensil = new AlatTulis();
      AlatTulis penghapus = new AlatTulis();
  
      // Mengisi data untuk masing-masing alat tulis
      bolpoint.setATK("Bolpoint", 10, 2000);
      pensil.setATK("Pensil", 10, 1000);
      penghapus.setATK("Penghapus", 10, 500);
  
      // Menampilkan data setiap alat tulis
      bolpoint.getData();
      pensil.getData();
      penghapus.getData();
  
      // Menghitung dan menampilkan total harga semua alat tulis
      Penjual penjual = new Penjual();
      penjual.setTotalHarga(new AlatTulis[] { bolpoint, pensil, penghapus });
      System.out.println("Total Harga semua alat tulis: " + penjual.getTotalHarga());
    }
  }