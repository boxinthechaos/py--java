import java.util.ArrayList;
import java.util.HashMap;

public class Java_study09 {
    public static class Classroom {
        private ArrayList<String> students;
        private HashMap<String, Integer> attendance;

        public Classroom(ArrayList<String> students) {
            this.students = students;
            this.attendance = new HashMap<>();
            // 출석 초기화
            for (String student : students) {
                attendance.put(student, 0);
            }
        }

        // 학생 추가 메서드
        public void add_student(String name) {
            students.add(name);
            attendance.put(name, 0); // 새 학생의 출석 초기화
        }

        // 출석 체크 메서드
        public void mark_attendance(String name) {
            if (attendance.containsKey(name)) {
                attendance.put(name, attendance.get(name) + 1); // 출석 1 증가
            } else {
                System.out.println("학생을 찾을 수 없습니다");
            }
        }

        // 출석 정보 출력 메서드
        public void print_attendance() {
            for (String student : students) {
                System.out.println(student + ": " + attendance.get(student) + "회");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("홍길동");
        studentList.add("김철수");

        // Classroom 객체 생성
        Classroom classroom = new Classroom(studentList);

        // 출석 체크
        classroom.mark_attendance("홍길동");
        classroom.mark_attendance("김철수");
        classroom.mark_attendance("홍kill동");

        // 출석 정보 출력
        classroom.print_attendance();
    }
}
