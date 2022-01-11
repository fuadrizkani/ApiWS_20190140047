package com.domain.models.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_supplier")
public class Supplier implements Serializable{

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String nama;

    private String alamat;

    private double no_hp;

    public Supplier() {
    }

    public Supplier(Long id, String nama, String alamat, double no_hp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(double no_hp) {
        this.no_hp = no_hp;
    }

    
    
}
