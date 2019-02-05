/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import java.util.List;

/**
 *
 * @author ncardenas
 */
public class ThreadClass implements Runnable{
    
    private Thread thread;
    private String name;
    private int start, end;
    private List<Integer> res;
    HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();

    public ThreadClass(String name, int start, int end) {
        thread = new Thread(this);
        this.name = name;
        this.start = start;
        this.end = end;
    }        

    @Override
    public void run() {
        
        for (int i = start; start < end; i++){
            
        }
        
    }
    
    public void start(){
        this.thread.start();
    }
    
    public int ask(){        
        return res.size();
    }
}
