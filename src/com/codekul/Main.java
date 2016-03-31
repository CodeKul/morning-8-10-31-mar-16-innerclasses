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
public class Main {
    
    public static void main(String[] args) {
        
        OuterClass outerObjRef = new OuterClass();
        
        OuterClass.NonStaticInnerClass nonStaticRef = outerObjRef.new NonStaticInnerClass();
        
        Outsider outsider = new Outsider();
        outsider = new Outsider(outerObjRef);
        
        OuterClass.StaticInnerClass staticInnerRef = new OuterClass.StaticInnerClass();
    }
}
