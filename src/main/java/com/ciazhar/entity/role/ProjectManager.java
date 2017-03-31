package com.ciazhar.entity.role;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by ciazhar on 3/30/17.
 */

@Entity
public class ProjectManager {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    private String id;

    @Column(nullable=false)
    @NotNull
    @NotEmpty
    private String namaProjectManager;

    @Column(nullable=false)
    @NotNull
    @NotEmpty
    @Email
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaProjectManager() {
        return namaProjectManager;
    }

    public void setNamaProjectManager(String namaProjectManager) {
        this.namaProjectManager = namaProjectManager;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
