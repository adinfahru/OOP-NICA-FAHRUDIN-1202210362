public class MainApp {
    public static void main(String[] args) throws Exception {
        
        TransportasiAir transportasiAir = new TransportasiAir(5, 5000);
        transportasiAir.informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();

        Sampan sampan = new Sampan(10, 2000, 3);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(5);

        Kapal kapal = new Kapal(100, 100000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(50);
        kapal.berlabuh();
    }
}
