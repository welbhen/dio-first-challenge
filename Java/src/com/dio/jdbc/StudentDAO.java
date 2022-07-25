package com.dio.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	String urlConnection = "jdbc:mysql://localhost/dio";
	
	// 1 - Consulting
	public List<Student> list() {
		List<Student> students = new ArrayList<>();		
		try (Connection conn = DriverManager.getConnection(urlConnection, "root", "1322")) {
			//System.out.println("Successful connection to DB!");
			String sql = "SELECT * FROM student";
			PreparedStatement prst = conn.prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			
			while(rs.next()) {
				Student student = new Student(
						rs.getInt("id"),
						rs.getString("name"), 
						rs.getInt("age"), 
						rs.getString("state")
				);
				students.add(student);
			}
						
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("Error connecting to DB!!!");
		}
		return students;
	}
	
	// 2 - Consulting with filter
	public Student getByID(int id) {
		Student student = new Student();		
		try (Connection conn = DriverManager.getConnection(urlConnection, "root", "1322")) {
			String sql = "SELECT * FROM student WHERE id = ?";
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setInt(1, id);
			ResultSet rs = prst.executeQuery();
			
			if(rs.next()) {
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				student.setState(rs.getString("state"));
			}
						
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("Error connecting to DB!!!");
		}
		return student;
	}
	
	// 3 - Insertion
	public void create(Student student) {		
		try (Connection conn = DriverManager.getConnection(urlConnection, "root", "1322")) {
			String sql = "INSERT INTO student (name, age, state) VALUES (?, ?, ?)";
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setString(1, student.getName());
			prst.setInt(2, student.getAge());
			prst.setString(3, student.getState());
			
			int rowsAffected = prst.executeUpdate();
			
			System.out.println("Succesful insertion! " + rowsAffected + " affected row(s).");						
		} catch (SQLException e) {
			System.out.println("Failed insertion!");
			e.printStackTrace();
		}
	}
	
	// 4 - Delete
	public void delete(int id) {		
		try (Connection conn = DriverManager.getConnection(urlConnection, "root", "1322")) {
			String sql = "DELETE FROM student WHERE id = ?";
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setInt(1, id);
				
			int rowsAffected = prst.executeUpdate();
			
			System.out.println("Succesful deletion! " + rowsAffected + " affected row(s).");						
		} catch (SQLException e) {
			System.out.println("Failed deletion!");
			e.printStackTrace();
		}
	}
	
	// 5 - Update
	public void update(Student student) {		
		try (Connection conn = DriverManager.getConnection(urlConnection, "root", "1322")) {
			String sql = "UPDATE student SET name = ?, age = ?, state = ? WHERE id = ?";
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setString(1, student.getName());
			prst.setInt(2, student.getAge());
			prst.setString(3, student.getState());
			prst.setInt(4, student.getId());
			
			int rowsAffected = prst.executeUpdate();
			
			System.out.println("Succesful update! " + rowsAffected + " affected row(s).");						
		} catch (SQLException e) {
			System.out.println("Failed update!");
			e.printStackTrace();
		}
	}
}
