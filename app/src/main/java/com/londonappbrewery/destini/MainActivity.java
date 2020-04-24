package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
TextView s1;
Button b_up,b_dn;
int mStoryIndex =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        s1 = findViewById(R.id.storyTextView);
        b_up = findViewById(R.id.buttonTop);
        b_dn = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:





        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

    public void top(View view) {
        if (mStoryIndex == 1) {
            s1.setText(R.string.T3_Story);
            b_up.setText(R.string.T3_Ans1);
            b_dn.setText(R.string.T3_Ans2);
            mStoryIndex++;
        }
        else if(mStoryIndex ==2)
        {
            s1.setText(R.string.T3_Story);
            b_up.setText(R.string.T3_Ans1);
            b_dn.setText(R.string.T3_Ans2);
            mStoryIndex++;
        }
        else if (mStoryIndex == 3)
        {
            s1.setText(R.string.T6_End);
        }
        else
        {
            s1.setText(R.string.T6_End);

        }




    }

    public void bottom(View view) {
        if (mStoryIndex == 1) {
            s1.setText(R.string.T2_Story);
            b_up.setText(R.string.T2_Ans1);
            b_dn.setText(R.string.T2_Ans2);
            mStoryIndex++;
        }
        else if(mStoryIndex ==2)
        {
            s1.setText(R.string.T4_End);
        }
        else if (mStoryIndex == 3)
        {
            s1.setText(R.string.T5_End);
        }
        else
        {
            s1.setText(R.string.T5_End);
        }
    }
}
