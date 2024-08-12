package com.sound.mixes.service;

import com.sound.mixes.domain.Artist;
import com.sound.mixes.domain.Song;
import com.sound.mixes.repository.ArtistRepository;
import com.sound.mixes.repository.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
public class SongService implements ISongService{
    private static final Logger log = LoggerFactory.getLogger(SongService.class);
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private ArtistService artistService;

    @Override
    public Song addSong(Song song, Artist artist) {
        try {
            Artist artistCheck = this.artistService.findArtistByName(artist.getName());
            if (artistCheck == null){
                artistCheck = this.artistService.create(artist);
            }
            Set<Artist> artists = new HashSet<>();
            artists.add(artistCheck);
            song.setArtists(artists);
            return this.songRepository.save(song);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid operation");
        }
    }

    @Override
    public Song create(Song song) {
        return null;
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
