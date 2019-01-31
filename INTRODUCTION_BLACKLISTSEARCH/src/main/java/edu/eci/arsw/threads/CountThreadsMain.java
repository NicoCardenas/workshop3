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
public class CountThreadsMain {
    
    public static void main(String a[]) throws InterruptedException{
        CountThread thread1 = new CountThread("1", 0, 99);
        CountThread thread2 = new CountThread("2", 100, 199);
        CountThread thread3 = new CountThread("3", 200, 299);

        /*thread1.start();
        thread2.start();
        thread3.start();*/
        
        //Thread.sleep(60000);
        
        thread1.run();
        thread2.run();
        thread3.run();
        
        //System.out.println("is alive "+ thread1.isAlive());
    }
    
}
