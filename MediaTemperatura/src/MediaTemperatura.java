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
        System.out.println("Todas as temperaturas do primeiro semestre: " + temperaturas);
        System.out.println("----------------------------------------"); 

        float media, soma = 0;

        int length = temperaturas.size();

        for (double temp : temperaturas) {
            soma += temp;
          }

          media = soma / length;


        System.out.println("A média das temperaturas do primeiro semestre do ano foi de " + media + "°C");
        System.out.println("----------------------------------------"); 

        System.out.println("Os meses com as temperaturas acima da média semestral foram: ");

        if (temperaturas.get(0) >= media) {
            System.out.println("1-Janeiro "+ temperaturas.get(0) + "°C");
        } else{

        }
        if (temperaturas.get(1) >= media) {
            System.out.println("2-Fevereiro "+ temperaturas.get(1) + "°C");
        } else{

        }
        if (temperaturas.get(2) >= media) {
            System.out.println("3-Março "+ temperaturas.get(2) + "°C");
        }else{

        }
        if (temperaturas.get(3) >= media) {
            System.out.println("4-Abril "+ temperaturas.get(3) + "°C");
        } else{

        }
        if (temperaturas.get(4) >= media) {
            System.out.println("5-Maio "+ temperaturas.get(4) + "°C");
        } else{

        }
        if (temperaturas.get(5) >= media) {
            System.out.println("6-Junho "+ temperaturas.get(5) + "°C");
        } else {
            
        }

        temperatura.close();
    }
    
}
       





