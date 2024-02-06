package com.noseblind.repository;

import com.noseblind.model.Perfume;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        String sql = "INSERT INTO perfume (name, price, description)" +
                "VALUES(?, ?, ?)";
        jdbcTemplate.update(sql,perfume.getName(),perfume.getPrice(),perfume.getDescription());
    }

    public Perfume getPerfumeByName(String name) {
        String sql = "SELECT id FROM perfume WHERE name LIKE '%?%'";
        return (Perfume) jdbcTemplate.queryForObject(sql, new Object[] {name}, new BeanPropertyRowMapper(Perfume.class));
    }

    public Perfume findPerfumeById(int id) {
        String sql = "SELECT name FROM perfume WHERE id = ?";
        return (Perfume) jdbcTemplate.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper(Perfume.class));
    }

    public List<Perfume> getAllPerfumes() {
        List<Perfume> perfumes = new ArrayList<>();
        return perfumes;
    }

    public void deletePerfume(Perfume perfume) {
        String sql = "DELETE * FROM perfume WHERE id = ?";
        jdbcTemplate.update(sql,perfume.getId());
    }
}
