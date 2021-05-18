package com.p.p.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "full_name", nullable = false)
    String fullName;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    Course course;

    @Column(name = "registration_date")
    LocalDateTime registrationDate;

    @Column(name = "sum", nullable = false)
    Integer sum;
}
