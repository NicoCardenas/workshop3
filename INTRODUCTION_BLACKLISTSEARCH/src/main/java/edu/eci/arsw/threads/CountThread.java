/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread implements Runnable{
    
    private String name;
    private int a,b;
    private Thread thread;
    
    public CountThread(String name, int intA, int intB) {
        setName(name);
        this.a = intA;
        this.b = intB;
        thread = new Thread(this, this.name);
    }    
   
    @Override
    public void run() {               
        for (int i = a; i < b+1; i++) {
            System.out.println("Is running --> " + name + " Value: " + i);
        }        
    }    
    
    public void start(){
        this.thread.start();        
    }

    public String getName() {
        return thread.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public boolean isAlive(){
        return thread.isAlive();
    }
    
}
