package ru.spring.hellospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music anotherMusic = context.getBean("classicalMusic", Music.class);
        //System.out.println(anotherMusic.getSong());

        Computer computer = (Computer) context.getBean("computer");
        System.out.println(computer);
        //ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);
        //DI
 /*       MusicPlayer firstMusicPlayer= context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer= context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparsion = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparsion);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.playMusic();
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());*/
        context.close();
    }
}
