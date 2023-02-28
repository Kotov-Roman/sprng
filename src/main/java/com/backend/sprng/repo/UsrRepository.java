package com.backend.sprng.repo;

import com.backend.sprng.domain.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrRepository extends JpaRepository<Usr, Long> {
}