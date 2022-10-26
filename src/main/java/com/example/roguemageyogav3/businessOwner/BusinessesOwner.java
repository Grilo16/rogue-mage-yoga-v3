package com.example.roguemageyogav3.businessOwner;

import com.example.roguemageyogav3.business.Business;
import com.example.roguemageyogav3.user.User;

import javax.persistence.*;

@Entity
@Table(name = "businesses_owners")
public class BusinessesOwner {
    @EmbeddedId
    private BusinessesOwnerId id;

    @MapsId("businessId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;

    @MapsId("ownerId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    public BusinessesOwnerId getId() {
        return id;
    }

    public void setId(BusinessesOwnerId id) {
        this.id = id;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

}