package com.example.roguemageyogav3.user;

import com.example.roguemageyogav3.Lesson.Lesson;
import com.example.roguemageyogav3.business.Business;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;


    @ManyToMany(mappedBy = "owner", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private Set<Business> businesses = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "students", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private Set<Lesson> lessons = new LinkedHashSet<>();

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, length = 319)
    private String email;

    @Column(name = "credits", nullable = false)
    private Long credits = 0L;

    @ManyToMany(mappedBy = "owner", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private Set<Business> memberships = new LinkedHashSet<>();

    public User() {
    }

    public User(Set<Business> businesses, Set<Lesson> lessons, String firstName, String lastName, String email, Set<Business> memberships) {
        this.businesses = businesses;
        this.lessons = lessons;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.memberships = memberships;
    }

    public User(Long id, Set<Business> businesses, Set<Lesson> lessons, String firstName, String lastName, String email, Set<Business> memberships) {
        this.id = id;
        this.businesses = businesses;
        this.lessons = lessons;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.memberships = memberships;
    }

    public Set<Business> getMemberships() {
        return memberships;
    }

    public void setMemberships(Set<Business> memberships) {
        this.memberships = memberships;
    }


    public Long getCredits() {
        return credits;
    }

    public void setCredits(Long credits) {
        this.credits = credits;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Set<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Set<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(Set<Business> businesses) {
        this.businesses = businesses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}