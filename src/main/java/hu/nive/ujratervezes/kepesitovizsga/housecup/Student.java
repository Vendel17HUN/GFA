package hu.nive.ujratervezes.kepesitovizsga.housecup;

import javax.persistence.*;


@Entity
@Table(name = "house_points")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String houseName;
    private String studentName;
    private Integer pointsEarned;

    public Student(Long id, String houseName, String studentName, Integer pointsEarned) {
        this.id = id;
        this.houseName = houseName;
        this.studentName = studentName;
        this.pointsEarned = pointsEarned;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(Integer pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
}
