/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goit.module07_collection.conspectus.materials.theme01.tmp;

/**
 *
 * @author t-800
 */
public class NewSingleton {
    
    private NewSingleton() {
    }
    
    public static NewSingleton getInstance() {
        return NewSingletonHolder.INSTANCE;
    }
    
    private static class NewSingletonHolder {

        private static final NewSingleton INSTANCE = new NewSingleton();
    }
}
