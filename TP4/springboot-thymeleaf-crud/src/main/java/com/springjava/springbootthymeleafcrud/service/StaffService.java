package com.springjava.springbootthymeleafcrud.service;

import com.springjava.springbootthymeleafcrud.entity.Staff;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}

