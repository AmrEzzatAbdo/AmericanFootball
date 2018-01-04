package com.example.amrez.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //TextView
    private TextView Player1Score;
    private TextView Player2Score;

    //Button player 1
    private Button player1IncreaseBy6;
    private Button player1IncreaseBy3;
    private Button player1IncreaseBy2;
    private Button player1IncreaseBy1;

    //Button player 2
    private Button player2IncreaseBy6;
    private Button player2IncreaseBy3;
    private Button player2IncreaseBy2;
    private Button player2IncreaseBy1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Player1Score= (TextView) findViewById(R.id.Player1Score);
        Player2Score= (TextView) findViewById(R.id.Player2Score);

        player1IncreaseBy6= (Button) findViewById(R.id.player1IncreaseBy6);
        player1IncreaseBy3= (Button) findViewById(R.id.player1IncreaseBy3);
        player1IncreaseBy2= (Button) findViewById(R.id.player1IncreaseBy2);
        player1IncreaseBy1= (Button) findViewById(R.id.player1IncreaseBy1);

        player2IncreaseBy6= (Button) findViewById(R.id.player1IncreaseBy6);
        player2IncreaseBy3= (Button) findViewById(R.id.player1IncreaseBy3);
        player2IncreaseBy2= (Button) findViewById(R.id.player1IncreaseBy2);
        player2IncreaseBy1= (Button) findViewById(R.id.player1IncreaseBy1);
    }

    //Player 1 Button Action
    public void player1IncreaseBy6(View view) {
        update_player1_score(6);
    }

    public void player1IncreaseBy3(View view) {
        update_player1_score(3);
    }

    public void player1IncreaseBy2(View view) {
        update_player1_score(2);
    }

    public void player1IncreaseBy1(View view) {
        update_player1_score(1);
    }


    //Player 1 Button Action
    public void player2IncreaseBy6(View view) {
        update_player2_score(6);
    }

    public void player2IncreaseBy3(View view) {
        update_player2_score(3);
    }

    public void player2IncreaseBy2(View view) {
        update_player2_score(2);
    }

    public void player2IncreaseBy1(View view) {
        update_player2_score(1);
    }

    //display player 1 score
    public void  display_player1_score(int score){
        Player1Score.setText(String.valueOf(score));
    }

    //display player 2 score
    public void  display_player2_score(int score){
        Player2Score.setText(String.valueOf(score));
    }

    //Update player2 score in integer
    public void  update_player1_score(int new_score){
        int score= Integer.parseInt(Player1Score.getText().toString());
        score+=new_score;
        display_player1_score(score);
    }

    //Update player2 score in integer
    public void  update_player2_score(int new_score){
        int score= Integer.parseInt(Player2Score.getText().toString());
         score+=new_score;
        display_player2_score(score);
    }

    public void Reset(View view) {
        Player1Score.setText("0");
        Player2Score.setText("0");
    }
}
