package com.sha.appointment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "boss")
public class Boss extends Person {

    @Transient
    private Set<Doctor> doctors = new HashSet<>();
}
