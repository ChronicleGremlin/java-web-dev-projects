package org.launchcode;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student student = new Student("Alec Jost", 47, 1, 4.0);

        System.out.println(student.getName());
        System.out.println(student.getStudentId());
        System.out.println(student.getNumberOfCredits());
        System.out.println(student.getGpa());

    }

}
