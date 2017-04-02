package com.ciazhar.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by ciazhar on 3/30/17.
 */

@Entity
public class Aplikasi {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id_aplikasi;

    @Column(nullable=false, unique = true)
    @NotNull
    @NotEmpty
    private String nama_aplikasi;

    @Column(nullable=false, columnDefinition = "boolean DEFAULT 0")
    @NotNull
    private boolean status_rilis_aplikasi;

    public String getId_aplikasi() {
        return id_aplikasi;
    }

    public void setId_aplikasi(String id_aplikasi) {
        this.id_aplikasi = id_aplikasi;
    }

    public String getNama_aplikasi() {
        return nama_aplikasi;
    }

    public void setNama_aplikasi(String nama_aplikasi) {
        this.nama_aplikasi = nama_aplikasi;
    }

    public boolean isStatus_rilis_aplikasi() {
        return status_rilis_aplikasi;
    }

    public void setStatus_rilis_aplikasi(boolean status_rilis_aplikasi) {
        this.status_rilis_aplikasi = status_rilis_aplikasi;
    }
}
