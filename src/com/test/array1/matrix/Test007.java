package com.test.array1.matrix;
import java.util.*;
import java.util.stream.Collectors;

public class Test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course kannada = new Course("Kannada");
		Course english = new Course("English");
		Course hindi = new Course("Hindi");
		Course maths = new Course("Maths");
		Course science = new Course("Science");
		Course social = new Course("Social");
		List<Course> allCourses = Arrays.asList(kannada, english, hindi,
		        maths, science, social);

		List<Course> languageCourses = Arrays.asList(kannada, english, hindi);

		List<Course> subjectCourses = Arrays.asList(maths, science, social);

		Student st1 = new Student("mike", allCourses);
		Student st2 = new Student("john", languageCourses);
		Student st3 = new Student("ross", subjectCourses);

		List<Student> students = Arrays.asList(st1, st2, st3);
		
		students.stream().sorted();
		
		System.out.println(students);
		
		//students.stream().flatMap(s->s.getCourses().stream()).
		//filter(x->x.getName().equalsIgnoreCase("english")).;
		//List<Student> st1=new ArrayList<>();
//		students.stream().filter(x->
//		if(x!=null) {
//			List<Course> c1=x.getCourses();
//			for(int i=0;i<c1.size();i++) {
//				if(c1.get(i).getName().equalsIgnoreCase("english")) {
//					st1.add(c1.get(i));
//				}
//			}
//		}
	}

}

class Course {

    private Integer id;

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}



 class Student {

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    private String name;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}





