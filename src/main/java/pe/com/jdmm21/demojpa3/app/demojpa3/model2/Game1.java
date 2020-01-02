package pe.com.jdmm21.demojpa3.app.demojpa3.model2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "juego1")
@Table(name = "game")
public class Game1 {
    @Id
    @GeneratedValue
    private int gameId;
    @Column(name = "gamename")
    private String gameName;
    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnore
    private Person1 person1;

    /**
     * @return int return the gameId
     */
    public int getGameId() {
        return gameId;
    }

    /**
     * @param gameId the gameId to set
     */
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    /**
     * @return String return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @param gameName the gameName to set
     */
    public void setGameName(String gameName) {
        this.gameName = gameName;
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