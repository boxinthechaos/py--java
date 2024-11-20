public class Java_study01 {

    public static class StudentGrade {
        private String name;
        private int studentId;
        private int grade;
        public StudentGrade(String name, int studentId, int grade) {
            this.name = name;
            this.studentId = studentId;
            this.grade = grade;
        }
        public String getName() {
            return name;
        }
        public int getStudentId() {
            return studentId;
        }
        public int getGrade() {
            return grade;
        }
        public void setName(String newName) {
            this.name = newName;
        }
        public void setStudentId(int newStudentId) {
            this.studentId = newStudentId;
        }
        public void setGrade(int newGrade) {
            if (newGrade >= 0 && newGrade <= 100) {
                this.grade = newGrade;
            } else {
                System.out.println("잘못된 값임");
            }
        }
        public void displayInfo() {
            System.out.println("이름: " + name + ", 학번: " + studentId + ", 성적: " + grade);
        }
    }
    public static void main(String[] args) {
        StudentGrade a = new StudentGrade("홍길동", 1111, 100);
        a.displayInfo();
        a.setName("홍킬동");
        a.setStudentId(1211);
        a.setGrade(11);
        a.displayInfo();
    }
}
