package com.example.musicplaylist.controller;

import com.example.musicplaylist.model.Song;
import com.example.musicplaylist.service.SongService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class ApiSongController {

    private final SongService songService;

    public ApiSongController(SongService songService) {
        this.songService = songService;
    }

    @PostMapping
    public ResponseEntity<Song> add(@RequestBody Song song) {
        return ResponseEntity.ok(songService.saveSong(song));
    }

    @GetMapping
    public List<Song> all() {
        return songService.getAllSongs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Song> get(@PathVariable int id) {
        return songService.getSongById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Song> update(@PathVariable int id, @RequestBody Song song) {
        song.setId(id);
        return ResponseEntity.ok(songService.saveSong(song));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        songService.deleteSong(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public List<Song> search(@RequestParam(required = false) String keyword) {
        return songService.searchSongs(keyword);
    }
}
