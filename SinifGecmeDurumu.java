import java.util.Scanner;
//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int fizik, kimya, turkce, muzik, matematik;

        Scanner input = new Scanner(System.in);

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        fizik = (fizik >= 0 && fizik <= 100) ? fizik : 0;

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        kimya = (kimya >= 0 && kimya <= 100) ? kimya : 0;

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        turkce = (turkce >= 0 && turkce <= 100) ? turkce : 0;

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        muzik = (muzik >= 0 && muzik <= 100) ? muzik : 0;

        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();
        matematik = (matematik >= 0 && matematik <= 100) ? matematik : 0;

        int toplam = (fizik + kimya + turkce + muzik + matematik);
        double ort = toplam / 5.0;
        System.out.println("Ortalamanız : " + ort);
        if(ort >= 55){
            System.out.println("Geçtiniz");
        }else{
            System.out.println("Kaldınız");
        }





    }
}















