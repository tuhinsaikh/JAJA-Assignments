package com.assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class PlayList {

    public LinkedHashSet<Song> lhs = new LinkedHashSet<>();
    public void addSong(Song song){
        if(lhs.add(song)){
            System.out.println("Song added to the playlist successfully");
        }else System.out.println("Song is already added in the playlist");
    }

//    public static void main(String[] args) {
//        PlayList p1 = new PlayList();
//        List<Song> songs = new ArrayList<>(lhs);
//
//        p1.addSong(new Song("Ashique 2","Tum hi ho"));
//        p1.addSong(new Song("Ashique 2","Tum hi ho"));
//        p1.addSong(new Song("Ashique","Tum hi"));
//        Song s1 = new Song("Ashique 2","Tum hi ho");
//        Song s2 = new Song("Ashique 2","Tum hi ho");
//        Song s3 = new Song("Ashique","Tum hi ho");
//
//        //System.out.println(s1.hashCode()==s3.hashCode());
////        System.out.println(lhs.add(s1));
////        System.out.println(lhs.add(s2));
////        System.out.println(lhs.add(s3));
//        System.out.println(songs);
//        System.out.println(lhs);
//        for(Song song : lhs){
//            songs.add(song);
//        }
//        for(Song sng : songs){
//            System.out.println(sng.getSongName()+"---"+sng.getMovieName());
//            //System.out.println(sng.getSongName()+"--"+sng.getMovieName());
//        }
//
//    }

}
