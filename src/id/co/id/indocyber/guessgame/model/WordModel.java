/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.id.indocyber.guessgame.model;

import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author user
 */
public class WordModel implements Comparable<WordModel>{

    /**
     * @return the jumlahTebakan
     */
    public int getJumlahTebakan() {
        return jumlahTebakan++;
    }

    /**
     * @param jumlahTebakan the jumlahTebakan to set
     */
    public void setJumlahTebakan(int jumlahTebakan) {
        this.jumlahTebakan = jumlahTebakan;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    /**
     * @return the basicWord
     */
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint.toUpperCase();
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }
    private String basicWord;
    private String soal;
    private String hint;
    private String jawaban;
    private String[] images;
    private int jumlahTebakan;

    public WordModel() {

    }

    public WordModel(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
        images = new String[]{"satu.jpg", "dua.jpg"};// contoh array gambar
    }

//    public String createSoal(){
//
//        basicWord=basicWord.toUpperCase();       
//        String [] arrayOfWord=basicWord.split("");// split untuk memisahkan bagian dari String
//        //System.out.println("huruf ke 2"+arrayOfWord[1]);
//        for (int i = 0; i < arrayOfWord.length; i++) {// arrayofwors.lenght fix tdk bisa diubah2
//            //indeks array dimulai dari 0
//            System.out.println(arrayOfWord[i]);
//        }
//        
//        Arrays.sort(arrayOfWord);//sortir array yaitu mensortir alfabet dari huruf pertama abcd
//        StringBuilder sb= new StringBuilder();//String builder menggabungkan beberapa string
//        System.out.println("\nSetelah di sort");
//        for (int i = 0; i < arrayOfWord.length; i++) {
//            sb.append(arrayOfWord[i]);// sb.appen merubah karakter String [] aray ke String tunggal
//        }       
//        String soal=sb.toString();
//        System.out.println("Soal yang harus dijawab "+soal.trim());
//        
//        return soal;
//    }
    public String createSoal() {

        basicWord = basicWord.toUpperCase();
        String[] arrayOfWord = basicWord.split("");// split untuk memisahkan bagian dari String
        
        //Arrays.sort(arrayOfWord);
        
        StringBuilder sb = new StringBuilder();//String builder menggabungkan beberapa string
        for (int i = 0; i < arrayOfWord.length; i++) {
            sb.append(arrayOfWord[i]);// sb.appen merubah karakter String [] aray ke String tunggal
        }
        
        String soal = sb.toString();
        char[] vokal = {'A', 'I', 'M','U','E','O'};
        for (int i = 0; i < vokal.length; i++) {
            soal = soal.replace(vokal[i], '_');
        }

        System.out.println("Soal yang harus dijawab " + soal);
        return soal;
    }
    
    public String acakHuruf(){
        basicWord=basicWord.toUpperCase();
        String [] arrayOfWord=basicWord.split("");
        List<String> hurufHuruf =Arrays.asList(arrayOfWord);
        //Collections.shuffle(hurufHuruf);
        
        StringBuilder sb = new StringBuilder();//String builder menggabungkan beberapa string
        for (String huruf : hurufHuruf) {
            sb.append(huruf);// sb.appen merubah karakter String [] aray ke String tunggal
        }
        String soal = sb.toString();
        char[] vokal = {'A', 'I', 'M','U','E','O'};
        for (int i = 0; i < vokal.length; i++) {
            soal = soal.replace(vokal[i], '_');
        }
        
        
        return soal;
    }

    public boolean cekJawaban() {
        boolean hasil = false;
        if (jawaban.equalsIgnoreCase(basicWord)) {
            hasil = true;
        }
        return hasil;
    }

    @Override
    public int compareTo(WordModel o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return basicWord.compareTo(o.basicWord);
    
    }

}
