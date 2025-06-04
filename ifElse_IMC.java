import java.util.Scanner;

public class ifElse_IMC {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua altura (em metros): ");
        double h = leia.nextDouble();

        System.out.println("Digite o seu peso (em kg): ");
        double p = leia.nextDouble();

        leia.close();

        double imc = p / (h * h);
            
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
