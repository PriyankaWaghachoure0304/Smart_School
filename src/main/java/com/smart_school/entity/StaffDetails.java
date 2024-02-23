package com.smart_school.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="staff")
public class StaffDetails {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String employmentStatus;
	    private String designation;
	    private int trainedAs;
	    private String staffType;
	    private String qualificationType;
	    private boolean ctet;
	    private String staffDepartment;
	    private String educationQualification;
	    private String employmentCategory;
	    private String accessLevel;
	    private String FirstName;
	    private String EmergencyContactNo;
	    private String PermanentAddress;
	    private String Middlename;
	    private String Gender;
	    private String CorrespoindingAddress;
	    private String LastName;
	    private String DateOfBirth;
	    private String Religion;
	    private String MobileNo;
	    private String emailid;
	    private String AadharNo;
	    private String salaryPayType;
	    private String panno;
	    private String GovernmentId;
	    private String DateOfJoining;
	    private String CitizenShip;
	    private String StaffReferenceId;
		@Override
		public String toString() {
			return "StaffDetails []";
		}
	    
		public StaffDetails() {
			super();
			// TODO Auto-generated constructor stub
		}

		public StaffDetails(Long id, String employmentStatus, String designation, int trainedAs, String staffType,
				String qualificationType, boolean ctet, String staffDepartment, String educationQualification,
				String employmentCategory, String accessLevel, String firstName, String emergencyContactNo,
				String permanentAddress, String middlename, String gender, String correspoindingAddress,
				String lastName, String dateOfBirth, String religion, String mobileNo, String emailid, String aadharNo,
				String salarypaytype, String panno, String governmentId, String dateOfJoining, String citizenShip,
				String staffReferenceId) {
			super();
			this.id = id;
			this.employmentStatus = employmentStatus;
			this.designation = designation;
			this.trainedAs = trainedAs;
			this.staffType = staffType;
			this.qualificationType = qualificationType;
			this.ctet = ctet;
			this.staffDepartment = staffDepartment;
			this.educationQualification = educationQualification;
			this.employmentCategory = employmentCategory;
			this.accessLevel = accessLevel;
			FirstName = firstName;
			EmergencyContactNo = emergencyContactNo;
			PermanentAddress = permanentAddress;
			Middlename = middlename;
			Gender = gender;
			CorrespoindingAddress = correspoindingAddress;
			LastName = lastName;
			DateOfBirth = dateOfBirth;
			Religion = religion;
			MobileNo = mobileNo;
			this.emailid = emailid;
			AadharNo = aadharNo;
			this.salaryPayType = salarypaytype;
			this.panno = panno;
			GovernmentId = governmentId;
			DateOfJoining = dateOfJoining;
			CitizenShip = citizenShip;
			StaffReferenceId = staffReferenceId;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmploymentStatus() {
			return employmentStatus;
		}

		public void setEmploymentStatus(String employmentStatus) {
			this.employmentStatus = employmentStatus;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public int getTrainedAs() {
			return trainedAs;
		}

		public void setTrainedAs(int trainedAs) {
			this.trainedAs = trainedAs;
		}

		public String getStaffType() {
			return staffType;
		}

		public void setStaffType(String staffType) {
			this.staffType = staffType;
		}

		public String getQualificationType() {
			return qualificationType;
		}

		public void setQualificationType(String qualificationType) {
			this.qualificationType = qualificationType;
		}

		public boolean isCtet() {
			return ctet;
		}

		public void setCtet(boolean ctet) {
			this.ctet = ctet;
		}

		public String getStaffDepartment() {
			return staffDepartment;
		}

		public void setStaffDepartment(String staffDepartment) {
			this.staffDepartment = staffDepartment;
		}

		public String getEducationQualification() {
			return educationQualification;
		}

		public void setEducationQualification(String educationQualification) {
			this.educationQualification = educationQualification;
		}

		public String getEmploymentCategory() {
			return employmentCategory;
		}

		public void setEmploymentCategory(String employmentCategory) {
			this.employmentCategory = employmentCategory;
		}

		public String getAccessLevel() {
			return accessLevel;
		}

		public void setAccessLevel(String accessLevel) {
			this.accessLevel = accessLevel;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getEmergencyContactNo() {
			return EmergencyContactNo;
		}

		public void setEmergencyContactNo(String emergencyContactNo) {
			EmergencyContactNo = emergencyContactNo;
		}

		public String getPermanentAddress() {
			return PermanentAddress;
		}

		public void setPermanentAddress(String permanentAddress) {
			PermanentAddress = permanentAddress;
		}

		public String getMiddlename() {
			return Middlename;
		}

		public void setMiddlename(String middlename) {
			Middlename = middlename;
		}

		public String getGender() {
			return Gender;
		}

		public void setGender(String gender) {
			Gender = gender;
		}

		public String getCorrespoindingAddress() {
			return CorrespoindingAddress;
		}

		public void setCorrespoindingAddress(String correspoindingAddress) {
			CorrespoindingAddress = correspoindingAddress;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public String getDateOfBirth() {
			return DateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			DateOfBirth = dateOfBirth;
		}

		public String getReligion() {
			return Religion;
		}

		public void setReligion(String religion) {
			Religion = religion;
		}

		public String getMobileNo() {
			return MobileNo;
		}

		public void setMobileNo(String mobileNo) {
			MobileNo = mobileNo;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public String getAadharNo() {
			return AadharNo;
		}

		public void setAadharNo(String aadharNo) {
			AadharNo = aadharNo;
		}

		public String getSalarypaytype() {
			return salaryPayType;
		}

		public void setSalarypaytype(String salarypaytype) {
			this.salaryPayType = salarypaytype;
		}

		public String getPanno() {
			return panno;
		}

		public void setPanno(String panno) {
			this.panno = panno;
		}

		public String getGovernmentId() {
			return GovernmentId;
		}

		public void setGovernmentId(String governmentId) {
			GovernmentId = governmentId;
		}

		public String getDateOfJoining() {
			return DateOfJoining;
		}

		public void setDateOfJoining(String dateOfJoining) {
			DateOfJoining = dateOfJoining;
		}

		public String getCitizenShip() {
			return CitizenShip;
		}

		public void setCitizenShip(String citizenShip) {
			CitizenShip = citizenShip;
		}

		public String getStaffReferenceId() {
			return StaffReferenceId;
		}

		public void setStaffReferenceId(String staffReferenceId) {
			StaffReferenceId = staffReferenceId;
		}
		
		
	    }
