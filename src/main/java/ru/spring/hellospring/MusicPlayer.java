package ru.spring.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music1;
    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("someRockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

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


    public String playMusic(Genre genre) {
        /*for (int i = 0; i < musicList.size(); i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }*/
        int songNumber = (int) (Math.random()*3);
        switch (genre) {
            case ROCK:
                return music2.getSong(songNumber);
            case CLASSIC:
                return music1.getSong(songNumber);
            default: return null;
        }
    }


}
