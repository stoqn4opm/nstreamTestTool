package com.group11.MenuPages;

import com.group11.menuEntries.BaseMenuEntry;
import com.group11.menuEntries.MenuEntriesProvider;
import java.util.ArrayList;

public class MenuPageProvider {

    public static ListMenuPage getMainMenuPage() {

        BaseMenuEntry entry5 = new BaseMenuEntry("Generate random video in raw format");
        BaseMenuEntry entry6 = new BaseMenuEntry("Options");

        ArrayList<BaseMenuEntry> list = new ArrayList<>();
        list.add(MenuEntriesProvider.liveStreamAdv7180Entry());
        list.add(MenuEntriesProvider.liveStreamRawVideoEntry(""));
        list.add(MenuEntriesProvider.liveStreamRandomVideoEntry());
        list.add(MenuEntriesProvider.convertToRawVideo());
        list.add(entry5);
        list.add(entry6);

        ListMenuPage listPage = new ListMenuPage(list, "Main Menu:");
        return listPage;
    }

    public static BaseMenuPage getConvertToVideoRawSubPage() {

        ArrayList<BaseMenuEntry> entries = new ArrayList<>();
        BaseMenuEntry entry = new BaseMenuEntry("enter path to video that you want to convert or \"back\" to get to previous menu:");
        entries.add(entry);
        BaseMenuPage convertToRawVideo = new MessageMenuPage(entries, "Convert digital video to raw format");
        return convertToRawVideo;
    }
}
