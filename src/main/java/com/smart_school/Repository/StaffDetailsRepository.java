package com.smart_school.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart_school.entity.StaffDetails;

public interface StaffDetailsRepository extends JpaRepository<StaffDetails, Long> {
}
