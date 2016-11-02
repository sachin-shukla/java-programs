/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sachin
 */
public class EngSpanDictionary {
     Map<String,String> engSpanDict;
     
    public EngSpanDictionary(){
        engSpanDict= new HashMap<String,String>();
    }
    
    // function to add the data to dictionary
    public void addDataToDictionary(String key,String value){
        engSpanDict.put(key,value);
    }
    
    // function to  get the value by passing the key 
    public void getValueByKey(String Key) {
        String result = engSpanDict.get(Key);
        System.out.println("The value of key "+Key+" is "+result);
    }
    
    // function to get the all data of map in key valye pairs   
    public void printAllData(){
        System.out.println("Printing the all data of map Dictionary");
        System.out.println(engSpanDict.toString());
    }
    
    // function to get the all set of keys to the map
    public void printAllKey(){
        System.out.println("Printing the all Keys set of map Dictionary");
        System.out.println(engSpanDict.keySet());
    }
    
    //function to get the all values of the map corresponding to that map
    public void printAllValue(){
        System.out.println("Printing the all values set of map Dictionary");
        System.out.println(engSpanDict.values());
    }

    public void startDemo() {
        addDataToDictionary("One","Uno");
        addDataToDictionary("Two","Dos");
        addDataToDictionary("Three","Tres");
        addDataToDictionary("Four","Las cuatro");
        addDataToDictionary("Five","Cinco");
        addDataToDictionary("Six","Seis");
        addDataToDictionary("Seven","Siete");
        addDataToDictionary("Eight","Cinco");
        addDataToDictionary("Nine","Nueve");
        addDataToDictionary("Ten","Diez");
        System.out.println("I have added the numbers from one to ten in english to spanish english word is key spanish are value.\n Lets see some operations");
        printAllData();
        printAllKey();
        printAllValue();
        getValueByKey("Five"); // keys are case senstive
        getValueByKey("Nine");
        getValueByKey("One");
    }
}
