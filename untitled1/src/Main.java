import java.util.Optional;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Ben kurstan bağımsız kendi örneklerimi yaptım,daha yolun başındayız, lütfen üstten bakmayınız. :)
        float s1,s2;
        float sonuc;
        char islem;
        System.out.println("Hangi işlemi yapmak istiyorsunuz: ");
        Scanner input = new Scanner(System.in);
        islem=input.next().charAt(0);
        switch(islem)
        {
            case '+':System.out.println("Birinci sayıyı girin: ");
                     s1= input.nextFloat();
                     System.out.println("İkinci sayıyı girin: ");
                     s2= input.nextFloat();
                     sonuc=s1+s2;
                     System.out.println("Girdiğiniz sayıların toplamı = "+sonuc);
                     break;
            case '-':System.out.println("Birinci sayıyı girin: ");
                     s1= input.nextFloat();
                     System.out.println("İkinci sayıyı girin: ");
                     s2= input.nextFloat();
                     sonuc=s1-s2;
                     System.out.println("Girdiğiniz sayıların farkı = "+sonuc);
                     break;
            case '*':System.out.println("Birinci sayıyı girin: ");
                     s1= input.nextFloat();
                     System.out.println("İkinci sayıyı girin: ");
                     s2= input.nextFloat();
                     sonuc=s1*s2;
                     System.out.println("Girdiğiniz sayıların çarpımı = "+sonuc);
                     break;
            case '/':System.out.println("Birinci sayıyı girin: ");
                     s1= input.nextFloat();
                     System.out.println("İkinci sayıyı girin: ");
                     s2= input.nextFloat();
                     sonuc=s1/s2;
                     System.out.println("Girdiğiniz sayıların bölümü = "+sonuc);
                     break;
            default:System.out.println("Geçersiz bir işlem yapmak istediniz!");
                     break;
        }



    }
}