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
public class Mix {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String collection;
    private String genre;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinTable(name = "MIX_SONGS",
            joinColumns = {
                    @JoinColumn(name = "mix_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "song_id")
            }
    )
    private Set<Song> songs;
}
