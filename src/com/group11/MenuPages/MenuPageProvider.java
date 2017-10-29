package com.group11.MenuPages;

import com.group11.menuEntries.BaseMenuEntry;
import com.group11.menuEntries.MenuEntriesProvider;
import com.group11.menuEntries.UserInputMenuEntry;

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
        ArrayList<String> commands = new ArrayList<>();

        commands.add("/usr/local/Cellar/ffmpeg/3.4/bin/ffmpeg");
        commands.add("-i");
        commands.add(UserInputMenuEntry.INPUT_PLACEHOLDER);
        commands.add("-s");
        commands.add("256x240");
        commands.add("-c:v");
        commands.add("rawvideo");
        commands.add("-pixel_format");
        commands.add("yuv422p");
        commands.add("-an");
        commands.add("-f");
        commands.add("rawvideo");
        commands.add("rawvideo.raw");

        UserInputMenuEntry entry = new UserInputMenuEntry("enter path to video or \"back\" to get to previous menu:", commands);
        entries.add(entry);
        BaseMenuPage convertToRawVideo = new MessageMenuPage(entries, "Convert digital video to raw format");
        return convertToRawVideo;
    }
}
