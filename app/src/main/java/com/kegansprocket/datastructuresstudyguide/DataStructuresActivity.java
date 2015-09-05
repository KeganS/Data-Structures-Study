package com.kegansprocket.datastructuresstudyguide;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class DataStructuresActivity extends Activity {

    public static final String TAG = DataStructuresActivity.class.getSimpleName();

    private QuestionBook mQuestionBook = new QuestionBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Create activity and hook it up to the main XML screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);

        // Declare our View variables and assign them the views from the layout file
        final TextView questionLabel = (TextView) findViewById(R.id.questionTextView);
        final Button nextQuestionButton = (Button) findViewById(R.id.nextQuestionButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        // Create an OnClickListener for a button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override

            // When the button is clicked use QuestionBook object to get an answer
            public void onClick(View view) {
                String question = mQuestionBook.getQuestion();
                // Update the label with our dynamic question
                questionLabel.setText(question);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                nextQuestionButton.setTextColor(color);
                // QuestionBook.mColors[0] = "this is a data structure question."
            }
        };

        // Attach OnClickListener to the button
        nextQuestionButton.setOnClickListener(listener);

        //Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG,"We'ere logging from the onCreate() method!");
    }
}
