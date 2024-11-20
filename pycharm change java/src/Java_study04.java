public class Java_study04 {
    public static class Animal{
        String name;

        public Animal(String name){
            this.name = name;
        }
        public void speak(){
            System.out.println("동물이 울음 소리를 냅니다");
        }
        public void display_info(){
            System.out.println(name);
        }
    }
    public static class Dog extends Animal{

        public Dog(String name) {
            super(name);  // 부모 클래스의 생성자 호출
        }

        public void speak(){
            System.out.println("멍멍");
        }
        public void display_info(){
            System.out.println(name);
        }
    }
    public static class Cat extends Animal{

        public Cat(String name) {
            super(name);  // 부모 클래스의 생성자 호출
        }

        public void speak(){
            System.out.println("야옹");
        }
        public void display_info(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        // Animal, Dog, Cat 객체 생성
        Animal animal = new Animal("동물");
        Dog dog = new Dog("바둑이");
        Cat cat = new Cat("나비");

        // Animal 클래스 메서드 호출
        animal.display_info();  // "이름: 동물" 출력
        animal.speak();  // "동물이 울음 소리를 냅니다" 출력

        // Dog 클래스 메서드 호출
        dog.display_info();  // "이름: 바둑이" 출력
        dog.speak();  // "멍멍" 출력

        // Cat 클래스 메서드 호출
        cat.display_info();  // "이름: 나비" 출력
        cat.speak();  // "야옹" 출력
    }
}
