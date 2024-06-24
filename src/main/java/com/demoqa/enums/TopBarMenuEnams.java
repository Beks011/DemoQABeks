package com.demoqa.enums;

import lombok.Getter;

public enum TopBarMenuEnams {
    USER_MANAGEMENT("User Management", new String[]{"Users"}),
    JOB("Job", new String[]{"Job Titles", "Pay Grades", "Employment Status", "Job Categories", "Work Shifts"}),
    ORGANIZATION("Organization", new String[]{"General Information", "Locations", "Structure"}),
    QUALIFICATIONS("Qualifications", new String[]{"Skills", "Education", "Licenses", "Languages", "Memberships"}),
    NATIONALITIES("Nationalities"),
    CORPORATE_BRANDING("Corporate Branding"),
    CONFIGURATION("Configuration", new String[]{"Email Configuration", "Email Subscriptions", "Localization", "Language Packages", "Modules", "Social Media Authentication",
            "Register OAuth Client", "LDAP Configuration"});
    @Getter
    String topBarMenu;
    String[] topBarMenuItems;

    TopBarMenuEnams(String topBarMenu, String... topBarMenuItems) {
        this.topBarMenu = topBarMenu;
        this.topBarMenuItems = topBarMenuItems;
    }
}
