package edu.mum.lab7.cs.cs425.studentmgmt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ClassroomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long classroomId;
    @Column(nullable = false)
    String buildingName;
    @Column(nullable = false)
    String roomNumber;
    @JsonIgnore
@ManyToMany(mappedBy = "classroomEntitySets" ,cascade=CascadeType.ALL )
Set<StudentEntity> studentEntitySet;

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public ClassroomEntity(){}
    public ClassroomEntity(String BuildingName,String roomNumber){
        setBuildingName(BuildingName);
        setRoomNumber(roomNumber);
    }


}
