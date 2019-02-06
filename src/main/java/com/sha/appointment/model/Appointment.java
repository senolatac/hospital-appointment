package com.sha.appointment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "appointment")
public class Appointment extends BaseModel {

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "appointment_time")
    private LocalDateTime appointmentTime;
}
