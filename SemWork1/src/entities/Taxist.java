package entities;

import javax.persistence.*;

/**
 * Created by Julia_2 on 12.04.2016.
 */
@Entity
@Table(name = "taxist", schema = "public", catalog = "sem1")
public class Taxist {
    private String name;
    private String surname;
    private String login;
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
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    @Id
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

        Taxist that = (Taxist) o;


        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        return result;
    }


}
