package com.demoqa.pages;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoQAPages {
    protected TextBoxPage textBoxPage;
    protected WebTablesPage webTablesPage;
    protected PracticeFormPage practiceFormPage;
    protected ProgressBarPage progressBarPage;
    protected OrangePage orangePage;

    public void setUp(){
        textBoxPage = new TextBoxPage();
        webTablesPage = new WebTablesPage();
        practiceFormPage = new PracticeFormPage();
        progressBarPage = new ProgressBarPage();
        orangePage = new OrangePage();

    }
}
