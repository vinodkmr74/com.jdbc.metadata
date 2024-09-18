package jdbc.metadata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import jdbc.metadata.stusent.Student22;

public class Student2 {

	public static void main(String[] args) {
		
		
		
//		Student22 s=new Student22(1,"mahadev","dev");
//	    Student22 s2=new Student22(2,"ram","dev");
//	    Student22 s3=new Student22(3,"vikash","mmmm");
//	    Student22 s4=new Student22(4,"vasu","dev");
	    Student22 s5=new Student22("vikash","mca");

	    

	   // 1.consizness
        //SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf=meta.buildSessionFactory();
	
	//2.consizness
		SessionFactory sf=new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).getMetadataBuilder().build().buildSessionFactory();    
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		//session.save(s);
		//session.save(s2);
		//session.save(s3);
		//session.save(s4);
		session.save(s5);
		tx.commit();	
		System.out.println("dene........");
	}

}
