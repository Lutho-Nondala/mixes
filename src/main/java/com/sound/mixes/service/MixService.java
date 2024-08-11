package com.sound.mixes.service;

import com.sound.mixes.domain.Mix;
import com.sound.mixes.repository.MixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MixService implements IMixService{
    @Autowired
    private MixRepository mixRepository;

    @Override
    public Mix create(Mix mix) {
        return this.mixRepository.save(mix);
    }

    @Override
    public Mix read(Long aLong) {
        return this.mixRepository.findById(aLong).get();
    }

    @Override
    public Mix update(Mix mix) {
        return this.mixRepository.save(mix);
    }

    @Override
    public void delete(Long aLong) {
        this.mixRepository.deleteById(aLong);
    }
}
