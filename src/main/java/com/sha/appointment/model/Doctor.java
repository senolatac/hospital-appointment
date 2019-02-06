package com.sha.appointment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor")
public class Doctor extends Person {

    @Column(name = "title")
    @Enumerated(EnumType.STRING)
    private TitleOfDoctor title;

    @Column(name = "graduation_date")
    private LocalDate graduationDate;

    @Transient
    private Set<Appointment> appointments = new HashSet<>();
}
