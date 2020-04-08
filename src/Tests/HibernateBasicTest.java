package Tests;

import javax.persistence.Persistence;

import Domain.Journalist;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import static org.junit.jupiter.api.Assertions.*;


public class HibernateBasicTest {

    @Test
    void sessionOk() {
        EntityManagerFactory eM = Persistence.createEntityManagerFactory("mySQL-persistence-unit");
    }

    @Test
    public void readJournalistByIdTest(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySQL-persistence-unit");
        EntityManager em = emf.createEntityManager();
        Journalist j = em.find(Journalist.class, 6);
        assertNotNull(j);
        em.close();
        System.out.println(j);
    }

    @Test
    public void createJournalist(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySQL-persistence-unit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Journalist r = new Journalist();
        r.setName("name");
        em.persist(r);
        em.getTransaction().commit();
        em.close();
        System.out.println(r.getIdJournalist());
        EntityManager em2 = emf.createEntityManager(); // new transaction
        Journalist r2 = em2.find(Journalist.class,r.getIdJournalist());
        System.out.println(r2);
        em2.close();
    }

}
