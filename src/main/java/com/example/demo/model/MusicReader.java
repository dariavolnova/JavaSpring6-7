package com.example.demo.model;

import com.example.demo.model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("musicRead")
public class MusicReader {

    private Music currentMusic;
    private Music previousMusic;
    private Music nextMusic;

    @Autowired
    public MusicReader(@Qualifier("firstMusic") Music currentMusic, @Qualifier("secondMusic") Music previousMusic,
                       @Qualifier("thirdMusic") Music nextMusic) {
        this.currentMusic = currentMusic;
        this.previousMusic = previousMusic;
        this.nextMusic = nextMusic;
    }
}