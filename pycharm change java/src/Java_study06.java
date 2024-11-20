public class Java_study06 {
    public static class person{
        String name;
        int ssn;
        String subjects;
        String  grade;
        int salary;
        public person(String name, int ssn){
            this.name = name;
            this.ssn = ssn;
        }
        public void display_info(){
            System.out.println(name);
            System.out.println(ssn);
        }
    }
    public static class Student extends person {
        public Student(String name, int ssn,String subjects, String grade){
            super(name,ssn);
            this.subjects = subjects;
            this.grade = grade;
        }
        public void display_info(){
            System.out.println(name);
            System.out.println(ssn);
            System.out.println(subjects);
            System.out.println(grade);
        }
    }
    public  static class Teacher extends person{
        public Teacher(String name, int ssn,String subjects,int salary){
            super(name,ssn);
            this.subjects = subjects;
            this.salary = salary;
        }
        public void display_info(){
            System.out.println(name);
            System.out.println(ssn);
            System.out.println(subjects);
            System.out.println(salary);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("홍길동", 12345678, "자료구조", "A");
        Teacher teacher = new Teacher("김철수", 123456790, "Python", 3000000);
        student.display_info();
        teacher.display_info();
    }
}
