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
public class Temporary {
    private String hostName;
    private String contact;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    private String email;
    private Date fromDate;
    private Date toDate;
    private String address;
    private String facilities;
    private int pricePerDay;
    private int occupancyFor;
    private String statusOfAccomodation;
    private String statusOfPost;
    private String accomodationRequests;

    public String getAccomodationRequests() {
        return accomodationRequests;
    }

    public void setAccomodationRequests(String accomodationRequests) {
        this.accomodationRequests = accomodationRequests;
    }

    public String getStatusOfPost() {
        return statusOfPost;
    }

    public void setStatusOfPost(String statusOfPost) {
        this.statusOfPost = statusOfPost;
    }
    private double DistanceFromUniversity;

    public double getDistanceFromUniversity() {
        return DistanceFromUniversity;
    }

    public void setDistanceFromUniversity(double DistanceFromUniversity) {
        this.DistanceFromUniversity = DistanceFromUniversity;
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

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
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

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getOccupancyFor() {
        return occupancyFor;
    }

    public void setOccupancyFor(int occupancyFor) {
        this.occupancyFor = occupancyFor;
    }

    public String getStatusOfAccomodation() {
        return statusOfAccomodation;
    }

    public void setStatusOfAccomodation(String statusOfAccomodation) {
        this.statusOfAccomodation = statusOfAccomodation;
    }

    @Override
    public String toString(){
        return toDate.toString();
    }
   
}
