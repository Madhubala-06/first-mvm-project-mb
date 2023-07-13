package com.fssa.mb.sampleprogram.holidaywork;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserValidationsTest {
    private BookingDetails createValidBookingDetails() {
        BookingDetails booking = new BookingDetails();
        booking.setDate(LocalDate.now());
        booking.setLocation("New York");
        booking.setTime("10:00 AM");
        booking.setDoorNumber("123");
        booking.setAddress("123 Main St");
        booking.setMobileNumber("555-1234");
        booking.setSelectedOptions("Option 1, Option 2");
        return booking;
    }

    public void testValidateWithValidBookingDetails() {
        BookingDetails booking = createValidBookingDetails();

        try {
            UserValidations.validate(booking);
            // Validation passed, no need for an error message
        } catch (IllegalArgumentException e) {
            fail("Validation failed with valid booking details: " + e.getMessage());
            // Include an error message for the test case
        }
    }


    @Test
    public void testValidateWithNullDate() {
        BookingDetails booking = createValidBookingDetails();
        booking.setDate(null);

        try {
            UserValidations.validate(booking);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Date cannot be null.", e.getMessage());
        }
    }

    @Test
    public void testValidateWithInvalidMobileNumberFormat() {
        BookingDetails booking = createValidBookingDetails();
        booking.setMobileNumber("1234567890"); // Invalid mobile number format

        try {
            UserValidations.validate(booking);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid mobile number format.", e.getMessage());
        }
    }

    @Test
    public void testValidateWithInvalidAddressFormat() {
        BookingDetails booking = createValidBookingDetails();
        booking.setAddress("Main St"); // Invalid address format (less than minimum characters)

        try {
            UserValidations.validate(booking);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid address format.", e.getMessage());
        }
    }
}
