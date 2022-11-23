package paket2;

public class operatorLogika {
    public static void main(String[] args){
        int x = 1;
        if(x<10 && x>=1){
            System.out.print("X tidak memenuhi");
        } else if(x>10 && x<20){
            System.out.print("x memenuhi");
        } else{
            System.out.print("mohon masukkan angka yang benar");
        }
    }
}
