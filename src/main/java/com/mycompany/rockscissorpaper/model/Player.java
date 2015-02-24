/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.rockscissorpaper.model;

import com.mycompany.rockscissorpaper.controller.Choice;

/**
 *
 * @author ale
 */
public class Player {
    /*
    * 
    */
    String type;

    
    public Player(String type) {
        this.type = type;
    }

    public Player() {
   }

    public Choice readChoice() {
       
        //HTTP REQ
        
        //CMDLNE
        
        return new Choice("scissor");
    }

    public Choice randomChoice() {
        return new Choice("paper");
    }

    
}
