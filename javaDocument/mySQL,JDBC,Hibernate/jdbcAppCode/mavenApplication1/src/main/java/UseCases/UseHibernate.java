package UseCases;

//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityManager;
import javax.persistence.* ;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import Bean_Class.Student;

public class UseHibernate {

	public static void main(String[] args) {
		
	EntityManagerFactory emf = 	Persistence.createEntityManagerFactory("studentUnit") ;
	EntityManager em = emf.createEntityManager();
//	Student s1 = em.find(Student.class, 780) ;
//	Transaction.begin();
//	Student s2 = new Student(1,"rahul",777) ;
//	em.clear(); 
//	em.getTransaction().begin();
//	em.persist(s1);
//	s1.setMarks(1222);
//	em.merge(s1) ; // after making any modification in given object when object is not associated with DB then call merger() inside it pass the detached object ;
	
//	em.getTransaction().commit();
//	em.close();
//	System.out.println(student);
	Student s3 = new Student(7, "kamlai", "glore", 99, "abcs") ;
//	System.out.println(s3);
//	em.clear();
//	Student s = em.find(Student.class,10) ;
//	System.out.println(s);
	em.getTransaction().begin(); ;
    em.persist(s3);
//	em.merge(s3) ;
//	em.remove(s1) ;
    em.getTransaction().commit();
    em.close(); 
    System.out.println("Done ");
	}
}
