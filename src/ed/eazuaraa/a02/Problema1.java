/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.eazuaraa.a02;

/**
 *
 * @author eazuara
 */
public class Problema1 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else
            return(n* factorial(n-1));
    }
    
}
