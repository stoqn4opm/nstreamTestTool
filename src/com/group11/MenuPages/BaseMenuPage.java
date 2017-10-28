package com.group11.MenuPages;

import com.group11.MenuEntry;

import java.util.ArrayList;

public class BaseMenuPage {

    public ArrayList<MenuEntry> entries;

    BaseMenuPage() {
        entries = new ArrayList<MenuEntry>();
    }

    public BaseMenuPage(ArrayList<MenuEntry> entries) {
        this.entries = entries;
    }

    public String textRepresentation() { return ""; }
    public void handleUserInput(String input) {}
}
