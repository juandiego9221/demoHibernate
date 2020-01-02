package pe.com.jdmm21.demojpa3.app.demojpa3.model2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "meta1")
@Table(name = "goal")
public class Goal1 {
    @Id
    @GeneratedValue
    private int goalId;
    @Column(name = "goalname")
    private String goalName;
    @ManyToMany(mappedBy = "goals1")
    private List<Person1> persons1 = new ArrayList<>();

    /**
     * @return int return the goalId
     */
    public int getGoalId() {
        return goalId;
    }

    /**
     * @param goalId the goalId to set
     */
    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    /**
     * @return String return the goalName
     */
    public String getGoalName() {
        return goalName;
    }

    /**
     * @param goalName the goalName to set
     */
    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    /**
     * @return List<Person1> return the persons1
     */
    public List<Person1> getPersons1() {
        return persons1;
    }

    /**
     * @param persons1 the persons1 to set
     */
    public void setPersons1(List<Person1> persons1) {
        this.persons1 = persons1;
    }

}