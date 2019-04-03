package com.greenfoxacademy.resttasks.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class SithService {

  private ArrayList<String> yodaWords = new ArrayList<>(Arrays.asList("Arrgh", "Yes, hmmm", "Err..err.err", "Hmm", "Herh herh herh", "Yeesssssss"));

  public SithService() {
  }

  public String[] splitInputSentenceByFullstop(String text) {
    String[] listOfSentencesToTransform = text.split("\\.");
    return listOfSentencesToTransform;
  }

  public String dropARandomWord(ArrayList<String> yodaWords) {
    int number = yodaWords.size();
    String aRandomWordFromPool = null;

    for (int i = 0; i < number; i++) {
      aRandomWordFromPool = yodaWords.get((int) (Math.random() * number));
    }
    return aRandomWordFromPool;
  }

  public ArrayList<String> sentenceArrayToArrayList(String[] sentences) {
    ArrayList<String> sentencesAL = new ArrayList<>();

    for (int i = 0; i < sentences.length; i++) {
      sentencesAL.add(sentences[i]);
    }
    return sentencesAL;
  }

  public ArrayList<String> createWordListFromSentence(String sentence) {
    String[] words = sentence.split(" ");
    ArrayList<String> wordsAL = new ArrayList<>();

    for (int i = 0; i < words.length; i++) {
      wordsAL.add(words[i].trim());
    }
    return wordsAL;
  }

  public ArrayList<String> swapElementsIfWordNumberIsEven(ArrayList<String> wordsAL) {
    ArrayList<String> swappedArrayList = new ArrayList<>();

    if (wordsAL.size() % 2 == 0) {
      for (int i = 0; i < wordsAL.size() - 2; i += 2) {
        swappedArrayList.add(wordsAL.get(i + 1));
        swappedArrayList.add(wordsAL.get(i).toLowerCase());
      }
    }
    return swappedArrayList;
  }

  public ArrayList<String> swapElementsIfWordNumberIsOdd(ArrayList<String> wordsAL) {
    ArrayList<String> swappedArrayList = new ArrayList<>();

    if (wordsAL.size() % 2 != 0) {
      for (int i = 0; i < wordsAL.size() - 3; i += 2) {
        swappedArrayList.add(wordsAL.get(i + 1));
        swappedArrayList.add(wordsAL.get(i).toLowerCase());
      }
      swappedArrayList.add(wordsAL.get(wordsAL.size() - 1));
    }
    return swappedArrayList;
  }

  public ArrayList<String> getYodaWords() {
    return yodaWords;
  }

  public void setYodaWords(ArrayList<String> yodaWords) {
    this.yodaWords = yodaWords;
  }
}
