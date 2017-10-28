package com.group11.MenuPages;

import com.group11.ConsoleHandler;
import com.group11.MenuEntry;

import java.util.ArrayList;

public class ListMenuPage extends BaseMenuPage {

    public String pageTitle = "";

    public ListMenuPage(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public ListMenuPage(ArrayList<MenuEntry> entries, String pageTitle) {
        super(entries);
        this.pageTitle = pageTitle;
    }

    @Override
    public String textRepresentation() {

        MenuEntry[] entries = this.entries.toArray(new MenuEntry[this.entries.size()]);

        StringBuilder sb = new StringBuilder();
        sb.append(pageTitle).append("\n");

        for (int i = 0; i < entries.length; i++) {
            sb.append(String.format("%d. %s\n", i, entries[i].title));
        }
        sb.append("\nChoose your input: ");

        return sb.toString();
    }

    @Override
    public void handleUserInput(String input) {
        int index = -1;

        try { index = Integer.parseInt(input); }
        catch (NumberFormatException e) {
            ConsoleHandler.shared().printMessage(String.format("Wrong Input. Type a number from %d to %d", 0, entries.size() - 1));
            ConsoleHandler.shared().reloadMenuAfter(2000);
            return;
        }

        MenuEntry[] entries = this.entries.toArray(new MenuEntry[this.entries.size()]);

        if (index != -1 && index < entries.length) {
            entries[index].action();
            return;
        }

        ConsoleHandler.shared().printMessage(String.format("Wrong Input. Type a number from %d to %d", 0, entries.length - 1));
        ConsoleHandler.shared().reloadMenuAfter(2000);
    }


}
