package com.sound.mixes.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Setter
@Getter
@Builder
@ToString
public class Song {
    @Id
    @GeneratedValue
    private long id;
    private String genre;
    private String album;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinTable(name = "SONG_ARTISTS",
            joinColumns = {
                    @JoinColumn(name = "song_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "artist_id")
            }
    )
    private Set<Artist> artist;

}
