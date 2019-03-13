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
public class SonyAudioPlayer extends DigitalAudioPlayer implements Recordable{

    @Override
    public void play() {
        System.out.println("Playing track: "+currentTrack);
    }

    @Override
    public void pause() {
        System.out.println("Paused Track "+currentTrack);
    }

    @Override
    public void stop() {
        System.out.println("Audio Stopped!");
    }

    @Override
    public void record() {
        System.out.println("Audio Recorded!");
    }
    
    public static void main(String[] args) {
        SonyAudioPlayer player = new SonyAudioPlayer();
        player.powerOn();
        player.play();
        player.pause();
        player.forward();
        player.play();
        player.pause();
        player.rewind();
        player.play();
        player.stop();
        player.powerOff();
        
        //changes to recorder mode
        Recordable recorder = player;
        recorder.record();
        //recorder.play();
        
    }
    
    
}
