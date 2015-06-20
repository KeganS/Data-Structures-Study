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

    private QuestionBook mQuestionBook = new QuestionBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Create activity and hook it up to the main XML screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);

        // Declare our View variables and assign them the views from the layout file
        final TextView questionLabel = (TextView) findViewById(R.id.questionTextView);
        Button nextQuestionButton = (Button) findViewById(R.id.nextQuestionButton);

        // Create an OnClickListener for a button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override

            // When the button is clicked use QuestionBook object to get an answer
            public void onClick(View view) {
                String question = mQuestionBook.getQuestion();
                // Update the label with our dynamic question
                questionLabel.setText(question);

                // QuestionBook.mQuestions[0] = "this is a data structure question."

            }
        };

        // Attach OnClickListener to the button
        nextQuestionButton.setOnClickListener(listener);
    }
}
