package com.csquare.student.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

import com.csquare.framework.entity.PKGenerator;


@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "student", schema = "student_mgt")
@NamedQuery(name = "getAllStudents", query = NamedQueryConstants.getAllStudents)
public class Student {

    @Id
    @Column(name = "pk")
    @GeneratedValue(generator = PKGenerator.NAME)
    @GenericGenerator(name = PKGenerator.NAME, strategy = PKGenerator.CLASS)
    private String pK;

    @Column(name = "address")
    private String address;

    @Column(name = "syllabus")
    private String syllabus;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "city")
    private String city;

    @Column(name = "location")
    private String location;

    @Column(name = "comment")
    private String comment;

    @Column(name = "gender")
    private String gender;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name = "existing_client")
    private Boolean existingClient;

    @Column(name = "source_of_lead")
    private String sourceOfLead;

    @Column(name = "is_hold")
    private Boolean isHold;

    @Column(name = "student_record_owner")
    private String studentRecordOwner;

    @Column(name = "grade")
    private String grade;

    @Column(name = "is_parent_doc_submitted")
    private Boolean parentsDocStatus;

    @Column(name = "is_intrested")
    private Boolean interested;

    @Column(name = "is_not_interested")
    private Boolean notInterested;

    @Column(name = "is_demo_required")
    private Boolean demoRequired;

    @Column(name = "demo_date")
    private String demoDate;

    @Column(name = "is_converted")
    private Boolean converted;

    @Column(name = "enrollment_date")
    private String enrollmentDate;

    @Column(name = "is_followup_required")
    private Boolean requiredFollowUp;

    @Column(name = "next_followup_date")
    private String followUpDate;

    @Column(name = "preffered_call_time")
    private String callPreferredTime;

    @Column(name = "is_conversion_pending")
    private Boolean pendingForConversion;

    @Column(name = "is_home_tuition_stop")
    private Boolean isStopped;

    @Column(name = "class_stop_date")
    private String stoppedDate;

    @Column(name = "is_agreement_sent_to_parent")
    private Boolean parentAgreementStatus;

    @Column(name = "is_agreemenet_sent_to_tutor")
    private Boolean tutorAgreementStatus;

    @Column(name = "package_in_hrs")
    private String packageInHrs;

    @Column(name = "hourly_rate")
    private String hourlyRate;

    @Column(name = "registration_fee_amount")
    private String registrationFee;

    @Column(name = "is_registration_paid")
    private Boolean isRegistrationPaid;

    @Column(name = "total_tuition_fee")
    private String studentTotalFee;

    @Column(name = "csquare_income")
    private String csquareIncome;

    @Column(name = "tuition_required_for_months")
    private String tutionRequiredForMonths;

    @OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval = true)
    @JoinColumn(name = "student_id", referencedColumnName = "pk")
    @Fetch(FetchMode.JOIN)
    private Set<StudentTutor> studentTutorList = new LinkedHashSet<StudentTutor>();

    @OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval = true)
    @JoinColumn(name = "student_id", referencedColumnName = "pk")
    @Fetch(FetchMode.JOIN)
    private Set<StudentSubject> studentSubjectList = new LinkedHashSet<StudentSubject>();

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

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public String getParentName() {

        return parentName;
    }

    public void setParentName(String parentName) {

        this.parentName = parentName;
    }

    public Boolean getExistingClient() {

        return existingClient;
    }

    public void setExistingClient(Boolean existingClient) {

        this.existingClient = existingClient;
    }

    public String getSourceOfLead() {

        return sourceOfLead;
    }

    public void setSourceOfLead(String sourceOfLead) {

        this.sourceOfLead = sourceOfLead;
    }

    public Boolean getIsHold() {

        return isHold;
    }

    public void setIsHold(Boolean isHold) {

        this.isHold = isHold;
    }

    public String getStudentRecordOwner() {

        return studentRecordOwner;
    }

    public void setStudentRecordOwner(String studentRecordOwner) {

        this.studentRecordOwner = studentRecordOwner;
    }

    public String getGrade() {

        return grade;
    }

    public void setGrade(String grade) {

        this.grade = grade;
    }

    public Boolean getParentsDocStatus() {

        return parentsDocStatus;
    }

    public void setParentsDocStatus(Boolean parentsDocStatus) {

        this.parentsDocStatus = parentsDocStatus;
    }

    public Boolean getInterested() {

        return interested;
    }

    public void setInterested(Boolean interested) {

        this.interested = interested;
    }

    public Boolean getNotInterested() {

        return notInterested;
    }

    public void setNotInterested(Boolean notInterested) {

        this.notInterested = notInterested;
    }

    public Boolean getDemoRequired() {

        return demoRequired;
    }

    public void setDemoRequired(Boolean demoRequired) {

        this.demoRequired = demoRequired;
    }

    public String getDemoDate() {

        return demoDate;
    }

    public void setDemoDate(String demoDate) {

        this.demoDate = demoDate;
    }

    public Boolean getConverted() {

        return converted;
    }

    public void setConverted(Boolean converted) {

        this.converted = converted;
    }

    public String getEnrollmentDate() {

        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {

        this.enrollmentDate = enrollmentDate;
    }

    public Boolean getRequiredFollowUp() {

        return requiredFollowUp;
    }

    public void setRequiredFollowUp(Boolean requiredFollowUp) {

        this.requiredFollowUp = requiredFollowUp;
    }

    public String getFollowUpDate() {

        return followUpDate;
    }

    public void setFollowUpDate(String followUpDate) {

        this.followUpDate = followUpDate;
    }

    public String getCallPreferredTime() {

        return callPreferredTime;
    }

    public void setCallPreferredTime(String callPreferredTime) {

        this.callPreferredTime = callPreferredTime;
    }

    public Boolean getPendingForConversion() {

        return pendingForConversion;
    }

    public void setPendingForConversion(Boolean pendingForConversion) {

        this.pendingForConversion = pendingForConversion;
    }

    public Boolean getIsStopped() {

        return isStopped;
    }

    public void setIsStopped(Boolean isStopped) {

        this.isStopped = isStopped;
    }

    public String getStoppedDate() {

        return stoppedDate;
    }

    public void setStoppedDate(String stoppedDate) {

        this.stoppedDate = stoppedDate;
    }

    public Boolean getParentAgreementStatus() {

        return parentAgreementStatus;
    }

    public void setParentAgreementStatus(Boolean parentAgreementStatus) {

        this.parentAgreementStatus = parentAgreementStatus;
    }

    public Boolean getTutorAgreementStatus() {

        return tutorAgreementStatus;
    }

    public void setTutorAgreementStatus(Boolean tutorAgreementStatus) {

        this.tutorAgreementStatus = tutorAgreementStatus;
    }

    public Boolean getIsRegistrationPaid() {

        return isRegistrationPaid;
    }

    public void setIsRegistrationPaid(Boolean isRegistrationPaid) {

        this.isRegistrationPaid = isRegistrationPaid;
    }

    public Set<StudentTutor> getStudentTutorList() {

        return studentTutorList;
    }

    public void setStudentTutorList(Set<StudentTutor> studentTutorList) {

        this.studentTutorList = studentTutorList;
    }

    public Set<StudentSubject> getStudentSubjectList() {

        return studentSubjectList;
    }

    public void setStudentSubjectList(Set<StudentSubject> studentSubjectList) {

        this.studentSubjectList = studentSubjectList;
    }

    public String getSyllabus() {

        return syllabus;
    }

    public void setSyllabus(String syllabus) {

        this.syllabus = syllabus;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getPackageInHrs() {

        return packageInHrs;
    }

    public void setPackageInHrs(String packageInHrs) {

        this.packageInHrs = packageInHrs;
    }

    public String getHourlyRate() {

        return hourlyRate;
    }

    public void setHourlyRate(String hourlyRate) {

        this.hourlyRate = hourlyRate;
    }

    public String getRegistrationFee() {

        return registrationFee;
    }

    public void setRegistrationFee(String registrationFee) {

        this.registrationFee = registrationFee;
    }

    public String getStudentTotalFee() {

        return studentTotalFee;
    }

    public void setStudentTotalFee(String studentTotalFee) {

        this.studentTotalFee = studentTotalFee;
    }

    public String getCsquareIncome() {

        return csquareIncome;
    }

    public void setCsquareIncome(String csquareIncome) {

        this.csquareIncome = csquareIncome;
    }

    public String getTutionRequiredForMonths() {

        return tutionRequiredForMonths;
    }

    public void setTutionRequiredForMonths(String tutionRequiredForMonths) {

        this.tutionRequiredForMonths = tutionRequiredForMonths;
    }

}
