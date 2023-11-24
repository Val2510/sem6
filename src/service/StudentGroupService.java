package service;

import data.Student;
import data.StudentGroup;
import data.UserComaporator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createGroup(List<Student> studentList){
        studentGroup = new StudentGroup(studentList);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student createStudent(String firstName, String secondName, String lastName){
        if(studentGroup == null)
            createGroup(new ArrayList<>());
        int maxid = 0;
        for(Student student : studentGroup.getStudentList())
            if (student.getStudentId() > maxid)
                maxid = student.getStudentId();
        maxid++;
        Student student = new Student(firstName, secondName, lastName, maxid);
        studentGroup.addGroup(student);
        return student;
    }


    public List<Student> getListStudent(){
        return studentGroup.getStudentList();
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComaporator());
        return studentList;
    }

}
