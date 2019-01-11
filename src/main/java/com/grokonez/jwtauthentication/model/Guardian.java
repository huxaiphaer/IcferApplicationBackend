package com.grokonez.jwtauthentication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String relationship_to_orphan;
    private String occupation;
    private Double monthly_income;
    private String employers_name;
    private String work_address;
    private String mobile_no;
    private String physical_location;
    private String comments;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRelationship_to_orphan() {
        return relationship_to_orphan;
    }

    public void setRelationship_to_orphan(String relationship_to_orphan) {
        this.relationship_to_orphan = relationship_to_orphan;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Double getMonthly_income() {
        return monthly_income;
    }

    public void setMonthly_income(Double monthly_income) {
        this.monthly_income = monthly_income;
    }

    public String getEmployers_name() {
        return employers_name;
    }

    public void setEmployers_name(String employers_name) {
        this.employers_name = employers_name;
    }

    public String getWork_address() {
        return work_address;
    }

    public void setWork_address(String work_address) {
        this.work_address = work_address;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getPhysical_location() {
        return physical_location;
    }

    public void setPhysical_location(String physical_location) {
        this.physical_location = physical_location;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
