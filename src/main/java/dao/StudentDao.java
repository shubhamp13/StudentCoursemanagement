package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	public List<Student>getStudents()
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select s from Student s");
		return query.getResultList();
	}
}
