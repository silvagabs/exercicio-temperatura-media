import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaTemperatura {
    public static void main(String[] args) {
       
        Scanner temperatura= new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.print("Digite a temperatura: ");
            double temp = temperatura.nextDouble();
            temperaturas.add(temp);
            count++;
        }

        System.out.println("----------------------------------------");     
        System.out.println("Todas as temperaturas: " + temperaturas);
        System.out.println("----------------------------------------"); 

        float avg, sum = 0;

        int length = temperaturas.size();

        for (double temp : temperaturas) {
            sum += temp;
          }

          avg = sum / length;


        System.out.println("A média das temperaturas do primeiro semestre do ano foram: " + avg );
        
    }
}
       





