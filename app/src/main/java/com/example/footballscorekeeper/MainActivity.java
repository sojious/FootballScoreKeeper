package com.example.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamBTotal = 0;
    private int teamATotal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateTeamBScore(View view) {
        int clickedButton = view.getId();
        if (clickedButton == R.id.btn_touchdown_b){
            teamBTotal += 6;
        }


        else if(clickedButton == R.id.btn_fieldgoal_b){

            teamBTotal += 3;
        }

        else if(clickedButton == R.id.btn_safety_b) {

            teamBTotal += 2;
        }

        else{
            teamBTotal += 1;
        }
        displayTeamBUpdatedScore(teamBTotal);
    }

    private void displayTeamBUpdatedScore(int total) {
        TextView scoreBoard =findViewById(R.id.score_team_b);
        String totalInString=Integer.toString(total);
        scoreBoard.setText(totalInString);
    }

    public void updateTeamAScore(View view) {
        int clickedButton = view.getId();

        if (clickedButton == R.id.btn_touchdown_a){
            teamATotal += 6;
        }


        else if(clickedButton == R.id.btn_fieldgoal_a){

            teamATotal += 3;
        }

        else if(clickedButton == R.id.btn_safety_a) {

            teamATotal += 2;
        }

        else {
            teamATotal += 1;
        }
        displayTeamAUpdatedScore(teamATotal);
    }

    private void displayTeamAUpdatedScore(int total) {
        TextView scoreBoard =findViewById(R.id.score_team_a);
        String totalInString=Integer.toString(total);
        scoreBoard.setText(totalInString);
    }

    public void resetScores(View view) {
        TextView scoreBoard1=findViewById(R.id.score_team_a);
        TextView scoreBoard2=findViewById(R.id.score_team_b);
        teamBTotal=teamATotal=0;
        scoreBoard1.setText("0");
        scoreBoard2.setText("0");
    }
}

