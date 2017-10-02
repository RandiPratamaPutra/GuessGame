/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.id.indocyber.guessgame.model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Misbahul Munir
 */
public class WordQuestionGenerator {

    public static WordModel[] createQuestion() {
        WordModel soal1 = new WordModel("Pondok indah", "Daerah Dijakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan Utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung Deket Monas");
        WordModel soal4 = new WordModel("Citos", "Mall Dijakarta Selatan");
        WordModel soal5 = new WordModel("Gandaria City", "Mall Anak Muda");
        WordModel[] bankSoal = {soal1, soal2, soal3, soal4, soal5};
        return bankSoal;
    }
    
    public static List<WordModel> createQuestionCollections(){
        WordModel soal1 = new WordModel("Pondok indah", "Daerah Dijakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan Utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung Deket Monas");
        WordModel soal4 = new WordModel("Citos", "Mall Dijakarta Selatan");
        WordModel soal5 = new WordModel("Gandaria City", "Mall Anak Muda");
        List<WordModel> bankSoal=new ArrayList<>();
        bankSoal.add(soal1);
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        bankSoal.add(soal5);
        return bankSoal;
        
    }
    
    public static List<WordModel> createQuestionFromFile(String filename) throws FileNotFoundException, IOException{
        List<WordModel> bankSoal=new ArrayList<>();
        File file =new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);// untuk memanggil filereader

 
        String line = null;
        while ((line = reader.readLine()) != null) {
            //System.out.println(line);
            //Split line assign ke strig array
            String[] splitLine = line.split(",");
            //buat objek questionmodel, array idx 0 kata dasar, idx 1 untuk petunjuk
            WordModel wm = new WordModel(splitLine[0], splitLine[1].trim());
            // add ke question collection
            bankSoal.add(wm);
        }
        Collections.sort(bankSoal);
        //periksa ukuran question
        System.out.println("\nJumlah Pertanyaan Dalam Collection : " + bankSoal.size() + "\n");
        //iterasi collection
//        for (WordModel q : bankSoal) {
//            System.out.println("Kata : " + q.getBasicWord() + " , Petunjuk : " + q.getHint());
//        }
        
        return bankSoal;
    }

    
}
