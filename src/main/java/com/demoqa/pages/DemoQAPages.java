package com.demoqa.pages;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoQAPages {
    public TextBoxPage textBoxPage;
    public WebTablesPage webTablesPage;
    public PracticeFormPage practiceFormPage;

    public void setUp(){
        textBoxPage = new TextBoxPage();
        webTablesPage = new WebTablesPage();
        practiceFormPage = new PracticeFormPage();

    }
}
