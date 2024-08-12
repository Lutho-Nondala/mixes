package com.sound.mixes.service;

import com.sound.mixes.domain.Artist;
import com.sound.mixes.domain.Song;

public interface ISongService extends IService<Song, Long>{
    Song addSong(Song song, Artist artist);
}
