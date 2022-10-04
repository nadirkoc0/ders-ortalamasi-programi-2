import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, toplam=0, sayac=0;
        double ort;
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen Matematik notunuzu giriniz: ");
        matematik= inp.nextInt();

        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        fizik=inp.nextInt();

        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        turkce=inp.nextInt();

        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        kimya=inp.nextInt();

        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        muzik=inp.nextInt();

        if(matematik>=0 && matematik<=100){
            toplam=toplam+matematik;
            sayac++;
        }

        if(fizik>=0 && fizik<=100){
            toplam=toplam+fizik;
            sayac++;
        }

        if(turkce>=0 && turkce<=100){
            toplam=toplam+turkce;
            sayac++;
        }

        if(kimya>=0 && kimya<=100){
            toplam=toplam+kimya;
            sayac++;
        }
        
        if(muzik>=0 && muzik<=100){
            toplam=toplam+muzik;
            sayac++;
        }

        ort=toplam/sayac;

        if(ort<55){
            System.out.println("Sınıfta kaldınız...");
        }

        else{
            System.out.println("Sınıfı geçtiniz tebrikler...");
        }

        System.out.println("Ortalamanız: "+ ort);
        
    }
}
