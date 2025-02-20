public class Car {
    private boolean start = false;
    private int speed = 0;
    private int gear = 0;


    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public int getSpeed() {
        return speed;
    }


    public void startCar(){
        setStart(true);
        System.out.println("Carro ligado");
    }

    public void endCar(){
        if(speed != 0){
            System.out.println("Reduza a velocidade do carro");
        }else{
            gear = 0;
            setStart(false);
            System.out.println("Carro desligado");
        }
    }

    public void accelerate() {
        if(!isStart()) {
            System.out.println("Carro está desligado");
        } else if (gear == 0) {
            System.out.println("Marcha não está engatada");
        }else{
            System.out.println("Acelerando carro");
            speed += 1 ;
            speedLimit();
        }
    }

    public void slowDown(){
        if(isStart()){
            if(speed != 0){
                System.out.println("Desacelerando o carro");
                speed -= 1;
                speedLimit();
            }else{
                System.out.println("Carro está parado");
            }
        }else{
            System.out.println("Carro está desligado");
        }
    }

    private void speedLimit() {
        if(speed >= 120){
            System.out.println("Limite atingido");
            speed = 120; // Limite máximo de velocidade
        }

        if(speed > 0 && speed <= 20){
            gear = 1;
        } else if(speed > 20 && speed <= 40){
            gear = 2;
        } else if(speed > 40 && speed <= 60){
            gear = 3;
        } else if(speed > 60 && speed <= 80){
            gear = 4;
        } else if(speed > 80 && speed <= 100){
            gear = 5;
        } else if(speed > 100){
            gear = 6;
        }
    }

    public void turnLeft(){
        if(speed > 0 && speed <= 40){
            System.out.println("Virando a esquerda");
        } else if(speed > 40){
            System.out.println("Velocidade acima do permitido");
        } else {
            System.out.println("Carro está parado");
        }
    }

    public void turnRight(){
        if(speed > 0 && speed <= 40){
            System.out.println("Virando a Direita");
        } else if(speed > 40){
            System.out.println("Velocidade acima do permitido");
        } else {
            System.out.println("Carro está parado");
        }
    }

    public void changeGear(){
        if(gear == 6){
            System.out.println("Não tem mais marcha");
        }else{
            System.out.println("Trocando de marcha");
            gear++;
        }
    }

    public void checkSpeed(){
        System.out.println("A velocidade atual é: " + getSpeed() + "km/h");
    }


}
