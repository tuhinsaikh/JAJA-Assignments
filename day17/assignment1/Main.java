package com.assignment1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song();
        PlayList p1 = new PlayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("How much song do you want to add");
        int songs_add = scan.nextInt();
        for(int i = 0; i<songs_add; i++){
            System.out.println("song name");
            scan.nextLine();
            String songName = scan.nextLine();
            System.out.println("movie name");
            String movieName = scan.next();
            p1.addSong(new Song(songName,movieName));
        }
        for(Song song : p1.lhs){
            song.play();
        }
    }
}
