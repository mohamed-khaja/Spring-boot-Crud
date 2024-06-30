package com.intern.crud.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.intern.crud.model.Students;

public class RowMapperTemplate implements RowMapper<Students> {

    Students students = new Students();

    @Override
    public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
        Students students = new Students();
        students.setRollNum(rs.getInt("roll_num"));
        students.setName(rs.getString("student_name"));
        students.setGrade(rs.getFloat("grade"));
        return students;
    }

}
