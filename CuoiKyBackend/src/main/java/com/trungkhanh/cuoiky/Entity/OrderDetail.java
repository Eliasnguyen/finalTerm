package com.trungkhanh.cuoiky.Entity;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "quanity")
    private String quanity;

    @Column(name = "total")
    private String total;

    @SerializedName("user_id")
    @Column(name = "userId")
    private String userId;

    public OrderDetail(int id, String name, String quanity, String total, String userId) {
        this.id = id;
        this.name = name;
        this.quanity = quanity;
        this.total = total;
        this.userId = userId;
    }

    public OrderDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuanity() {
        return quanity;
    }

    public void setQuanity(String quanity) {
        this.quanity = quanity;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String price) {
        this.total = price;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
