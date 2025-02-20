import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("=== Escolha a opção desejada ===");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar o carro");
            System.out.println("4 - Desacelerar o carro");
            System.out.println("5 - Virar a esquerda");
            System.out.println("6 - Virar a direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - trocar marcha");
            System.out.println("9 - sair");
            int op = sc.nextInt();
            switch (op) {
                case 1 -> car.startCar();
                case 2 -> car.endCar();
                case 3 -> car.accelerate();
                case 4 -> car.slowDown();
                case 5 -> car.turnLeft();
                case 6 -> car.turnRight();
                case 7 -> car.checkSpeed();
                case 8 -> car.changeGear();
                case 9 -> System.exit(0);
                default -> System.out.println("Opção errada!");
                }
        }while (true);


    }
}
