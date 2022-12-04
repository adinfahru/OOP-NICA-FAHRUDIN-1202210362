public class MainApp {
    public static void main(String[] args) throws Exception {
        
        Perangkat perangkat = new Perangkat("Adata",16,(float) 1.80);
        perangkat.informasi();

        Handphone handphone = new Handphone("Kingston", 4, (float) 2.10, true);
        handphone.informasi();
        handphone.telfon(628666777);
        handphone.kirimSMS(628666777);
        handphone.KirimSMS(628666777, 628777666);

        Laptop laptop = new Laptop("Seagate", 8, (float) 1.60, false);
        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("adfahru@gmail.com");
        laptop.kirimEmail("adfahru@gmail.com", "fahruad@gmail.com");
    }
}
