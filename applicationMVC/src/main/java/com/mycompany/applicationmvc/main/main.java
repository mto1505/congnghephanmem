/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.main;

import com.mycompany.applicationmvc.controller.ControllerPerson;
import com.mycompany.applicationmvc.model.PersonModel;
import com.mycompany.applicationmvc.view.MenuFrame;

/**
 *
 * @author MinhTo
 */
public class main {
    public static void main(String[] args) {
        PersonModel model=new PersonModel("Bui", "Minh to");
        MenuFrame view =new MenuFrame();
//        ControllerPerson c=new ControllerPerson(view, model);
//        c.initController();
    }
}
