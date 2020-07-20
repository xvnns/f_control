package com.example.foodcontrol.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "dish", schema = "food_control", catalog = "")
public class DishEntity {
    private int id;
    private String name;
    private BigDecimal calories;
    private BigDecimal mass;
    private BigDecimal totalCalorie;
    private int controlId;

    @ManyToOne
    @JoinColumn(name="CONTROL_ID", nullable=false)
    private FoodControlEntity foodControlEntity;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "CALORIES")
    public BigDecimal getCalories() {
        return calories;
    }

    public void setCalories(BigDecimal calories) {
        this.calories = calories;
    }

    @Basic
    @Column(name = "MASS")
    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    @Basic
    @Column(name = "TOTAL_CALORIE")
    public BigDecimal getTotalCalorie() {
        return totalCalorie;
    }

    public void setTotalCalorie(BigDecimal totalCalorie) {
        this.totalCalorie = totalCalorie;
    }

    @Basic
    @Column(name = "CONTROL_ID")
    public int getControlId() {
        return controlId;
    }

    public void setControlId(int controlId) {
        this.controlId = controlId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DishEntity that = (DishEntity) o;

        if (id != that.id) return false;
        if (controlId != that.controlId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (calories != null ? !calories.equals(that.calories) : that.calories != null) return false;
        if (mass != null ? !mass.equals(that.mass) : that.mass != null) return false;
        if (totalCalorie != null ? !totalCalorie.equals(that.totalCalorie) : that.totalCalorie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (calories != null ? calories.hashCode() : 0);
        result = 31 * result + (mass != null ? mass.hashCode() : 0);
        result = 31 * result + (totalCalorie != null ? totalCalorie.hashCode() : 0);
        result = 31 * result + controlId;
        return result;
    }


}
