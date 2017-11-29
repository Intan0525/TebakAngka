/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class WordModel {

    private String basicWord;
    private String jawaban;
    private String soal;
    private String hint;

    public WordModel() {
    }

    public WordModel(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
    }

    public String createSoal() {
        basicWord = basicWord.toUpperCase();
        String[] arrayOfWord = basicWord.split("");
        Arrays.sort(arrayOfWord);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayOfWord.length; i++) {
            sb.append(arrayOfWord[i]);
        }
        String soal = sb.toString();
        return soal;
    }

    public String acakHuruf() {
        basicWord = basicWord.toUpperCase();
        String[] arrayOfWord = basicWord.split("");
        List<String> hurufHuruf = Arrays.asList(arrayOfWord);
        Collections.shuffle(hurufHuruf);

        StringBuilder sb = new StringBuilder();
        for (String huruf : hurufHuruf) {
            sb.append(huruf);
        }
        return sb.toString();
    }

    public boolean cekJawaban() {
        boolean hasil = false;
        if (jawaban.equalsIgnoreCase(basicWord)) {
            hasil = true;
        }
        return hasil;
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
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
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

}
