package pe.com.jdmm21.demojpa3.app.demojpa3.model2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "telefono1")
@Table(name = "phone")
public class Phone1 {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @OneToOne(mappedBy = "phone1")
    private Person1 person1;

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
     * @return String return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return Person1 return the person1
     */
    public Person1 getPerson1() {
        return person1;
    }

    /**
     * @param person1 the person1 to set
     */
    public void setPerson1(Person1 person1) {
        this.person1 = person1;
    }

}