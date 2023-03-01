package com.backend.sprng.repo;

import com.backend.sprng.domain.Usr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsrRepository extends JpaRepository<Usr, Long> {
}