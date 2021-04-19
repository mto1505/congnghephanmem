/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.Utils;

import com.mycompany.applicationmvc.model.PersonModel;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MinhTo
 */
public class TableModelCustom {
    
   public static DefaultTableModel setTablePerson(List<PersonModel> listPerson, DefaultTableModel defaultTableModel)
            {   
                
                for (PersonModel personModel : listPerson) {
                    Vector<Object> obj=new Vector<>();
                    obj.add(personModel.getFirstname());
                     obj.add(personModel.getLastname());   
                     defaultTableModel.addRow(obj);
                }
                
                return defaultTableModel;
            
            }
{

}
            
}
