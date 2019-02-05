/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author ncardenas
 */
public class ThreadClass implements Runnable{
    
    private Thread thread;
    private String name, ip;
    private int start, end;
    private final static AtomicInteger checkedCount = new AtomicInteger(0);
    private final static AtomicInteger blackCount = new AtomicInteger(0);
    private List<Integer> res;
    LinkedList<Integer> blackListOcurrences;
    HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();

    public ThreadClass(String name, int start, int end, String ip, LinkedList<Integer> blackListOcurrences) {
        thread = new Thread(this);
        this.name = name;
        this.start = start;
        this.end = end;
        this.ip = ip;
        this.blackListOcurrences = blackListOcurrences;
    }        

    @Override
    public void run() {
        
        for (int i = start; start < end; i++){
            checkedCount.addAndGet(1);
            if (skds.isInBlackListServer(i, ip)){
                blackListOcurrences.add(i);
                blackCount.addAndGet(1);
            }
        }
        
    }
    
    public void start(){
        this.thread.start();
    }
    
    public int ask(){        
        return res.size();
    }
    
    public static AtomicInteger getCheck(){
        return checkedCount;
    }
    
    public static AtomicInteger getBlack(){
        return blackCount;
    }
}
