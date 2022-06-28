package com.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cq")
public class Cheque extends Payment{
    @Column(name="cq_type")
    private String cqType;

    public String getCqType() {
        return cqType;
    }

    public void setCqType(String cqType) {
        this.cqType = cqType;
    }
}
