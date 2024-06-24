package com.demoqa.entities;

import lombok.*;
import org.checkerframework.checker.units.qual.A;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class PractiseFormEntity {
    private String firstName;
    private String lastName;
    private int gender;
    private String email;
    private String number;
    private String subject;
    private String currentAddress;
    private String state;
    private String city;
}
