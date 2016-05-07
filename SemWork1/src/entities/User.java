package entities;

import javax.persistence.*;

/**
 * Created by Julia_2 on 12.04.2016.
 */
@Entity
@Table(name = "user", schema = "public", catalog = "sem1")
public class User {
    private String name;
    private String email;
    private String phone;
    private String hash;
    private int id;
    private City cityByCity;





    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Basic
    @Column(name = "phone")
    public String getPhone(){return phone;}

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Basic
    @Column(name = "hash")
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }


    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @ManyToOne
    @JoinColumn(name = "city", referencedColumnName = "name", nullable = false)
    public City getCityByCity() {
        return cityByCity;
    }

    public void setCityByCity(City cityByCity) {
        this.cityByCity = cityByCity;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;

        if (phone != that.phone) return false;
        if (hash != that.hash) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = Integer.parseInt(31 * result + phone);
        result = Integer.parseInt(31 * result + hash);
        return result;
    }


}
