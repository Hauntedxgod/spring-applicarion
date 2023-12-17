package ru.maxima.radio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

interface Music{



    List<String> arr = new ArrayList<>();


    void arr();

    void playSong();

}
class MaximumRadio implements Music{


    private String song;
    private List<String> arr;
    public MaximumRadio(String song) {
        this.song = song;
    }

    public MaximumRadio() {

    }

@Override
    public void arr(){
        arr = new LinkedList<>();
        arr.add("Play Alblack");
        arr.add("Play Respouns");
        arr.add("50cent");
        arr.add("9pi");
        arr.add("Mercury");

        Random random = new Random();
        for (int i = 0; i < arr.size(); i++) {
            int a = random.nextInt(3);
            System.out.println("Track - " + arr.get(a));


        }
    }


    @Override
    public void playSong() {
        System.out.println(song);
    }


    public void setArr(List arr) {
    }
}
class RadioEnergy implements Music {


    private List<String> arr;
    private String song ;



    public List<String> getArr() {
        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public RadioEnergy(String song) {
        this.song = song;
    }

    public RadioEnergy() {

    }

    public RadioEnergy(List<String> arr) {
        this.arr = arr;
    }

    @Override
    public void arr() {
        arr = new LinkedList<>();
        arr.add("KENTUKKI");
        arr.add("Donor");
        arr.add("Kizaru");
        arr.add("Glass Animals");
        arr.add("Lil Gotit");

        Random random = new Random();
        for (int i = 0; i < arr.size(); i++) {
            int a = random.nextInt(3);
            System.out.println("Track - " + arr.get(a));
        }
    }

    @Override
    public  void playSong() {
        System.out.println(song);
    }

}
class RadioRelax implements Music {

    private String song ;
    private List<String> arr;

    public List<String> getArr() {
        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;

    }

    public RadioRelax(String song) {
        this.song = song;
    }

    public RadioRelax() {

    }

    @Override
    public void arr() {
        arr = new LinkedList<>();
        arr.add("Nkeeei");
        arr.add("Pharaoh");
        arr.add("Lil Eazzyy");
        arr.add("Da Baby");
        arr.add("Jeembo");

        Random random = new Random();
        for (int i = 0; i < arr.size(); i++) {
            int a = random.nextInt(3);
            System.out.println("Track - " + arr.get(a));
        }
    }


    @Override
    public  void playSong() {
        System.out.println(song);
    }


    public void setArr(String arr) {
    }
}
public class RadioPlayer{

    private Music music;


    public RadioPlayer(Music music) {
        this.music = music;
    }

    public void playRadio(){
        music.arr();
        }
    }

