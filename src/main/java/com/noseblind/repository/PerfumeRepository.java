package com.noseblind.repository;

import com.noseblind.model.Perfume;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class PerfumeRepository {
    private final JdbcTemplate jdbcTemplate;

    public PerfumeRepository (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addPerfume(Perfume perfume) {
    }

    public Perfume getPerfumeByName(String name) {
        return new Perfume("",null,"Text");
    }

    public List<Perfume> getAllPerfumes() {
        List<Perfume> perfumes = new ArrayList<>();
        return perfumes;
    }

    public void deletePerfume() {
    }
}
