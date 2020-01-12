package pe.com.jdmm21.demojpa3.app.demojpa3.model3;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student1 {
    @Id
    @Column(name = "studentid")
    private int id;
    private String studentName;
    @ManyToMany(mappedBy = "student1s")
    private List<Teacher1> teacher1s;

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
     * @return String return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return List<Teacher1> return the teacher1s
     */
    public List<Teacher1> getTeacher1s() {
        return teacher1s;
    }

    /**
     * @param teacher1s the teacher1s to set
     */
    public void setTeacher1s(List<Teacher1> teacher1s) {
        this.teacher1s = teacher1s;
    }

}