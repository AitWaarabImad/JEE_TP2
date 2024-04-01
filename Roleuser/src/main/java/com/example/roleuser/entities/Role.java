package com.example.roleuser.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private  String Description;

    @ManyToMany(mappedBy = "roles",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    public List<User> users;

}