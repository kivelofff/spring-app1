package ru.spring.hellospring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Requiem");
        songs.add("Second Symphony");
        songs.add("Santa Lucia");
    }

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("do my init");
    }

    public void doMyDestroy() {
        System.out.println("do my dist");
    }
    @Override
    public String getSong(int number) {
        return songs.get(number);
    }
}
