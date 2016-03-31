/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul;

/**
 *
 * @author aniruddha
 */
public class Outsider {

    private OuterClass outerClass;
    
    public Outsider() {
        
        outerClass = new OuterClass();
    }
    
    public Outsider(OuterClass out){
        
        outerClass = out;
    }
}
