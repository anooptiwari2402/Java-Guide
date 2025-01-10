public class Main {
    public static void main(String[] args) {

        int i= 0;
        Car car1 = new Car("Red", "Swift");
        car1.detail();
    }
}


class Car{
    String colour;
    String model;

    public Car(){}

    public Car(String colour, String model){
        this.colour = colour;
        this.model = model;
        detail();
    }

    public void drive(){
        System.out.println("Car is driving");
    }

    public void detail(){
        System.out.println("Car colour: "+colour+" Car Model: "+model);
    }
}