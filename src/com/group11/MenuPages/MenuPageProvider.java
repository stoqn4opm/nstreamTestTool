package com.group11.MenuPages;

import com.group11.menuEntries.BaseMenuEntry;
import com.group11.menuEntries.ProcessStatusMenuEntry;
import java.util.ArrayList;

public class MenuPageProvider {

    public static ListMenuPage getMainMenuPage() {

        BaseMenuEntry entry5 = new BaseMenuEntry("Generate random video in raw format");
        BaseMenuEntry entry6 = new BaseMenuEntry("Options");

        ArrayList<BaseMenuEntry> list = new ArrayList<>();
        list.add(MenuEntriesProvider.liveStreamAdv7180Entry());
        list.add(MenuEntriesProvider.liveStreamRawVideoEntry(""));
        list.add(MenuEntriesProvider.liveStreamRandomVideoEntry());
        list.add(MenuEntriesProvider.converttoRawVideo(""));
        list.add(entry5);
        list.add(entry6);

        ListMenuPage listPage = new ListMenuPage(list, "Main Menu:");
        return listPage;
    }

}

class MenuEntriesProvider {

    static ProcessStatusMenuEntry liveStreamAdv7180Entry() {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("ping");
        commands.add("google.bg");
        commands.add("-c");
        commands.add("4");

        ProcessStatusMenuEntry entry = new ProcessStatusMenuEntry("Live stream to youtube from ADV7180", commands);
        return entry;
    }

    static ProcessStatusMenuEntry liveStreamRawVideoEntry(String fileName) {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("ping");
        commands.add("google.bg");
        commands.add("-c");
        commands.add("4");

        ProcessStatusMenuEntry entry = new ProcessStatusMenuEntry("Stream from a raw video file", commands);
        return entry;
    }

    static ProcessStatusMenuEntry liveStreamRandomVideoEntry() {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("ping");
        commands.add("google.bg");
        commands.add("-c");
        commands.add("4");

        ProcessStatusMenuEntry entry = new ProcessStatusMenuEntry("Live stream random video", commands);
        return entry;
    }

     static ProcessStatusMenuEntry converttoRawVideo(String pathToFile) {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("ping");
        commands.add("google.bg");
        commands.add("-c");
        commands.add("4");
//        commands.add("ffmpeg");
//        commands.add("-i");
//        commands.add(pathToFile);
//        commands.add("-s");
//        commands.add("256x240");
//        commands.add("-c:v");
//        commands.add("rawvideo");
//        commands.add("-pixel_format");
//        commands.add("yuv422p");
//        commands.add("-an");
//        commands.add("-f");
//        commands.add("rawvideo");
//        commands.add("rawvideo.raw");

        ProcessStatusMenuEntry entry = new ProcessStatusMenuEntry("Convert digital video to raw format", commands);
        return entry;
    }
}
