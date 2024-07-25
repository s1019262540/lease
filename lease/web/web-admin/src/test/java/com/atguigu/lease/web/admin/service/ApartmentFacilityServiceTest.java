package com.atguigu.lease.web.admin.service;

import com.atguigu.lease.model.entity.ApartmentFacility;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ApartmentFacilityServiceTest {
    @Autowired
    private ApartmentFacilityService apartmentFacilityService;

    @Test
    public void apartmentFacilityTest(){

        List<ApartmentFacility> list = apartmentFacilityService.list();
        list.forEach(System.out::println);
    }
}