package com.abs.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abs.attendance.model.Courses;

/**
 * Repository class for Courses.
 *
 */
public interface CourseRepository extends JpaRepository<Courses, Long> {

}
