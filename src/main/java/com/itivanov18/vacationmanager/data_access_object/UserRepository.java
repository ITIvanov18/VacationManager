package com.itivanov18.vacationmanager.data_access_object;

import com.itivanov18.vacationmanager.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
