package com.greatlearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
