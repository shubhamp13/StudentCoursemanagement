package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import dto.Student;

public class StudentDao 
{
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("shubham").createEntityManager();
	}
	public void saveStudent(Student student)
	{
		EntityManager entityManager=getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
	}
	public Student getStudent(String email)
	{

		EntityManager entityManager=getEntityManager();
		Student student=entityManager.find(Student.class,email);
		return student;
	}
}
