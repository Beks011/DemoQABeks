package com.demoqa.entities;

import lombok.*;
@Getter
@Setter

@AllArgsConstructor


public class TextBoxEntity {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;

    public TextBoxEntity() {

    }
}
