package pe.com.jdmm21.demojpa3.app.demojpa3.model3;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ocuppant")
public class Ocuppant1 {
    @Id
    private RoomId roomId;
    private Date checkInDate;
    private Date checkOutDate;

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
     * @return Date return the checkInDate
     */
    public Date getCheckInDate() {
        return checkInDate;
    }

    /**
     * @param checkInDate the checkInDate to set
     */
    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * @return Date return the checkOutDate
     */
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * @param checkOutDate the checkOutDate to set
     */
    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

}