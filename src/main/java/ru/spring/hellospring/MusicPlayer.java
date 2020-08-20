package ru.spring.hellospring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Ioc
    /*public MusicPlayer(Music music) {
        this.music = music;
    }*/

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }
    }


}
