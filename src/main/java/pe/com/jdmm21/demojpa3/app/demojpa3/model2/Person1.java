package pe.com.jdmm21.demojpa3.app.demojpa3.model2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.MapKeyClass;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.MapKeyType;

@Entity(name = "persona1")
@Table(name = "person")
@SuppressWarnings("all")
public class Person1 {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "personname")
    private String personName;
    @Column(name = "personlastname")
    private String personLastname;
    @ElementCollection(targetClass = java.lang.String.class)
    @Column(name = "direction")
    @JoinTable(name = "address", joinColumns = @JoinColumn(name = "id"))
    private Set addresses = new HashSet<>();
    @Column(name = "direction")
    @JoinTable(name = "address2", joinColumns = @JoinColumn(name = "id"))
    @ElementCollection(targetClass = String.class)
    @IndexColumn(name = "position")
    private List addresses2 = new ArrayList<>();
    @Column(name = "direction")
    @ElementCollection(targetClass = String.class)
    @JoinTable(name = "address3", joinColumns = @JoinColumn(name = "id"))
    @MapKeyColumn(name = "directionkey")
    private Map<Integer, String> addresses3 = new HashMap();
    @OneToOne
    @PrimaryKeyJoinColumn
    @JsonIgnore
    private Phone1 phone1;
    @ManyToOne
    @JoinColumn(name = "courseid_fk")
    private Course1 course1;
    @OneToMany(mappedBy = "person1")
    private List<Game1> games1 = new ArrayList<>();
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "person_goal", joinColumns = {
            @JoinColumn(name = "pk_persoid") }, inverseJoinColumns = @JoinColumn(name = "pr_goal_id"))
    private List<Goal1> goals1 = new ArrayList<>();

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
     * @return String return the personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * @param personName the personName to set
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * @return String return the personLastname
     */
    public String getPersonLastname() {
        return personLastname;
    }

    /**
     * @param personLastname the personLastname to set
     */
    public void setPersonLastname(String personLastname) {
        this.personLastname = personLastname;
    }

    /**
     * @return Set return the addresses
     */
    public Set getAddresses() {
        return addresses;
    }

    /**
     * @param addresses the addresses to set
     */
    public void setAddresses(Set addresses) {
        this.addresses = addresses;
    }

    /**
     * @return List return the addresses2
     */
    public List getAddresses2() {
        return addresses2;
    }

    /**
     * @param addresses2 the addresses2 to set
     */
    public void setAddresses2(List addresses2) {
        this.addresses2 = addresses2;
    }

    /**
     * @return Map return the addresses3
     */
    public Map getAddresses3() {
        return addresses3;
    }

    /**
     * @param addresses3 the addresses3 to set
     */
    public void setAddresses3(Map addresses3) {
        this.addresses3 = addresses3;
    }

    /**
     * @return Phone1 return the phone1
     */
    public Phone1 getPhone1() {
        return phone1;
    }

    /**
     * @param phone1 the phone1 to set
     */
    public void setPhone1(Phone1 phone1) {
        this.phone1 = phone1;
    }

    /**
     * @return Course1 return the course1
     */
    public Course1 getCourse1() {
        return course1;
    }

    /**
     * @param course1 the course1 to set
     */
    public void setCourse1(Course1 course1) {
        this.course1 = course1;
    }

    /**
     * @return List<Game1> return the games1
     */
    public List<Game1> getGames1() {
        return games1;
    }

    /**
     * @param games1 the games1 to set
     */
    public void setGames1(List<Game1> games1) {
        this.games1 = games1;
    }

    /**
     * @return List<Goal1> return the goals1
     */
    public List<Goal1> getGoals1() {
        return goals1;
    }

    /**
     * @param goals1 the goals1 to set
     */
    public void setGoals1(List<Goal1> goals1) {
        this.goals1 = goals1;
    }

}