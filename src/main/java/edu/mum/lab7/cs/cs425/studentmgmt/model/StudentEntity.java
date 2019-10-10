package edu.mum.lab7.cs.cs425.studentmgmt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "STUDENTS")
public class StudentEntity {


    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId ;
    @Column(nullable = false)
   private  String studentNumber;
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @Column(nullable = false)
    private String lastName;
    private float cgpa;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transcriptId",referencedColumnName ="id")
    private TranscriptEntity t;

    private LocalDateTime dateOfEnrollment;
    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Students_ClassRooms",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "classroomId"))
    Set<ClassroomEntity> classroomEntitySets;


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public Set<ClassroomEntity> getClassroomEntitySets() {
        return classroomEntitySets;
    }

    public void setClassroomEntitySets(Set<ClassroomEntity> classroomEntitySets) {
        this.classroomEntitySets = classroomEntitySets;
    }
    public LocalDateTime getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDateTime dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public TranscriptEntity getT() {
        return t;
    }

    public void setT(TranscriptEntity t) {
        this.t = t;
    }

    public StudentEntity(){}

    public StudentEntity(String studentNumber, String firstName, String middleName, String LastName, float cgpa, LocalDateTime dateOfEnrollment,TranscriptEntity transcriptEntity,Set<ClassroomEntity> classroomEntitySets){
    setStudentNumber(studentNumber);
    setFirstName(firstName);
    setMiddleName(middleName);
    setLastName(LastName);
    setCgpa(cgpa);
    setDateOfEnrollment(dateOfEnrollment);
    setT(transcriptEntity);
    setClassroomEntitySets(classroomEntitySets);

}






}
