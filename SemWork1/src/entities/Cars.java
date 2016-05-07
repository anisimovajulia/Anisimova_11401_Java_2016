package entities;

import javax.persistence.*;

/**
 * Created by Julia_2 on 12.04.2016.
 */
@Entity
@Table(name = "cars", schema = "public", catalog = "sem1")
public class Cars {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private String carName;
    private Taxist taxistByTaxistLogin;
    private String carclass;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Basic
    @Column(name = "car_name")
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @ManyToOne
    @JoinColumn(name = "taxist_login", referencedColumnName = "login", nullable = false)
    public Taxist getTaxistByTaxistLogin() {
        return taxistByTaxistLogin;
    }

    public void setTaxistByTaxistLogin(Taxist taxistByTaxistLogin) {
        this.taxistByTaxistLogin = taxistByTaxistLogin;
    }


    @Basic
    @Column(name = "carclass")
    public String getCarclass() {
        return carclass;
    }

    public void setCarclass(String carclass) {
        this.carclass = carclass;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cars that = (Cars) o;

        if (id != that.id) return false;
        if (carName != null ? !carName.equals(that.carName) : that.carName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (carName != null ? carName.hashCode() : 0);
        return result;
    }


}
