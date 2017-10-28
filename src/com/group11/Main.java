package com.group11;

import com.group11.MenuPages.ListMenuPage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MenuEntry entry1 = new MenuEntry("Entry 1");
        MenuEntry entry2 = new MenuEntry("Entry 2");
        MenuEntry entry3 = new MenuEntry("Entry 3");
        MenuEntry entry4 = new MenuEntry("Entry 4");

        ArrayList<MenuEntry> list = new ArrayList<>();
        list.add(entry1);
        list.add(entry2);
        list.add(entry3);
        list.add(entry4);

        ListMenuPage listPage = new ListMenuPage(list, "Main Menu");

        ConsoleHandler.shared().loadMenu(listPage);
    }
}
