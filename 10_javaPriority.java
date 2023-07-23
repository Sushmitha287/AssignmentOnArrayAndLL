import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student{
    private int id;
    private String name;
    private double cgpa;
    Student(int id,String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    public int getID(int id){
        return id;
    }
    public String getName(String name){
        return name;
    }
    public double getCGPA(double cgpa){
        return cgpa;
    }
}
class Priorities{
    public List<Student> getStudents(List<String> events){
        List<Student> students = new ArrayList<Student>();
        for(int i=0; i < events.size(); i++){
            String[] data = events.get(i).split(" ");
            if (data[0].equals("ENTER")) {
                int id = Integer.parseInt(data[3]);
                String name = data[1];
                double cgpa = Double.parseDouble(data[2]);
                Student student = new Student(id, name, cgpa);
                students.add(student);
            } else if (data[0].equals("SERVED")) {
                st.getName();
            }
        }
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
