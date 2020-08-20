package ru.spring.hellospring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("someRockMusic")
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
     songs.add("Wind cries Mary");
     songs.add("Highway to hell");
     songs.add("Ruby tuesaday");
    }
    @Override
    public String getSong(int number) {
        return songs.get(number);
    }
}
