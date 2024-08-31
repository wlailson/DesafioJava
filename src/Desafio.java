import java.util.Locale;
import java.util.Scanner;
public class Desafio{
    public static void main(String[] args) throws Exception {
        Scanner leitorDeEntradas = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu salario");
        float salario = leitorDeEntradas.nextInt();
        
System.out.println("Seus beneficios");
        float beneficios = leitorDeEntradas.nextInt();
        
        float imposto = 0;
        if(salario<1100) imposto = salario * 0.05F;
        else if(salario<=2500) imposto = salario * 0.10F;
        else if(salario>2500) imposto = salario * 0.15F;

        float saida = salario - imposto + beneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
