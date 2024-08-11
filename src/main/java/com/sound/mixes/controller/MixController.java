package com.sound.mixes.controller;

import com.sound.mixes.domain.Mix;
import com.sound.mixes.service.MixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mix/")
public class MixController {
    @Autowired
    private MixService mixService;

    @PostMapping("create")
    public ResponseEntity<Mix> create(@RequestBody Mix mix){
        return ResponseEntity.ok(this.mixService.create(mix));
    }

    @GetMapping("read/{id}")
    public ResponseEntity<Mix> read(@PathVariable long id){
        return ResponseEntity.ok(this.mixService.read(id));
    }

    @PutMapping("update")
    public ResponseEntity<Mix> update(@RequestBody Mix mix){
        return ResponseEntity.ok(this.mixService.update(mix));
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id){
        this.mixService.delete(id);
    }
}
