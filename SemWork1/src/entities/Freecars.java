package entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Julia_2 on 12.04.2016.
 */
@Entity
@Table(name = "freecars", schema = "public", catalog = "sem1")
public class Freecars implements Serializable {
    private Cars carsById;
    @Id
    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Cars getCarsById() {
        return carsById;
    }

    public void setCarsById(Cars carsById) {
        this.carsById = carsById;
    }




}
