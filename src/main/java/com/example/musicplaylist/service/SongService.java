package com.example.musicplaylist.service;

import com.example.musicplaylist.model.Song;
import com.example.musicplaylist.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    // Create or Update
    public Song saveSong(Song song) {
        if (song.getTitle() == null || song.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Song title cannot be empty");
        }
        return songRepository.save(song);
    }

    // Read all songs
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    // Read by ID
    public Optional<Song> getSongById(int id) {
        return songRepository.findById(id);
    }

    // Delete
    public void deleteSong(int id) {
        songRepository.deleteById(id);
    }

    // Search
    public List<Song> searchSongs(String keyword) {
        if (keyword == null || keyword.isBlank()) {
            return songRepository.findAll();
        }
        return songRepository.searchByKeyword(keyword);
    }
}
