package ch.fhnw.mscbis.premscis.blueprint.jpajavaapplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ch.fhnw.mscbis.premscis.blueprint.jpajavaapplication.domain.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book();
        book.setTitle("Java EE");
        book.setPrice(12.5F);
        book.setDescription("Java EE 6");
        book.setIsbn("1-4564-777-8");
        book.setNbOfPage(254);
        book.setIllustrations(Boolean.FALSE);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "primary");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(book);
        tx.commit();
        em.close();
        emf.close();
    }
}
