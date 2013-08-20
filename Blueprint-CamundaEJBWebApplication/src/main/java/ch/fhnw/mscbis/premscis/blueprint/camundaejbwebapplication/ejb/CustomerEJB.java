/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.fhnw.mscbis.premscis.blueprint.camundaejbwebapplication.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ch.fhnw.mscbis.premscis.blueprint.camundaejbwebapplication.domain.Customer;

/**
 *
 * @author andreas.martin
 */
@Stateless
@Named
public class CustomerEJB {
    
    @PersistenceContext(unitName = "primary")
    private EntityManager em;

    public Customer findCustomerById(Long id) {
    	return em.find(Customer.class, id);
    }

    public Customer createCustomer(Customer customer) {
        em.persist(customer);
        return customer;
    }

    public void deleteCustomer(Customer customer) {
        em.remove(em.merge(customer));
    }

    public Customer updateCustomer(Customer customer) {
        return em.merge(customer);
    }

    public List<Customer> findCustomers() {
        TypedQuery<Customer> query = em.createNamedQuery("findAll", Customer.class);
        return query.getResultList();
    }
    
}
