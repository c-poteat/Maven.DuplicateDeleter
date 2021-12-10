package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public int countNumberOccurences(int number) {
        int count = 0;   // Use a counter
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {  // if intArray[i] equal to number
                count++;
            }
        }
        return count;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int numberOfElements = 0;
        for (int i = 0; i < array.length; i++) {  // Run a for loop through the array that was given
            if (countNumberOccurences(array[i]) < maxNumberOfDuplications) {
                numberOfElements++;  // Size of new array
            }
        }
        int tracker = 0;
        Integer[] newArray = new Integer [numberOfElements];
        for (int j = 0; j < array.length; j++) {
            if (countNumberOccurences(array[j]) < maxNumberOfDuplications) {
                newArray[tracker] = array[j];  // Place values in new array using tracker
                tracker++;
            }
        }
        return newArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int numberOfElements = 0;
        for (int i = 0; i < array.length; i++) {  // Run a for loop through the array that was given
            if (countNumberOccurences(array[i]) != exactNumberOfDuplications) {
                numberOfElements++;  // Size of new array
            }
        }
        int tracker = 0;
        Integer[] newArray = new Integer[numberOfElements];
        for (int j = 0; j < array.length; j++) {
            if (countNumberOccurences(array[j]) != exactNumberOfDuplications) {
                newArray[tracker] = array[j];  // Place values in new array using tracker
                tracker++;
            }
        }
        return newArray;
    }
}
