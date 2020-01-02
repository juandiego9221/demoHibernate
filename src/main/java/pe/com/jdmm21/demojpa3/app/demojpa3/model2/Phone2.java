package pe.com.jdmm21.demojpa3.app.demojpa3.model2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "telefono2")
@Table(name = "phone1")
public class Phone2 {
    @Id
    @GeneratedValue
    private int phoneid;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @OneToOne
    @JoinColumn(name = "id")
    private Person1 person1;

    /**
     * @return int return the phoneid
     */
    public int getPhoneid() {
        return phoneid;
    }

    /**
     * @param phoneid the phoneid to set
     */
    public void setPhoneid(int phoneid) {
        this.phoneid = phoneid;
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