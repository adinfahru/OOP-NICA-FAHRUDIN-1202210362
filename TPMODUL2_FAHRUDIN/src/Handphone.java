public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
    public void informasi(){
        boolean myBoolean = true;
        String result = myBoolean ? "juga" : "tidak";
        System.out.println("\nHandphone ini memiliki memiliki drive tipe " + drive + " dengan ram sebesar " + ram + ", dan processor berkecepatan " + processor + " GHz, Selain itu handphone ini " + result + " memiliki Fingerprint");
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
    }

    public void KirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan ke No " + no_hp2);
    }
    
}
    

    

