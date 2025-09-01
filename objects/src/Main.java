public class Main{

    public static void main(String[] args){
        Car camaro = new Car("Camaro");
        Car mustang = new Car("Mustang");
        Car audi = new Car("Audi");

        camaro.getModel();
        mustang.getModel();
        audi.getModel();
    }
}

class Car{

    String model;

    public Car(String model){
        this.model = model;
    }

    public void getModel(){
        System.out.println("This car is the model " + this.model);
    }
}