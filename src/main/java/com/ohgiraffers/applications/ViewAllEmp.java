package com.ohgiraffers.applications;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class ViewAllEmp {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        ResultSet rset = null;

        try {

            pstmt = con.prepareStatement("select * from employee");

            rset = pstmt.executeQuery();

            while (rset.next()) {
                System.out.println(rset.getString("emp_id") + ", " + rset.getString("emp_name") + ", "
                        + rset.getString("emp_no") + ", " + rset.getString("email") + ", " + rset.getString("phone") + ", "
                        + rset.getString("dept_code") + ", " + rset.getString("job_code") + ", " + rset.getString("sal_level") + ", "
                        + rset.getString("salary") + ", " + rset.getString("bonus") + ", " + rset.getString("manager_id") + ", "
                        + rset.getString("hire_date") + ", " + rset.getString("ent_date") + ", " + rset.getString("ent_yn") + ", ");


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }

    }

    }

