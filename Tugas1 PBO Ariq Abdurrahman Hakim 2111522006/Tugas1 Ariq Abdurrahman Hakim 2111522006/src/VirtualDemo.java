// Ariq Abdurrahman Hakim 2111522006
public class VirtualDemo {
    public static void main(String[] args) {
        Gaji s = new Gaji("Wahyu ", "KUBAR ", 3, 5000.00); //Polymorphism
        Pegawai e = new Gaji("Ini Nama ", "Samarinda ", 2, 2500.00); //Polymorphism
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");

        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}
