package com.ciazhar.entity.security;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by ciazhar on 4/4/17.
 */

@Entity
public class Permission {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    @Column(name = "id_permission")
    private String id;

    @NotNull
    @Column(name = "nama_permission", unique = true)
    private String nama;

    @NotNull
    @Column(name = "label_permission")
    private String label;



}
