package pe.com.jdmm21.demojpa3.app.demojpa3.model3;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room1 {
    @Id
    private RoomId roomId;
    private double length;
    private double width;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Ocuppant1 ocuppant1;
    @OneToMany(mappedBy = "roomId")
    private List<Ocuppant2> ocuppant2s;
    @ManyToOne
    @JoinColumn(name = "ocuppandid")
    private Ocuppant3 ocuppant3;

    /**
     * @return RoomId return the roomId
     */
    public RoomId getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(RoomId roomId) {
        this.roomId = roomId;
    }

    /**
     * @return double return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return double return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return Ocuppant1 return the ocuppant1
     */
    public Ocuppant1 getOcuppant1() {
        return ocuppant1;
    }

    /**
     * @param ocuppant1 the ocuppant1 to set
     */
    public void setOcuppant1(Ocuppant1 ocuppant1) {
        this.ocuppant1 = ocuppant1;
    }

    /**
     * @return List<Ocuppant2> return the ocuppant2s
     */
    public List<Ocuppant2> getOcuppant2s() {
        return ocuppant2s;
    }

    /**
     * @param ocuppant2s the ocuppant2s to set
     */
    public void setOcuppant2s(List<Ocuppant2> ocuppant2s) {
        this.ocuppant2s = ocuppant2s;
    }

    /**
     * @return Ocuppant3 return the ocuppant3
     */
    public Ocuppant3 getOcuppant3() {
        return ocuppant3;
    }

    /**
     * @param ocuppant3 the ocuppant3 to set
     */
    public void setOcuppant3(Ocuppant3 ocuppant3) {
        this.ocuppant3 = ocuppant3;
    }

}