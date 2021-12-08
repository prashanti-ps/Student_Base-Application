/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.student.accomodation;

import java.util.Date;

/**
 *
 * @author Pratik
 */
public class Permanent {
    private String hostName;
    private String email;
    private String moveInDate;
    private String address;
    private String facilities;
    private int rent;
    private int totalPeopleInHouse;
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAccomodationRequests() {
        return accomodationRequests;
    }

    public void setAccomodationRequests(String accomodationRequests) {
        this.accomodationRequests = accomodationRequests;
    }
    private String statusOfAccomodation;
    private String statusOfPost;
    private String accomodationRequests;
    public String getStatusOfAccomodation() {
        return statusOfAccomodation;
    }

    public void setStatusOfAccomodation(String statusOfAccomodation) {
        this.statusOfAccomodation = statusOfAccomodation;
    }

    public String getStatusOfPost() {
        return statusOfPost;
    }

    public void setStatusOfPost(String statusOfPost) {
        this.statusOfPost = statusOfPost;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(String moveInDate) {
        this.moveInDate = moveInDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getTotalPeopleInHouse() {
        return totalPeopleInHouse;
    }

    public void setTotalPeopleInHouse(int totalPeopleInHouse) {
        this.totalPeopleInHouse = totalPeopleInHouse;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    private String Status; 
    private double distance;
    private String contact;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    @Override
    public String toString(){
        return String.valueOf(distance);
    }
}
