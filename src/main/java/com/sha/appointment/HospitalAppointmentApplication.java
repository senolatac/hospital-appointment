package com.sha.appointment;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalAppointmentApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HospitalAppointmentApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
