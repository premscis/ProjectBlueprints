/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.fhnw.mscbis.premscis.blueprint.camundacdiwebapplication.service;


import javax.ejb.Stateless;
import javax.inject.Named;


/**
 *
 * @author andreas.martin
 */
@Named
@Stateless
public class ProcessRequestSessionBean {
  
    public boolean processRequest(String customerId, int amount)
    {
        System.out.println("ProcessRequestSessionBean...processRequest() called! and customerId: " + customerId + " and amount: " + Integer.toString(amount));
        return true;
    }

}
