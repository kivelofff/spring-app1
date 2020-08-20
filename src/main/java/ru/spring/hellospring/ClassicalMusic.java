package ru.spring.hellospring;

public class ClassicalMusic implements Music{
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
    public String getSong() {
        return "Hungarian rapsody";
    }
}
