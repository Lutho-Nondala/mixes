package com.sound.mixes.service;

import com.sound.mixes.domain.Artist;
import com.sound.mixes.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService implements IArtistService{
    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public Artist create(Artist artist) {
        return this.artistRepository.save(artist);
    }

    @Override
    public Artist read(Long aLong) {
        return this.artistRepository.findById(aLong).get();
    }

    @Override
    public Artist update(Artist artist) {
        return this.artistRepository.save(artist);
    }

    @Override
    public void delete(Long aLong) {
        this.artistRepository.deleteById(aLong);
    }
}
