package pe.com.jdmm21.demojpa3.app.demojpa3.model3;

import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "teacher")
public class Teacher1 {
    @Id
    @Column(name = "teacherid")
    private int id;
    private String teacherName;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
        name = "teacher_student",joinColumns = @JoinColumn(name= "pk_teacher_id"),
        inverseJoinColumns =  @JoinColumn(name = "pk_student_id")
    )
    private List<Student1> student1s;

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the teacherName
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * @param teacherName the teacherName to set
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * @return List<Student1> return the student1s
     */
    public List<Student1> getStudent1s() {
        return student1s;
    }

    /**
     * @param student1s the student1s to set
     */
    public void setStudent1s(List<Student1> student1s) {
        this.student1s = student1s;
    }

}