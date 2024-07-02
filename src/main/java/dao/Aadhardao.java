package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import pratice_fahar_hibernate_bidirection_onetoone.dto.Aadhar;
import pratice_fahar_hibernate_bidirection_onetoone.dto.Person;

public class Aadhardao {
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("onetoonebi1").createEntityManager();
	}
public void saveAadhar(int personId,Aadhar aadhar)
{
	EntityManager entityManager=getEntityManager();
	Person person=entityManager.find(Person.class,personId);
	if(person!=null)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		aadhar.setPerson(person);
		person.setAadhar(aadhar);
		entityManager.persist(aadhar);
		entityTransaction.commit();
	}
	else {
		System.out.println("invalid person");
	}
}
public void updateAadhar(int aadharId,Aadhar aadhar)
{
	EntityManager entityManager=getEntityManager();
	Aadhar aadhardb=entityManager.find(Aadhar.class,aadharId);
	if(aadhardb!=null)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		aadhar.setAadharId(aadharId);
		aadhar.setPerson(aadhardb.getPerson());
		entityManager.merge(aadhar);
		entityTransaction.commit();
		
	}
	else 
	{
		System.out.println("invalid aadhar id");
	}
}
public void deleteAadhar(int aadharId)
{
	EntityManager entityManager=getEntityManager();
	Aadhar aadhar=entityManager.find(Aadhar.class,aadharId);
	if(aadhar!=null)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(aadhar);
		entityTransaction.commit();
		
	}
	else 
	{
		System.out.println("invalid aadhar id");
	}
}
public void findAadhar(int aadharId)
{
	EntityManager entityManager=getEntityManager();
	Aadhar aadhar=entityManager.find(Aadhar.class,aadharId);
	if(aadhar!=null)
	{
		System.out.println(aadhar);
		
	}
	else 
	{
		System.out.println("invalid aadhar id");
	}
}
}
