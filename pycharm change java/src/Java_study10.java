public class Java_study10 {
    public static class Car{
        String color;
        String model;
        int fuel_level= 0;
        int fuel_efficeny = 0;
        int use_fuel;
        public Car(String color, String model, int fuel_efficeny, int fuel_level){
            this.color = color;
            this.fuel_efficeny = fuel_efficeny;
            this.fuel_level = fuel_level;
            this.model = model;
        }
        public int drive(int distance){
            use_fuel = distance / fuel_efficeny;
            fuel_level -= use_fuel;
            if(fuel_level<0){
                System.out.println("연료가 부족합니다, 주유가 필요 합니다");
            }
            else{
                return fuel_level;
            }
            return fuel_level;
        }
        public int reful(int amount){
            fuel_level += amount;
            return fuel_level;
        }
        public void check_fuel(){
            System.out.println(fuel_level);
        }
    }

    public static void main(String[] args) {
        Car car = new Car("blue","E-class",20,100);
        System.out.println(car.color);
        System.out.println(car.model);
        car.drive(20);
        car.reful(100);
        car.check_fuel();
    }
}
