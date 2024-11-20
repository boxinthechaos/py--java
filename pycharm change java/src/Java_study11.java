public class Java_study11 {
    public static class Employee{
        String name;
        String position;
        double salary;
        int hours_worked;
        double total_pay;
        int overtime_hours;
        public Employee(String name, String position, double salary, int hours_worked){
            this.name = name;
            this.position = position;
            this.salary = salary;
            this.hours_worked = hours_worked;
        }
        public void log_hours(int hours){
            hours_worked += hours;
        }
        public double calculate_pay(){
            if(hours_worked <= 40){
                total_pay = salary * hours_worked;
            }
            else{
                overtime_hours = hours_worked - 40;
                total_pay = (salary * 40) + (salary * 1.5*overtime_hours);
            }
            return total_pay;
        }
        public void promote(String new_position, double raise_amount){
            position = new_position;
            salary += raise_amount;
            System.out.println(name+"님이 "+position+"으로 승진 하셨으며, 급여가 "+raise_amount+"만큼 인상 되었습니다");
        }
        public void display_info(){
            System.out.println("이름: "+name);
            System.out.println("직위: "+position);
            System.out.println("시급: "+salary);
            System.out.println("근무시간: "+hours_worked);
        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee("홍길동","대리",9870,0);
        employee.log_hours(45);
        System.out.println("급여: "+employee.calculate_pay());
        employee.promote("과장",2000);
        employee.display_info();
    }
}
