package com.ohgiraffers.applications;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class EditEmp {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        int result = 0;

        Properties prop = new Properties();

        if(result > 0) {
            System.out.println("직원 수정 성공!!!");
        }
        else {
            System.out.println("직원 수정 실패!!!");
        }

    }
