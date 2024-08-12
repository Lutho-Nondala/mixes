package com.sound.mixes.service;

import com.sound.mixes.domain.Artist;

import java.util.List;
import java.util.Set;

public interface IArtistService extends IService<Artist, Long>{
    Artist findArtistByName(String name);
    List<Artist> getAll();
}
