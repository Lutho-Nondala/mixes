package com.sound.mixes.controller;

import com.sound.mixes.domain.Artist;
import com.sound.mixes.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artist/")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @PostMapping("create")
    public ResponseEntity<Artist> create(@RequestBody Artist artist){
        return ResponseEntity.ok(this.artistService.create(artist));
    }

    @GetMapping("read/{id}")
    public ResponseEntity<Artist> read(@PathVariable long id){
        return ResponseEntity.ok(this.artistService.read(id));
    }

    @PutMapping("update")
    public ResponseEntity<Artist> update(@RequestBody Artist artist){
        return ResponseEntity.ok(this.artistService.update(artist));
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id){
        this.artistService.delete(id);
    }

}
