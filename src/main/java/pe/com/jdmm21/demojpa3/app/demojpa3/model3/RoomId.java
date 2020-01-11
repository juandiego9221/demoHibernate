package pe.com.jdmm21.demojpa3.app.demojpa3.model3;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RoomId implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int id1;
    private int id2;

    /**
     * @return int return the id1
     */
    public int getId1() {
        return id1;
    }

    /**
     * @param id1 the id1 to set
     */
    public void setId1(int id1) {
        this.id1 = id1;
    }

    /**
     * @return int return the id2
     */
    public int getId2() {
        return id2;
    }

    /**
     * @param id2 the id2 to set
     */
    public void setId2(int id2) {
        this.id2 = id2;
    }

}