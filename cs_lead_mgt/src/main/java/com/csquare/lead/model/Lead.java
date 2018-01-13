package com.csquare.lead.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "lead", schema = "lead_mgt")
public class Lead {

    @Id
    @Column(name = "pk")
    private String pK;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "city")
    private String city;

    @Column(name = "comment")
    private String comment;

    @Column(name = "lead_status")
    private String leasStatus;

    @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, orphanRemoval = true)
    @JoinColumn(name = "lead_id", referencedColumnName = "pk")
    private Set<LeadGrade> leadGradeList = new HashSet<LeadGrade>();

    @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, orphanRemoval = true)
    @JoinColumn(name = "lead_id", referencedColumnName = "pk")
    private Set<LeadLocation> leadLocationList = new HashSet<LeadLocation>();

    @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, orphanRemoval = true)
    @JoinColumn(name = "lead_id", referencedColumnName = "pk")
    private Set<LeadSubject> leadSubjectList = new HashSet<LeadSubject>();

    @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, orphanRemoval = true)
    @JoinColumn(name = "lead_id", referencedColumnName = "pk")
    private Set<LeadSyllabus> leadSyllabusList = new HashSet<LeadSyllabus>();

    public String getpK() {

        return pK;
    }

    public void setpK(String pK) {

        this.pK = pK;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Integer getPhone() {

        return phone;
    }

    public void setPhone(Integer phone) {

        this.phone = phone;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getComment() {

        return comment;
    }

    public void setComment(String comment) {

        this.comment = comment;
    }

    public String getLeasStatus() {

        return leasStatus;
    }

    public void setLeasStatus(String leasStatus) {

        this.leasStatus = leasStatus;
    }

    public Set<LeadGrade> getLeadGradeList() {

        return leadGradeList;
    }

    public void setLeadGradeList(Set<LeadGrade> leadGradeList) {

        this.leadGradeList = leadGradeList;
    }

    public Set<LeadLocation> getLeadLocationList() {

        return leadLocationList;
    }

    public void setLeadLocationList(Set<LeadLocation> leadLocationList) {

        this.leadLocationList = leadLocationList;
    }

    public Set<LeadSubject> getLeadSubjectList() {

        return leadSubjectList;
    }

    public void setLeadSubjectList(Set<LeadSubject> leadSubjectList) {

        this.leadSubjectList = leadSubjectList;
    }

    public Set<LeadSyllabus> getLeadSyllabusList() {

        return leadSyllabusList;
    }

    public void setLeadSyllabusList(Set<LeadSyllabus> leadSyllabusList) {

        this.leadSyllabusList = leadSyllabusList;
    }

}
