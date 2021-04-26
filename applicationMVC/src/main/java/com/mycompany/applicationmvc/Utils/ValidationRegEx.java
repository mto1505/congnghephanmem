/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MinhTo
 */
public class ValidationRegEx {

    private static final String SDTRegex = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
    private static final String CMNDRegex = "(\\d{12}|\\d{9})*";

    public static boolean validationSDT(String sdt) {
        Pattern patter = Pattern.compile(SDTRegex);
        Matcher match = patter.matcher(sdt);
        return match.matches();
    }

    public static boolean validationCMND(String cmnd) {
        Pattern patter = Pattern.compile(CMNDRegex);
        Matcher match = patter.matcher(cmnd);
        return match.matches();
    }
}
