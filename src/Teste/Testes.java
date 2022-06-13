/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import entidade.Estado;
import persistencia.HibernateUtil;

/**
 *
 * @author Angelo
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estado est = new Estado();
        est.setNome_estado("Santa catarina");
        est.setSigla_estado("SC");

        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().merge(est);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();
    }

}
