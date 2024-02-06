package com.noseblind.service;

import com.noseblind.model.Perfume;
import com.noseblind.repository.PerfumeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfumeService {
    private final PerfumeRepository perfumeRepository;

    public PerfumeService(PerfumeRepository perfumeRepository) {
        this.perfumeRepository = perfumeRepository;
    }

    public void addPerfume(Perfume perfume) {
        perfumeRepository.addPerfume(perfume);
    }

    public List<Perfume> getAllPerfumes() {
        return perfumeRepository.getAllPerfumes();
    }

    public Perfume getPerfumeByName(String name) {
        return perfumeRepository.getPerfumeByName(name);
    }

    public void deletePerfume(Perfume perfume) {
        perfumeRepository.deletePerfume(perfume);
    }
}