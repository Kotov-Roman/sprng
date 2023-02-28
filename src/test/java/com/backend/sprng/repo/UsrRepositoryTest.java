package com.backend.sprng.repo;

import com.backend.sprng.SprngApplicationTests;
import com.backend.sprng.domain.Usr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class UsrRepositoryTest extends SprngApplicationTests {

    @Autowired
    private UsrRepository usrRepository;

    @Test
    public void save_NameIsGiven_UserIsSavedWithName() {
        String name = "roman";
        System.out.println("test from child");
        Usr user = Usr.builder()
                .name(name)
                .build();
        usrRepository.save(user);
        Usr userFromDb = usrRepository.findById(user.getId())
                .orElse(null);

        assertThat(userFromDb).isNotNull();
        assertThat(userFromDb.getName()).isEqualTo(name);
    }
}
