package com.eduit.repo;

import com.eduit.model.Subs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubsRepo extends JpaRepository<Subs, Long> {
    List<Subs> findAllByNameContainingAndSpecContaining(String name, String spec);
}
