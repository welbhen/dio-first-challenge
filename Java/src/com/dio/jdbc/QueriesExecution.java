package com.dio.jdbc;

import java.util.List;

public class QueriesExecution {
	
	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		
		// ---------------- 1 - Consulting ----------------
		List<Student> students = studentDAO.list();
		students.stream().forEach(System.out::println);
		// ------------------------------------------------
				
		
		// ---------- 2 - Consulting with filter ----------
		/*
		System.out.println("\n\n");
		Student studentToQuery = studentDAO.getByID(20);
		System.out.println(studentToQuery);
		*/
		// ------------------------------------------------

		
		// --------------- 3 - Insertion ------------------
		/*
		System.out.println("\n\n");
		Student studentToInsertion = new Student(
				"Matheus",
				43,
				"SP"
		);
		studentDAO.create(studentToInsertion);
		*/
		// ------------------------------------------------
		
		
		// ----------------- 4 - Deletion -----------------
		/*
		System.out.println("\n\n");
		int studentToDelete = 6;
		studentDAO.delete(studentToDelete);
		List<Student> studentsAfterDeletion = studentDAO.list();
		studentsAfterDeletion.stream().forEach(System.out::println);
		*/
		// ------------------------------------------------
		
		// ------------------ 5 - Update- -----------------
		/*
		System.out.println("\n\n");
		Student studentToUpdate = studentDAO.getByID(3);
		studentToUpdate.setName("Joaquim");
		studentToUpdate.setAge(18);
		studentToUpdate.setState("RS");
		studentDAO.update(studentToUpdate);		
		List<Student> studentsAfterUpdate = studentDAO.list();
		studentsAfterUpdate.stream().forEach(System.out::println);
		*/
		// ------------------------------------------------
	}
}
