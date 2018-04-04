package com.example.hello57748.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //DECLARING PAGE
    //  new game button
    Button new_game_button;
    //  game board buttons
    Button button_0_0;
    Button button_0_1;
    Button button_0_2;
    Button button_1_0;
    Button button_1_1;
    Button button_1_2;
    Button button_2_0;
    Button button_2_1;
    Button button_2_2;
    Button[] array_of_buttons = {button_0_0, button_0_1, button_0_2, button_1_0, button_1_1, button_1_2, button_2_0, button_2_1, button_2_2};
    //  turn textview
    TextView player_turn_text;
    //  winner textview
    TextView winner_text;
    //  int to count game_buttons pressed
    int turns = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //CREATING TEXTVIEW REFERENCES
        //  turn textview
        player_turn_text = (TextView) findViewById(R.id.player_turn_text);
        //  winnner texetview
        winner_text = (TextView) findViewById(R.id.winner_text);

        //CREATING BUTTONS' ONCLICK LISTENERS
        //  new game button
        new_game_button = (Button) findViewById(R.id.new_game_button);
        new_game_button.setOnClickListener(this);
        //  board buttons
        button_0_0 = (Button) findViewById(R.id.button_0_0);
        button_0_0.setOnClickListener(this);
        button_0_1 = (Button) findViewById(R.id.button_0_1);
        button_0_1.setOnClickListener(this);
        button_0_2 = (Button) findViewById(R.id.button_0_2);
        button_0_2.setOnClickListener(this);
        button_1_0 = (Button) findViewById(R.id.button_1_0);
        button_1_0.setOnClickListener(this);
        button_1_1 = (Button) findViewById(R.id.button_1_1);
        button_1_1.setOnClickListener(this);
        button_1_2 = (Button) findViewById(R.id.button_1_2);
        button_1_2.setOnClickListener(this);
        button_2_0 = (Button) findViewById(R.id.button_2_0);
        button_2_0.setOnClickListener(this);
        button_2_1 = (Button) findViewById(R.id.button_2_1);
        button_2_1.setOnClickListener(this);
        button_2_2 = (Button) findViewById(R.id.button_2_2);
        button_2_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){



        //FUNCTIONALITY OF BUTTONS
        switch (view.getId()){

            case R.id.new_game_button:

                //resetting buttons' texts
                button_0_0.setText("click here");
                button_0_1.setText("click here");
                button_0_2.setText("click here");
                button_1_0.setText("click here");
                button_1_1.setText("click here");
                button_1_2.setText("click here");
                button_2_0.setText("click here");
                button_2_1.setText("click here");
                button_2_2.setText("click here");

                //resetting turns count
                turns = 0;

                //resetting turn text
                player_turn_text.setText("Player X's Turn");

                //resetting winner text
                winner_text.setText("Winner: Not Found Yet");

                break;
            case R.id.button_0_0:

                //up the turn count
                turns++;


                //setting button text and turn text
                if (turns % 2 == 0) {
                    button_0_0.setText("Y");
                    player_turn_text.setText("Player X's Turn");
                }
                else {
                    button_0_0.setText("X");
                    player_turn_text.setText("Player Y's Turn");
                }

                //check for winners
                if (check_for_winner("X")){
                    winner_text.setText("Winner: Player X");
                }
                else if (check_for_winner("Y")){
                    winner_text.setText("Winner: Player Y");
                }

                break;
            case R.id.button_0_1:

                //up the turn count
                turns++;

                //setting button text and turn text
                if (turns % 2 == 0) {
                    button_0_1.setText("Y");
                    player_turn_text.setText("Player X's Turn");
                }
                else {
                    button_0_1.setText("X");
                    player_turn_text.setText("Player Y's Turn");
                }

                //check for winners
                if (check_for_winner("X")){
                    winner_text.setText("Winner: Player X");
                }
                else if (check_for_winner("Y")){
                    winner_text.setText("Winner: Player Y");
                }

                break;
            case R.id.button_0_2:

                //up the turn count
                turns++;

                //setting button text and turn text
                if (turns % 2 == 0) {
                    button_0_2.setText("Y");
                    player_turn_text.setText("Player X's Turn");
                }
                else {
                    button_0_2.setText("X");
                    player_turn_text.setText("Player Y's Turn");
                }

                //check for winners
                if (check_for_winner("X")){
                    winner_text.setText("Winner: Player X");
                }
                else if (check_for_winner("Y")){
                    winner_text.setText("Winner: Player Y");
                }

                break;
            case R.id.button_1_0:

                //up the turn count
                turns++;

                //setting button text and turn text
                if (turns % 2 == 0) {
                    button_1_0.setText("Y");
                    player_turn_text.setText("Player X's Turn");
                }
                else {
                    button_1_0.setText("X");
                    player_turn_text.setText("Player Y's Turn");
                }

                //check for winners
                if (check_for_winner("X")){
                    winner_text.setText("Winner: Player X");
                }
                else if (check_for_winner("Y")){
                    winner_text.setText("Winner: Player Y");
                }

                break;
            case R.id.button_1_1:

                //up the turn count
                turns++;

                //setting button text and turn text
                if (turns % 2 == 0) {
                    button_1_1.setText("Y");
                    player_turn_text.setText("Player X's Turn");
                }
                else {
                    button_1_1.setText("X");
                    player_turn_text.setText("Player Y's Turn");
                }

                //check for winners
                if (check_for_winner("X")){
                    winner_text.setText("Winner: Player X");
                }
                else if (check_for_winner("Y")){
                    winner_text.setText("Winner: Player Y");
                }

                break;
            case R.id.button_1_2:

                //up the turn count
                turns++;

                //setting button text and turn text
                if (turns % 2 == 0) {
                    button_1_2.setText("Y");
                    player_turn_text.setText("Player X's Turn");
                }
                else {
                    button_1_2.setText("X");
                    player_turn_text.setText("Player Y's Turn");
                }

                //check for winners
                if (check_for_winner("X")){
                    winner_text.setText("Winner: Player X");
                }
                else if (check_for_winner("Y")){
                    winner_text.setText("Winner: Player Y");
                }

                break;
            case R.id.button_2_0:

                //up the turn count
                turns++;

                //setting button text and turn text
                if (turns % 2 == 0) {
                    button_2_0.setText("Y");
                    player_turn_text.setText("Player X's Turn");
                }
                else {
                    button_2_0.setText("X");
                    player_turn_text.setText("Player Y's Turn");
                }

                //check for winners
                if (check_for_winner("X")){
                    winner_text.setText("Winner: Player X");
                }
                else if (check_for_winner("Y")){
                    winner_text.setText("Winner: Player Y");
                }

                break;
            case R.id.button_2_1:

                //up the turn count
                turns++;

                //setting button text and turn text
                if (turns % 2 == 0) {
                    button_2_1.setText("Y");
                    player_turn_text.setText("Player X's Turn");
                }
                else {
                    button_2_1.setText("X");
                    player_turn_text.setText("Player Y's Turn");
                }

                //check for winners
                if (check_for_winner("X")){
                    winner_text.setText("Winner: Player X");
                }
                else if (check_for_winner("Y")){
                    winner_text.setText("Winner: Player Y");
                }

                break;
            case R.id.button_2_2:

                //up the turn count
                turns++;

                //setting button text and turn text
                if (turns % 2 == 0) {
                    button_2_2.setText("Y");
                    player_turn_text.setText("Player X's Turn");
                }
                else {
                    button_2_2.setText("X");
                    player_turn_text.setText("Player Y's Turn");
                }

                //check for winners
                if (check_for_winner("X")){
                    winner_text.setText("Winner: Player X");
                }
                else if (check_for_winner("Y")){
                    winner_text.setText("Winner: Player Y");
                }

                break;
        }
    }

    public boolean check_for_winner(String x_y){

        //checking winning combinations
        if (button_0_0.getText().equals(x_y) && button_0_1.getText().equals(x_y) && button_0_2.getText().equals(x_y))
            return true;
        else if (button_1_0.getText().equals(x_y) && button_1_1.getText().equals(x_y) && button_1_2.getText().equals(x_y))
            return true;
        else if (button_2_0.getText().equals(x_y) && button_2_1.getText().equals(x_y) && button_2_2.getText().equals(x_y))
            return true;
        else if (button_0_0.getText().equals(x_y) && button_1_0.getText().equals(x_y) && button_2_0.getText().equals(x_y))
            return true;
        else if (button_0_1.getText().equals(x_y) && button_1_1.getText().equals(x_y) && button_2_1.getText().equals(x_y))
            return true;
        else if (button_0_2.getText().equals(x_y) && button_1_2.getText().equals(x_y) && button_2_2.getText().equals(x_y))
            return true;
        else if (button_0_2.getText().equals(x_y) && button_1_1.getText().equals(x_y) && button_2_0.getText().equals(x_y))
            return true;
        else if (button_0_0.getText().equals(x_y) && button_1_1.getText().equals(x_y) && button_2_2.getText().equals(x_y))
            return true;
        return false;
    }

}
