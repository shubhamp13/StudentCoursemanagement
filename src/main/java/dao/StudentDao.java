package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Student;

public class StudentDao 
{
	private EntityManager entityManager=Persistence.createEntityManagerFactory("shubham").createEntityManager();
	public void saveStudent(Student student)
	{
		 
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
	}
	public Student getStudent(String email)
	{

		 
		Student student=entityManager.find(Student.class,email);
		return student;
	}
	public List<Student>getStudents()
	{
	 
		Query query=entityManager.createQuery("select s from Student s");
		return query.getResultList();
	}
	public void updateStudent(Student student)
	{
	 
		entityManager.getTransaction().begin();
		entityManager.merge(student);
		entityManager.getTransaction().commit();
	}
	public void deleteStudent(Student student)
	{
		entityManager.getTransaction().begin();
		entityManager.remove(student);
		entityManager.getTransaction().commit();
	}
}
