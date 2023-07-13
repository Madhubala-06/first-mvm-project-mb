package com.fssa.mb.sampleprogram.holidaywork;

import com.fssa.mb.sampleprogram.holidaywork.BookingDetails;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class UserValidations {
    public static boolean validate(BookingDetails booking) throws IllegalArgumentException {
        if (booking == null) {
        	
            throw new IllegalArgumentException("Argument is null.");
            
        }

        validateDate(booking.getDate());
        validateLocation(booking.getLocation());
        validateTime(booking.getTime());
        validateDoorNumber(booking.getDoorNumber());
        validateAddress(booking.getAddress());
        validateMobileNumber(booking.getMobileNumber());
        validateSelectedOptions(booking.getSelectedOptions());
        return true;
        
    }
    
    
    public static void validateDate(LocalDate date) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null.");
        }

        String pattern = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formattedDate = date.format(formatter);

        if (!formattedDate.equals(date.toString())) {
        	
            throw new IllegalArgumentException("Invalid date format.");
        }
    }
    public static void validateLocation(String location) throws IllegalArgumentException {
        if (location == null || location.isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty.");
        }
    }

    public static void validateTime(String time) throws IllegalArgumentException {
        if (time == null || time.isEmpty()) {
            throw new IllegalArgumentException("Time cannot be empty.");
        }
    }

    public static void validateDoorNumber(String doorNumber) throws IllegalArgumentException {
        if (doorNumber == null || doorNumber.isEmpty()) {
            throw new IllegalArgumentException("Door number cannot be empty.");
        }

        String regex = "[A-Za-z0-9]+"; 
        if (!Pattern.matches(regex, doorNumber)) {
            throw new IllegalArgumentException("Invalid door number format.");
        }
    }

    public static void validateAddress(String address) throws IllegalArgumentException {
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty.");
        }

        String regex = "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)";
        if (!Pattern.matches(regex, address)) {
            throw new IllegalArgumentException("Invalid address format.");
        }
    }

    public static void validateMobileNumber(String mobileNumber) throws IllegalArgumentException {
        if (mobileNumber == null || mobileNumber.isEmpty()) {
            throw new IllegalArgumentException("Mobile number cannot be empty.");
        }

        String regex = "\\d{3}-\\d{3}-\\d{4}"; 
        if (!Pattern.matches(regex, mobileNumber)) {
            throw new IllegalArgumentException("Invalid mobile number format.");
        }
    }

    public static void validateSelectedOptions(String selectedOptions) throws IllegalArgumentException {
        if (selectedOptions == null || selectedOptions.isEmpty()) {
            throw new IllegalArgumentException("Selected options cannot be empty.");
        }
    }
    public static void main(String[] args) {
    	
        BookingDetails booking = new BookingDetails();
        booking.setDate(LocalDate.parse("2023-07-04"));
        booking.setLocation("New York");
        booking.setTime("10:00 AM");
        booking.setDoorNumber("123");
        booking.setAddress("123 Main St");
        booking.setMobileNumber("555-1234");
        booking.setSelectedOptions("Option 1, Option 2");

        try {
        	
            validate(booking);
            
        } catch (IllegalArgumentException e) {
        	
            System.out.println("Validation failed with valid booking details: " + " " + e.getMessage());
            
        }
        
    }

 
 
    
}
