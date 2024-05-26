import java.util.Scanner;
public class KDVkiyas {
    public static void main(String[] args){
        //Degiskenlerimizi tanimlayalim.
        int para;

        //Scanner sinifimizi tanimladik.
        Scanner input = new Scanner(System.in);
        //Kullanicidan deger alalim.
        System.out.print("KDV'siz fiyat : ");
        para = input.nextInt();

        double KDV = (para >= 1000) ? 0.08 : 0.18;
        double KDVli = (para + para * KDV);
        System.out.println("KDV'li fiyat : " +KDVli );
        System.out.println("KDV tutari : " + KDV);


   }
}


