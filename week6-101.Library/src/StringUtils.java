/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class StringUtils {
    
    
    public static boolean included(String word, String searched){
        String onlyWord = word.trim().toLowerCase();
        String onlySearched = searched.trim().toLowerCase();
        
        if(onlyWord.contains(onlySearched)){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
