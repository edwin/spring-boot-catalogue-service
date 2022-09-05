package com.edw.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <pre>
 *     com.edw.entity.Menu
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 05 Sep 2022 21:33
 */
@Entity(name = "T_MENU")
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="foodname")
    private String foodName;
    private BigDecimal price;

    public Menu(Long id, String foodName, BigDecimal price) {
        this.id = id;
        this.foodName = foodName;
        this.price = price;
    }

    public Menu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
