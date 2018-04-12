package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**Tracks the score for Team A.
     */
    int scoreTeamA = 0;

    /**Tracks the score for Team A.
     */
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Increase the score for Team A by 3 points.
     */
    public void addThreePointsA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**Increase the score for Team A by 2 points.
     */
    public void addTwoPointsA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);    }

    /**Increase the score for Team A by 1 point.
     */
    public void addOnePointA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**Increase the score for Team B by 3 points.
     */
    public void addThreePointsB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**Increase the score for Team B by 2 points.
     */
    public void addTwoPointsB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);    }

    /**Increase the score for Team B by 1 point.
     */
    public void addOnePointB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**Resets the score for Team B and Team A to 0.
     */
    public void scoreReset(View v) {
        int scoreReset = 0;
        displayForTeamA(scoreReset);
        displayForTeamB(scoreReset);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
