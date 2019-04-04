package com.greenfoxacademy.resttasks.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class SithService {

  public SithService() {
  }

  public String theYodaTranslator(String text) {
    String[] sentences = splitInputSentenceByFullstop(text);
    ArrayList<String> sentencesInArrayList = sentenceArrayToArrayList(sentences);
    String translatedSentence = "";
    String reversedSentence = "";

    for (String sentence : sentencesInArrayList) {
      translatedSentence = swapping(sentence);
      reversedSentence = reversedSentence + " " + translatedSentence;
    }
    return reversedSentence.trim();
  }

  public String[] splitInputSentenceByFullstop(String text) {
    String[] listOfSentencesToTransform = text.split("\\.");
    return listOfSentencesToTransform;
  }

  public String swapping(String sentence) {
    ArrayList<String> wordArrayListOfSentence = createWordListFromSentence(sentence);
    if (wordArrayListOfSentence.size() % 2 == 0) {
      wordArrayListOfSentence = swapElementsIfWordNumberIsEven(wordArrayListOfSentence);
    } else {
      wordArrayListOfSentence = swapElementsIfWordNumberIsOdd(wordArrayListOfSentence);
    }
    return constructYodaSentence(wordArrayListOfSentence);
  }

  public String dropARandomWord() {

    ArrayList<String> yodaWords = new ArrayList<>(Arrays.asList("Arrgh", "Yes, hmmm", "Err..err.err", "Hmm", "Herh herh herh", "Yeesssssss"));

    int indexOfYodaWord = (int) (Math.random() * yodaWords.size());
    int numberOfRandomWords = 1 + (int) (Math.random() * 2);
    String createYodaString = yodaWords.get(indexOfYodaWord).concat(".");
    if (numberOfRandomWords == 2) {
      createYodaString = createYodaString + " " + yodaWords.get(indexOfYodaWord);
    }
    return createYodaString;
  }

  public ArrayList<String> sentenceArrayToArrayList(String[] sentences) {
    ArrayList<String> sentencesAL = new ArrayList<>();

    for (int i = 0; i < sentences.length; i++) {
      sentencesAL.add(sentences[i]);
    }
    return sentencesAL;
  }

  public String firstLetterToUppercase(String word) {
    String formattedWord = "";

    String firstLetter = word.substring(0, 1).toUpperCase();

    formattedWord = firstLetter + word.substring(1);

    return formattedWord;
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
      for (int i = 0; i <= wordsAL.size() - 2; i += 2) {
        swappedArrayList.add(wordsAL.get(i + 1));
        swappedArrayList.add(wordsAL.get(i).toLowerCase());
      }
    }
    swappedArrayList.set(0, firstLetterToUppercase(swappedArrayList.get(0)));

    return swappedArrayList;
  }

  public ArrayList<String> swapElementsIfWordNumberIsOdd(ArrayList<String> wordsAL) {
    ArrayList<String> swappedArrayList = new ArrayList<>();

    if (wordsAL.size() % 2 != 0) {
      for (int i = 0; i <= wordsAL.size() - 3; i += 2) {
        swappedArrayList.add(wordsAL.get(i + 1));
        swappedArrayList.add(wordsAL.get(i).toLowerCase());
      }
      swappedArrayList.set(0, firstLetterToUppercase(swappedArrayList.get(0)));
      swappedArrayList.add(wordsAL.get(wordsAL.size() - 1));
    }
    return swappedArrayList;
  }

  public String constructYodaSentence(ArrayList<String> wordArray) {
    String yodaSentence = "";

    yodaSentence = String.join(" ", wordArray).concat(". ").concat(dropARandomWord().concat("."));
    return yodaSentence;
  }

}
