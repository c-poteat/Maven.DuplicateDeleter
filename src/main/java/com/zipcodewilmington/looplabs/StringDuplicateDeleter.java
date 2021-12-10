package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public int countNumberOccurences(String value) {
        int count = 0;   // Use a counter
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {  // if intArray[i] equal to number
                count++;
            }
        }
        return count;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int numberOfElements = 0;
        for (int i = 0; i < array.length; i++) {  // Run a for loop through the array that was given
            if (countNumberOccurences(array[i]) < maxNumberOfDuplications) {
                numberOfElements++;  // Size of new array
            }
        }
        int tracker = 0;
        String[] newArray = new String[numberOfElements];
        for (int j = 0; j < array.length; j++) {
            if (countNumberOccurences(array[j]) < maxNumberOfDuplications) {
                newArray[tracker] = (array[j]);  // Place values in new array using tracker
                tracker++;
            }
        }
        return newArray;

    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int numberOfElements = 0;
        for (int i = 0; i < array.length; i++) {  // Run a for loop through the array that was given
            if (countNumberOccurences(array[i]) != exactNumberOfDuplications) {
                numberOfElements++;  // Size of new array
            }
        }
        int tracker = 0;
        String[] newArray = new String[numberOfElements];
        for (int j = 0; j < array.length; j++) {
            if (countNumberOccurences(array[j]) != exactNumberOfDuplications) {
                newArray[tracker] = array[j];  // Place values in new array using tracker
                tracker++;
            }
        }
        return newArray;
    }
}
