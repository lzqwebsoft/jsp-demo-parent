package com.dip.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.management.relation.Role;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/**
 * Created by moneg on 08.01.2017.
 */
@Entity
@Table(name = "user")
public class User implements Serializable, UserDetails, GrantedAuthority {

    @Id
    @Column(name = "email")
    private String email;
    @Column(name="username")
    private String username;
    @Column(name = "password")
    private String password;

    @ManyToMany
    @JoinTable(name="createrdogshow",
            joinColumns = @JoinColumn(name="email", referencedColumnName="email"),
            inverseJoinColumns = @JoinColumn(name="dogshow_id", referencedColumnName="dogshow_id")
    )
    private Set<DogShow> dogShow;


    public Set<DogShow> getDogShow() {
        return dogShow;
    }

    public void setDogShow(Set<DogShow> dogShow) {
        this.dogShow = dogShow;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @OneToOne(optional = false)
    @JoinColumn(name="human_id", unique = true, nullable = false)
    private Human human;

    @OneToOne(optional = false)
    @JoinColumn(name="type_id", unique = true, nullable = false)
    private Role_type role_type;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new GrantedAuthority[]{this});
    }

    public Role_type getRole_type() {
        return role_type;
    }

    public void setRole_type(Role_type role_type) {
        this.role_type = role_type;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getAuthority() {
        System.out.println(getRole_type().getTitle());
        return getRole_type().getTitle();
    }
}
