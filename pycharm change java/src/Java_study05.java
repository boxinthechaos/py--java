public class Java_study05 {
    public static class Car{
        String model;
        int max_speed;

        public Car(String model, int max_speed){
            this.model = model;
            this.max_speed = max_speed;
        }
        public void display_info(){
            System.out.println(model);
            System.out.println(max_speed);
        }
        public void start(){
            System.out.println("자동차가 주행을 시작했습니다");
        }
        public static class SuperCar extends Car{
            public SuperCar(String model, int max_speed) {
                super(model, max_speed);
            }
            public void turbo_boost(){
                System.out.println("터보 부스트! 최고 속도가 50km/h 증가합니다.");
                max_speed += 50;
            }
            public void display_info(){
                System.out.println(model);
                System.out.println(max_speed);
            }
        }
        public static class SportCar extends Car{
            public SportCar(String model, int max_speed) {
                super(model, max_speed);
            }
            public void drift(){
                System.out.println("스포츠카가 드리프트를 시작합니다");
            }

            public void display_info() {
                System.out.println(model);
                System.out.println(max_speed);
            }
        }
    }

    public static void main(String[] args) {
        Car car = new Car("일반 자동차", 180);
        car.display_info();
        car.start();

        Car.SuperCar superCar = new Car.SuperCar("슈퍼카", 300);
        superCar.display_info();
        superCar.turbo_boost();
        superCar.display_info();

        Car.SportCar sportCar = new Car.SportCar("스포츠카", 250);
        sportCar.display_info();
        sportCar.drift();

    }
}
