package com.sha.appointment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "member")
public class MemberFile extends BaseModel {

    @Column(name = "file_no")
    private String fileNo;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Transient
    private Set<Operation> operations = new HashSet<>();
}
