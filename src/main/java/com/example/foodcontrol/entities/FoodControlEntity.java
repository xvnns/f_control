package com.example.foodcontrol.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "food_control", schema = "food_control", catalog = "")
public class FoodControlEntity {
    private int id;
    private Date date;

    @ManyToOne
    @JoinColumn(name="CLIENT_ID", nullable=false)
    private ClientEntity client;

    @OneToMany(mappedBy="foodControlEntity")
    private Set<DishEntity> dishEntitySet;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DATE")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodControlEntity that = (FoodControlEntity) o;

        if (id != that.id) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }


}
