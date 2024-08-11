package com.sound.mixes.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Setter
@Builder
@Getter
@ToString
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

}
