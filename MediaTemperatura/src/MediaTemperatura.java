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


        System.out.println("A média das temperaturas do primeiro semestre do ano foi: " + avg );
        System.out.println("----------------------------------------"); 

        System.out.println("Os meses acima da média semestral foram: ");

        if (temperaturas.get(0) >= avg) {
            System.out.println("1-Janeiro "+ temperaturas.get(0) + "°C");
        } else{

        }
        if (temperaturas.get(1) >= avg) {
            System.out.println("2-Fevereiro "+ temperaturas.get(1) + "°C");
        } else{

        }
        if (temperaturas.get(2) >= avg) {
            System.out.println("3-Março "+ temperaturas.get(2) + "°C");
        }else{

        }
        if (temperaturas.get(3) >= avg) {
            System.out.println("4-Abril "+ temperaturas.get(3) + "°C");
        } else{

        }
        if (temperaturas.get(4) >= avg) {
            System.out.println("5-Maio "+ temperaturas.get(4) + "°C");
        } else{

        }
        if (temperaturas.get(5) >= avg) {
            System.out.println("6-Junho "+ temperaturas.get(5) + "°C");
        } else {
            
        }
        
        temperatura.close();
    }
    
}
       





