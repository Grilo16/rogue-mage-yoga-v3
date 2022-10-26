package com.example.roguemageyogav3.business;

import com.example.roguemageyogav3.Lesson.Lesson;
import com.example.roguemageyogav3.user.User;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "businesses")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "business_seq")
    @SequenceGenerator(name = "business_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "businesses_owners",
            joinColumns = @JoinColumn(name = "business_id"),
            inverseJoinColumns = @JoinColumn(name = "owner_id"))
    private Set<User> owner = new LinkedHashSet<>();

    @OneToMany(mappedBy = "business", orphanRemoval = true)
    private Set<Lesson> lessons = new LinkedHashSet<>();

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "balance", nullable = false)
    private Long balance;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "businesses_members",
            joinColumns = @JoinColumn(name = "business_id"),
            inverseJoinColumns = @JoinColumn(name = "members_id"))
    private Set<User> members = new LinkedHashSet<>();

    public Set<User> getMembers() {
        return members;
    }

    public void setMembers(Set<User> members) {
        this.members = members;
    }

    public Long getCredits() {
        return balance;
    }

    public void setCredits(Long balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getOwner() {
        return owner;
    }

    public void setOwner(Set<User> owner) {
        this.owner = owner;
    }

    public Set<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}