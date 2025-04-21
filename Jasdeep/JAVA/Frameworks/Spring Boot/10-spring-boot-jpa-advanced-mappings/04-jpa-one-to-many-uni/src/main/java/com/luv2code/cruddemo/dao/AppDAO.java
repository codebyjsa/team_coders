package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.Course;
import com.luv2code.cruddemo.Instructor;

import java.util.List;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById (int Id);

    List<Course> findCourseByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch (int theId);

    void update (Instructor tempInstructor);

    void update(Course tempCourse);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);

    void save(Course theCourse);

    Course findCourseAndReviewsByCourseId(int theId);
}
