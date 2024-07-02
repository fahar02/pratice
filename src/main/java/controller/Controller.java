package controller;

import dao.Aadhardao;
import dao.Persondao;
import pratice_fahar_hibernate_bidirection_onetoone.dto.Aadhar;
import pratice_fahar_hibernate_bidirection_onetoone.dto.Person;

public class Controller {
	public static void main(String args[])
	{
		/*
		Person person=new Person();
		person.setPersonId(1);
		person.setPersonName("fahar");
		person.setPersonAddress("kolhapur");
		Persondao persondao=new Persondao();
		persondao.savePerson(person);
		
		Aadhar aadhar=new Aadhar();
		aadhar.setAadharId(100);
		aadhar.setAadharName("fahar jamadar");
		aadhar.setAge(23);
		Aadhardao aadhardao=new Aadhardao();
		aadhardao.saveAadhar(1, aadhar);
		
		Aadhardao aadhardao=new Aadhardao();
		aadhardao.deleteAadhar(100);
		/
		Person person=new Person();
		person.setPersonId(1);
		person.setPersonName("fahar");
		person.setPersonAddress("kolhapur");
		Persondao persondao=new Persondao();
		persondao.savePerson(person);
		
		Aadhar aadhar=new Aadhar();
		aadhar.setAadharId(100);
		aadhar.setAadharName("fahar jamadar");
		aadhar.setAge(23);
		Aadhardao aadhardao=new Aadhardao();
		aadhardao.saveAadhar(1, aadhar);*/
		Persondao persondao=new Persondao();
		persondao.deletePerson(1);
		
	}

}
