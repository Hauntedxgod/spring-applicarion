package ru.maxima.radio;

import java.util.*;
import java.util.stream.Collectors;

interface Music{



    List<String> arr = new ArrayList<>();


    void arr();

}
class MaximumRadio implements Music{

    private List<String> arr;

    public MaximumRadio() {

    }


    public List<String> getArr() {
        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }

    @Override
    public void arr() {
        Random random = new Random();
        System.out.println(arr.get(random.nextInt(3)));
    }

}
class RadioEnergy implements Music {


    private List<String> arr;



    public List<String> getArr() {
        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }
    public RadioEnergy() {

    }
    public RadioEnergy(List<String> arr) {
        this.arr = arr;
    }

    @Override
    public void arr() {
        Random random = new Random();
        System.out.println(arr.get(random.nextInt(3)));
        }


}
class RadioRelax implements Music {

    private List<String> arr;

    public List<String> getArr() {
        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }


    public RadioRelax() {

    }

    @Override
    public void arr() {
        Random random = new Random();
        System.out.println(arr.get(random.nextInt(3)));
    }

}
public class RadioPlayer {

    private List<Music> music;

    public RadioPlayer(List<Music> music) {
        this.music = music;
    }

    public RadioPlayer() {
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void playRadio(Integer count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            music.get(random.nextInt(music.size())).arr();
        }
    }
}

