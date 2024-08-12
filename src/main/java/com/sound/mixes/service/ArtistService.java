package com.sound.mixes.service;

import com.sound.mixes.domain.Artist;
import com.sound.mixes.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

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

    @Override
    public Artist findArtistByName(String name) {
        List<Artist> artists = this.getAll();

        for (Artist a: artists){
            if (a.getName().equals(name)){
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Artist> getAll() {
        return this.artistRepository.findAll();
    }
}
