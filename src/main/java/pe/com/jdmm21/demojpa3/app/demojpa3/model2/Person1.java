package pe.com.jdmm21.demojpa3.app.demojpa3.model2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

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
    @JoinTable(name = "address2",joinColumns = @JoinColumn(name = "id"))
    @ElementCollection(targetClass = String.class)
    @IndexColumn(name = "position")
    private List addresses2 = new ArrayList<>();

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

}