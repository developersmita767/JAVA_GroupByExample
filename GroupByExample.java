package Java_8;


import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Java_8.Student;

public class GroupByExample {

	public static void main(String[] args) {
		Student s1=new Student(1, "Rahul", 56, "C");
		Student s2=new Student(1, "Dinesh", 91, "A");
		Student s3=new Student(1, "Suresh", 78, "B");
		Student s4=new Student(1, "Ramesh", 96, "A");
		List<Student> stdList=List.of(s1,s2,s3,s4);
	Map<String,List<Student>> stdMap=stdList.stream()
			.collect(Collectors.groupingBy(Student::getGrade));
	 // Print the grouped employees
	stdMap.forEach((grade, list) -> {
        System.out.println("Grade: " + grade);
        list.forEach(std -> System.out.println("  " + std.name + ", " + std.percent));
    });
	}

}
