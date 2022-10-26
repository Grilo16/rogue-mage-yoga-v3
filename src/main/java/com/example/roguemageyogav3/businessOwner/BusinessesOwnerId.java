package com.example.roguemageyogav3.businessOwner;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BusinessesOwnerId implements Serializable {
    private static final long serialVersionUID = 3283186354234670130L;
    @Column(name = "business_id", nullable = false)
    private Long businessId;

    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BusinessesOwnerId entity = (BusinessesOwnerId) o;
        return Objects.equals(this.businessId, entity.businessId) &&
                Objects.equals(this.ownerId, entity.ownerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessId, ownerId);
    }

}