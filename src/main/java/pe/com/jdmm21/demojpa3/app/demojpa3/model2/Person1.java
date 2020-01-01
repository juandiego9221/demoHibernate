package pe.com.jdmm21.demojpa3.app.demojpa3.model2;

import java.util.HashSet;
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
    @ElementCollection(targetClass = java.lang.String.class, fetch = FetchType.EAGER)
    @Column(name = "direction")
    @JoinTable(name = "address",joinColumns = @JoinColumn(name = "id"))
    private Set addresses = new HashSet<>();

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

}