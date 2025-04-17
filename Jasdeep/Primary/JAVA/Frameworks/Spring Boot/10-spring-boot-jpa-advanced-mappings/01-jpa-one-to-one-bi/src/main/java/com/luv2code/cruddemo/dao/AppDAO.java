package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.Instructor;
import com.luv2code.cruddemo.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById (int Id);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
