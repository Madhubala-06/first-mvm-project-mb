package com.fssa.mb.sampleprogram.holidaywork;

import java.time.LocalDate;
import java.util.Date;

public class BookingDetails {
    private LocalDate date;
    private String location;
    private String time;
    private String doorNumber;
    private String address;
    private String mobileNumber;
    private String selectedOptions;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date2) {
        this.date = date2;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
        
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(String selectedOptions) {
        this.selectedOptions = selectedOptions;
    }


}
