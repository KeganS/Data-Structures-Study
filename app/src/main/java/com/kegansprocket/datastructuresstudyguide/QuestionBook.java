package com.kegansprocket.datastructuresstudyguide;

import java.util.Random;

/**
 * Created by Kegan on 6/19/2015.
 */
public class QuestionBook {
    // Member variable (properties about the object)
    public String[] mQuestions = {
            "A data structure is a way of organizing data in a computer so it can be used efficiently.",
            "For Binary Search Trees, average time complexity for access, search, insertion and deletion is O(log(n)).",
            "The best-case time complexity for Mergesort is O(n log(n)).",
            "A Red-Black tree is a B-tree of order 4.",
            "A B-tree requires less memory than a Red-Black tree because it doesn't use flags.",
            "An Abstract Data Type is used to separate the use of a data structure from the details of its implementation.",
            "A stack is a LIFO ADT with three operations: push, pop, and peek or pop.",
            "A queue is a FIFO ADT with three operations: enqueue, dequeue, and peek",
            "The advantages of ADTs are: encapsulation, localization of change, and flexibility.",
            "The biggest advantage of a linked list over an array is that elements can easily be inserted or removed without" +
                    " reallocation or reorganization of the entire structure.",
    };

    // Method (abilities: things the object can do)
    public String getQuestion(){

        String question = "";

        // Randomly select a question
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mQuestions.length);

        question = mQuestions[randomNumber];

        return question;
    }
}
