package edu.mum.lab7.cs.cs425.studentmgmt.model;

import javax.persistence.*;

@Entity
@Table(name = "Transcripts")
public class TranscriptEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
   private  String degreeTitle;
public TranscriptEntity(){}
public TranscriptEntity(String degreeTitle){

    this.degreeTitle=degreeTitle;
}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }


}
