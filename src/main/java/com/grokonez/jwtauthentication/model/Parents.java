package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String religion__of_deceased_father;
    private String religion__of_deceased_mother;
    @Temporal(TemporalType.DATE)
    private Date date_of_demise_of_father;
    @Temporal(TemporalType.DATE)
    private Date date_of_demise_of_mother;
    private String names_of_mother;
    private String religion_of_mother;
    private String marital_status_of_mother;
    private String occupation_of_mother;
    private Double monthly_income;


}
