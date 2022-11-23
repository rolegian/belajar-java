package paket2;

public class parameter {
    public static void main(String [] args){
        //namaKelas nama = new namaKelas();
        parameter udin = new parameter();
        udin.berjalan("set prok", 20);
    }

    //parameter
    //method= fungsi void
    void berjalan(String suara, int angka){
        System.out.println("berjalan "+ suara+' '+angka);
    }
}
