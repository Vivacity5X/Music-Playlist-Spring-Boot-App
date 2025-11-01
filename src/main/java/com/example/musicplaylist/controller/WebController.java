package com.example.musicplaylist.controller;

import com.example.musicplaylist.model.Song;
import com.example.musicplaylist.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private SongService songService;

    // READ + SEARCH + show form
    @GetMapping("/songs-list")
    public String viewSongs(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        List<Song> songs = songService.searchSongs(keyword);
        model.addAttribute("songs", songs);
        model.addAttribute("keyword", keyword == null ? "" : keyword);
        model.addAttribute("song", new Song());
        return "songs";
    }

    // CREATE
    @PostMapping("/songs/add")
    public String addSong(@ModelAttribute("song") Song song) {
        songService.saveSong(song);
        return "redirect:/songs-list";
    }

    // EDIT page
    @GetMapping("/songs/edit/{id}")
    public String editSong(@PathVariable("id") int id, Model model) {
        Song song = songService.getSongById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid song Id:" + id));
        model.addAttribute("song", song);
        model.addAttribute("songs", songService.getAllSongs());
        return "songs-edit";
    }

    // UPDATE
    @PostMapping("/songs/update/{id}")
    public String updateSong(@PathVariable("id") int id, @ModelAttribute("song") Song song) {
        song.setId(id);
        songService.saveSong(song);
        return "redirect:/songs-list";
    }

    // DELETE
    @GetMapping("/songs/delete/{id}")
    public String deleteSong(@PathVariable("id") int id) {
        songService.deleteSong(id);
        return "redirect:/songs-list";
    }
}
