package com.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        lesson06
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        
//        lesson01
//        intro

//        lesson02
//        TestBean testBean = context.getBean("testBean", TestBean.class); // id bean, class Bean        
//        System.out.println(testBean.getName());

//        lesson03
//        from eclipse varsion

//        lesson04
//        Music music = context.getBean("musicBean", Music.class);
//        
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();

//        lesson05
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
        
        context.close();    // !!!
    }
}