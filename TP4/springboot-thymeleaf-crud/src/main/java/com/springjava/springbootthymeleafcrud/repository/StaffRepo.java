package com.springjava.springbootthymeleafcrud.repository;

import com.springjava.springbootthymeleafcrud.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff,Integer> {

}
