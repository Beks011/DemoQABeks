package com.demoqa.enums;

import lombok.Getter;

import javax.annotation.processing.Generated;

public enum PanelMenu {
    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time"),
    RECRUITMENT("Recruitment"),
    MYINFO("My Info"),
    PERFORMANCE("Performance"),
    DASHBOARD("Dashboard"),
    DIRECTORY("Directory"),
    MAINTENANCE("Maintenance"),
    CLAIM("Claim"),
    BUZZ("Buzz");
    @Getter
    String panelMenu;

    PanelMenu(String panelMenu) {
        this.panelMenu = panelMenu;
    }
}
