package com.kegansprocket.datastructuresstudyguide;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class DataStructuresActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);

        // Declare our View variables and assign them the views from the layout file
        final TextView questionLabel = (TextView) findViewById(R.id.questionTextView);
        Button nextQuestionButton = (Button) findViewById(R.id.nextQuestionButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] questions = {
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
                // The button was clicked, so update the question label with a new fact
                String question = "";
                // Randomly select a question
                Random randomGenerator = new Random(); // Construct a new Random number generator
                int randomNumber = randomGenerator.nextInt(questions.length);

                /* Convert the randomNumber to a text question
                   0 = Best time complexity for Mergesort is O(n log(n)).
                   1 = A Red-Black tree is a B-tree of order 4.
                   2 = A B-tree requires less memory than a Red-Black tree.
                 */

                question = questions[randomNumber];

                //update the label with our dynamic question
                questionLabel.setText(question);

            }
        };

        nextQuestionButton.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.data_structures, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
