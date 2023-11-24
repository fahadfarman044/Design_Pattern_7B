/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter.LabTask;

/**
 *
 * @author fa20-bse-044
 */
public interface AdvancedMediaPlayer {
   public void play(String fileName);

    public void playVlc(String fileName);

    public void playMp4(String fileName);
}