package com.shopme.admin.user;

import com.shopme.common.entity.Role;
import com.shopme.common.entity.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser() {
        Role roleAdmin = entityManager.find(Role.class, 5);
        User userChoi = new User("choi@codejava.net", "choi2020", "Choi", "DY");
        userChoi.addRole(roleAdmin);

        User savedUser = repo.save(userChoi);
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
    }

    @Test
    public void testCreateNewUserWithTwoRoles() {
        User userKim = new User("kim@codejave.net", "kim2020", "Kim", "KIM");
        Role roleEditor = new Role(3);
        Role roleAssistant = new Role(5);

        userKim.addRole(roleEditor);
        userKim.addRole(roleAssistant);

        User savedUser = repo.save(userKim);
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAllUsers() {
        Iterable<User> listUsers = repo.findAll();
        listUsers.forEach(user -> System.out.println(user));
    }

    @Test
    public void testGetUserByEmail() {
        String email = "abc@def.com";
        User user = repo.getUserByEmail(email);

        Assertions.assertThat(user).isNotNull();
    }
}
