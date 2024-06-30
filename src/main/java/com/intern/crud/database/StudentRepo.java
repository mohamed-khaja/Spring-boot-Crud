package com.intern.crud.database;

import org.springframework.stereotype.Repository;

import com.intern.crud.model.Students;

import java.util.List;

import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class StudentRepo {

    @Autowired
    private JdbcTemplate jdbc;
    Logger logger = LogManager.getLogger(StudentRepo.class);

    public void save(Students student) {
        String sql = "INSERT INTO students (roll_num, student_name, grade) VALUES (?,?,?);";
        int rows = jdbc.update(sql, student.getRollNum(), student.getName(), student.getGrade());
        System.out.println(rows + " added");
        logger.info(rows+" Added");
    }
    
    public List<Students> findAll() {
        String sql = "SELECT * FROM students;";
        return jdbc.query(sql, new RowMapperTemplate());
    }
    
    public void update(Students student) {
        String sql = "UPDATE students SET student_name= ?, grade = ? WHERE roll_num = ?;";
        int rows = jdbc.update(sql, student.getName(), student.getGrade(), student.getRollNum()); 
        logger.info(rows +" Updated");
    }

    public void delete(int rollNum) {
        String sql = "DELETE FROM students WHERE roll_num=?;";
        jdbc.update(sql, rollNum);
        logger.warn("The record of Student - Roll Number: "+rollNum+" is Deleted!");
    }

}
