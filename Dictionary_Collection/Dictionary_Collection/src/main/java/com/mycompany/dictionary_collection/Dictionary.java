/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dictionary_collection;

import java.util.*;

/**
 *
 * @author Student
 */

public class Dictionary {
    private HashMap<String,String> dict = new HashMap<>();
    //private TreeMap<String,String> treeDict = new TreeMap<>();

    public Dictionary(HashMap<String, String> dict) {
        this.dict = dict;
    }

    public Dictionary() {
    }

    public boolean isExist(String word){
        if (dict.get(word) != null){
            return true;
        }
        return false;
    }
    public String getMeaning(String word){
        return dict.get(word);
    }
    public void Input(String w, String m){
        dict.put(w,m);
    }
    
}
