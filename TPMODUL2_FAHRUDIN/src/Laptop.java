public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    
    public void informasi(){
        boolean myBoolean = false;
        String result = myBoolean ? "juga" : "tidak";
        System.out.println("\nLaptop ini memiliki memiliki drive tipe " + drive + " dengan ram sebesar " + ram + ", dan processor berkecepatan " + processor + " GHz, Selain itu laptop ini " + result + " memiliki Webcam");
    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim email ke " + email1 + " dan ke " + email2);
    }
}
