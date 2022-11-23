package paket2;

public class array {
    public static void main(String[] args){
        //array
        //tipeData[] namaVar = new tipeData[]
        int [] kotak = new int[3];
        int[] kotak2 ={100, 200, 300, 400};
        kotak[0] =100; kotak[1] =200; kotak[2] = 300;

        for(int i=0; i<4; i++){
            System.out.println(kotak[i]);
            System.out.println(kotak2[i]);
        }
    }
}
