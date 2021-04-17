/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.security;

/**
 *
 * @author ASUS
 */
public class NewClass {
    public static void main(String args[]) {
        try{
            String s = "5.6";
        Integer.parseInt(s);
        int i=0,y=2;
        y = y/i;
        }
        catch (NumberFormatException e) {
            System.out.print("shiiit ");
        }
        catch (RuntimeException e) {
            System.out.print("shiiit 1");
            
        }
    }
}
