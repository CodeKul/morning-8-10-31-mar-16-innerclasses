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
public class OuterClass implements Iterceptor{

    public void whoIsOuterClass(){
        
        class LocalInner {
            
        }
        
        LocalInner localInner = new LocalInner();
    }

    public OuterClass() {
        // default constructor for outer class
    }

    @Override
    public void intercept() {
        
        this.whoIsOuterClass();
    }

    public class NonStaticInnerClass {

        private int innerInt = 100;
        
        public NonStaticInnerClass() {
            
            OuterClass.this.outerInt = 100;
            
            interceptAnyting(new AstronomicalInterceptor());
            
            interceptAnyting(new MyInterceptor());
            
            interceptAnyting(new OuterClass());
            
            interceptAnyting(OuterClass.this);
            
            interceptAnyting(new Iterceptor() {
                @Override
                public void intercept() {
                }
            });
            
            interceptAnyting(() -> {
            
            });
            
        }
    }

    public static class StaticInnerClass {

        public StaticInnerClass() {
            
        }
    }
    
    public void interceptAnyting(Iterceptor interceptor){
        
        interceptor.intercept();
    }
    
    private int outerInt = 10;
    
    private class MyInterceptor implements Iterceptor{

        @Override
        public void intercept() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
