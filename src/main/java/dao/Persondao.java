package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import pratice_fahar_hibernate_bidirection_onetoone.dto.Aadhar;
import pratice_fahar_hibernate_bidirection_onetoone.dto.Person;

public class Persondao 
{
public EntityManager getEntityManager()
{
	return Persistence.createEntityManagerFactory("onetoonebi1").createEntityManager();
}
public void savePerson(Person person)
{
	EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
}
public void updatePerson(int personId)
{
	EntityManager entityManager=getEntityManager();
	Person person=entityManager.find(Person.class,personId);
	if(person!=null)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		person.setPersonId(personId);
		person.setAadhar(person.getAadhar());
		entityManager.merge(person);
		entityTransaction.commit();
		
	}
	else {
		System.out.println("invalid person id");
	}
}
public void deletePerson(int personId)
{
	EntityManager entityManager=getEntityManager();
	Person person=entityManager.find(Person.class,personId);
	if(person!=null)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Aadhar aadhar=person.getAadhar();
		aadhar.setPerson(null);
		entityManager.remove(person);
		entityTransaction.commit();
	}
	else {
		System.out.println("invalid person id");
	}
}
public void findPerson(int personId)
{
	EntityManager entityManager=getEntityManager();
	Person person=entityManager.find(Person.class,personId);
	if(person!=null)
	{
		System.out.println(person);
	}
	else {
		System.out.println("invalid person id");
	}
}

}
