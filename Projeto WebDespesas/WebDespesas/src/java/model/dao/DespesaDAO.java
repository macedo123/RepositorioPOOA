/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.Query;
import model.Despesa;

/**
 *
 * @author aluno
 */
public class DespesaDAO extends DAO{
    public List<Despesa> findAll(){
        open();
        try{
            Query q = em.createNamedQuery("Despesa.findAll");
            return q.getResultList();
        }finally{
            close();
        }
        
        
    }
}
