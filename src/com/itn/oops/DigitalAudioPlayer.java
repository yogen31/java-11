/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

/**
 *
 * @author rock and roll
 */
public abstract class DigitalAudioPlayer implements AudioPlayer{
    
    int currentTrack=0;
    // instance variable
    
    @Override
    public void forward(){
        if(currentTrack<NO_OF_TRACKS-1){
            currentTrack++;
            
        }
        else{
        currentTrack = 0;
    }
    }
    @Override
    public void rewind(){
        if(currentTrack > 0){
            currentTrack--;
        }
        else{
            currentTrack = NO_OF_TRACKS - 1;
        }
    }
    
    
}
