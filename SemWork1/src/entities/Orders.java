package entities;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Julia_2 on 12.04.2016.
 */
@Entity
@Table(name = "orders", schema = "public", catalog = "sem1")
public class Orders {
    private int id;
    private Time time;
    private String address;
    private Taxist taxistByTaxistLogin;
    private User userByClientId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Basic
    @Column(name = "time")
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }


    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @ManyToOne
    @JoinColumn(name = "taxist_login", referencedColumnName = "login", nullable = false)
    public Taxist getTaxistByTaxistLogin() {
        return taxistByTaxistLogin;
    }

    public void setTaxistByTaxistLogin(Taxist taxistByTaxistLogin) {
        this.taxistByTaxistLogin = taxistByTaxistLogin;
    }



    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false)
    public User getUserByClientPhone() {
        return userByClientId;
    }

    public void setUserByClientPhone(User userByClientPhone) {
        this.userByClientId = userByClientPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders that = (Orders) o;

        if (id != that.id) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }



}
