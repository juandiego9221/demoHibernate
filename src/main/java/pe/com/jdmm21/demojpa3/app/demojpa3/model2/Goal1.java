package pe.com.jdmm21.demojpa3.app.demojpa3.model2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "meta1")
@Table(name = "goal")
public class Goal1 {
    @Id
    @GeneratedValue
    private int goalId;
    @Column(name = "goalname")
    private String goalName;

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

}