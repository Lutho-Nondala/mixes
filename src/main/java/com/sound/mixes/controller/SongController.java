package com.sound.mixes.controller;

import com.sound.mixes.domain.Artist;
import com.sound.mixes.domain.Song;
import com.sound.mixes.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/song/")
public class SongController {
    @Autowired
    private SongService songService;

    @PostMapping("create")
    public ResponseEntity<Song> create(@RequestPart("song") Song song, @RequestPart("artist")Artist artist){
        return ResponseEntity.ok(this.songService.addSong(song, artist));
    }

    @GetMapping("read/{id}")
    public ResponseEntity<Song> read(@PathVariable long id){
        return ResponseEntity.ok(this.songService.read(id));
    }

    @PutMapping("update")
    public ResponseEntity<Song> update(@RequestBody Song song){
        return ResponseEntity.ok(this.songService.update(song));
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id){
        this.songService.delete(id);
    }
}
