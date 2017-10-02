/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.id.indocyber.guessgame;

/**
 *
 * @author Misbahul Munir
 */
public class StringProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String nama="Matt Robin";
//        char idx5=nama.charAt(5);//mencari indeks/baris String
//        System.out.println(idx5);
//        
//        int uni5=nama.codePointAt(5);//codepointat untuk mencari nilai unique code // unicode
//        System.out.println(uni5);
//        
//        int a='c';
//        char d=10009;
//        
//        System.out.println(Character.getNumericValue('R'));//caracter atau integer menggunakan kutip satu // ascii
        //antara String dan char memiliki kolerasi yang kuat
        
        
        
        
        String nama="Matt Robin";
//        System.out.println(nama.indexOf('o'));
//        System.out.println(nama.lastIndexOf('o'));
//        nama=nama.replace('t', 'z');//replace mengganti hurup indeks
//        System.out.println(nama);
        char[] vokal={'a','i','e','o','u'};
        for (int i = 0; i < vokal.length; i++) {
            nama=nama.replace(vokal[i], '_');
        }
        System.out.println(nama);
        
        
        
        
        
        
//        for (int i = 0; i < vokal.length; i++) {
//            if(nama.indexOf(vokal[i])==-1){
//                
//            }else{
//                int idx=nama.indexOf(vokal[i]);
//                
//            }
//        }
    }
    
}
