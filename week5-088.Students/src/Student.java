/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class Student {
    private String name;
    private String studentNumber;
    
    public Student(String newName , String newId){
        this.name = newName;
        this.studentNumber = newId;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getStudentNumber(){
        return this.studentNumber;
    }
    
    public String toString(){
        return this.name + " (" + this.studentNumber + ") " ; 
    }
}
