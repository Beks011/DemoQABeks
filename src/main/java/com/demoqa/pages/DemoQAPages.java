package com.demoqa.pages;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoQAPages {
    public TextBoxPage textBoxPage = new TextBoxPage();
    public WebTablesPage webTablesPage = new WebTablesPage();
    public PracticeFormPage practiceFormPage = new PracticeFormPage();
}
