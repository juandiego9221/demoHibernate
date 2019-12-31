package pe.com.jdmm21.demojpa3.app.demojpa3.model;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("all")
public class Person3 {
    private int personId;
    private String personName;
    private String personLastname;
    private Collection nombrex = new ArrayList<>();

    /**
     * @return int return the personId
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * @param personId the personId to set
     */
    public void setPersonId(int personId) {
        this.personId = personId;
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
     * @return Collection return the nombrex
     */
    public Collection getNombrex() {
        return nombrex;
    }

    /**
     * @param nombrex the nombrex to set
     */
    public void setNombrex(Collection nombrex) {
        this.nombrex = nombrex;
    }

}