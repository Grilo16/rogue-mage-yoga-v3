package com.example.roguemageyogav3.member;

import com.example.roguemageyogav3.business.Business;
import com.example.roguemageyogav3.user.User;

import javax.persistence.*;

@Entity
@Table(name = "businesses_members")
public class BusinessesMember {
    @EmbeddedId
    private BusinessesMemberId id;

    @MapsId("businessId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;

    @MapsId("membersId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "members_id", nullable = false)
    private User members;

    @Column(name = "membership_status")
    private String membershipStatus;

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public BusinessesMemberId getId() {
        return id;
    }

    public void setId(BusinessesMemberId id) {
        this.id = id;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public User getMembers() {
        return members;
    }

    public void setMembers(User members) {
        this.members = members;
    }

}