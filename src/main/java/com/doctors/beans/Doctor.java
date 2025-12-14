package com.doctors.beans;

public class Doctor {
    private int id;
    private String name;
    private String specialty;
    private String doctorRegistrationNumber;
    private String qualification;
    private String gender;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public String getDoctorRegistrationNumber() { return doctorRegistrationNumber; }
    public void setDoctorRegistrationNumber(String doctorRegistrationNumber) { this.doctorRegistrationNumber = doctorRegistrationNumber; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}