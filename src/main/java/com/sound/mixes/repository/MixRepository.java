package com.sound.mixes.repository;

import com.sound.mixes.domain.Mix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MixRepository extends JpaRepository<Mix, Long> {
}
