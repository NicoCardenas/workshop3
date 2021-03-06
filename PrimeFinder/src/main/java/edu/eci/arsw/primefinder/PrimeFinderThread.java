package edu.eci.arsw.primefinder;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 public class PrimeFinderThread extends Thread {

    int a, b;
    Object lock = new Object();

    public Object getLock() {
        return lock;
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }
    
    private List<Integer> primes;
    //
    private boolean sleep = false;


     public PrimeFinderThread(int a, int b) {
        super();
        this.primes = new LinkedList<>();
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {        
        for (int i = a; i < b; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
            if (sleep){
                synchronized(lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e){
                        Logger.getLogger(PrimeFinderThread.class.getName()).log(Level.SEVERE, null, e);
                    }
                }
                setSleep(false);
            }
        }
    }
	
    boolean isPrime(int n) {
        boolean ans;
        if (n > 2) { 
            ans = n%2 != 0;
            for(int i = 3;ans && i*i <= n; i+=2 ) {
                ans = n % i != 0;
            }
        } else {
            ans = n == 2;
        }
        return ans;
    }

    public List<Integer> getPrimes() {
	return primes;
    }
	
    public boolean isSleep() {
        return sleep;
    }
        
    public void setSleep(boolean duerma){
        this.sleep = duerma;
    }
}
