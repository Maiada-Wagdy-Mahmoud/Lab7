package edu.mum.lab7;

import edu.mum.lab7.cs.cs425.studentmgmt.model.ClassroomEntity;
import edu.mum.lab7.cs.cs425.studentmgmt.model.Reposotory.ClassroomReposetory;
import edu.mum.lab7.cs.cs425.studentmgmt.model.Reposotory.StudentReposotory;
import edu.mum.lab7.cs.cs425.studentmgmt.model.Reposotory.TranscriptReposotory;
import edu.mum.lab7.cs.cs425.studentmgmt.model.StudentEntity;
import edu.mum.lab7.cs.cs425.studentmgmt.model.TranscriptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Lab7Application implements CommandLineRunner {
    @Autowired
    StudentReposotory studentReposotory;
    @Autowired
    TranscriptReposotory transcriptReposotory;
    @Autowired
    ClassroomReposetory classroomReposetory;


    public static void main(String[] args) {

        SpringApplication.run(Lab7Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        saveStudent();
    }
    private void saveStudent() {
        TranscriptEntity transcriptEntity=new TranscriptEntity("BS Computer Science");
        Set<ClassroomEntity> hash_Set = new HashSet<ClassroomEntity>();

        hash_Set.add( new ClassroomEntity("McLaughlin building", "M105"));
        hash_Set.add(new ClassroomEntity("virigllhall building", "M32"));

        //TranscriptEntity transcriptEntity1=transcriptReposotory.save(transcriptEntity);
        StudentEntity studentEntity =new StudentEntity("000-61-0001", "Anna", "Lynn", "Smith", 3.45f, LocalDateTime.now(),transcriptEntity,hash_Set);
        studentReposotory.save(studentEntity);
    }}
