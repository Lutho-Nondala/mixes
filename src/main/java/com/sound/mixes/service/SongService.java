package com.sound.mixes.service;

import com.sound.mixes.domain.Song;
import com.sound.mixes.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService implements ISongService{
    @Autowired
    private SongRepository songRepository;

    @Override
    public Song create(Song song) {
        return this.songRepository.save(song);
    }

    @Override
    public Song read(Long aLong) {
        return this.songRepository.findById(aLong).get();
    }

    @Override
    public Song update(Song song) {
        return this.songRepository.save(song);
    }

    @Override
    public void delete(Long aLong) {
        this.songRepository.deleteById(aLong);
    }
}
