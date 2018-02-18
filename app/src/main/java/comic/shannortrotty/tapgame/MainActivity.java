package comic.shannortrotty.tapgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView playerOneScore;
    private TextView playerTwoScore;
    private Button playerOneButton;
    private Button playerTwoButton;

    private final int WINNING_SCORE = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1: Initialize the TextViews for Player 1 and 2's score and their respective Button


        // TODO 2: Initialize the score for Player 1 and 2 to 0


        /*
         * TODO 3: Add an OnClickListener to Player 1's button so the score increases by 1 each
         * time the button is clicked. If the score hits WINNING_SCORE, create a toast that
         * alerts the player of the winner and reset both scores to 0.
         */


        /*
         * TODO 4: Add an OnClickListener to Player 2's button so the score increases by 1 each
         * time the button is clicked. If the score hits WINNING_SCORE, create a toast that
         * alerts the player of the winner and reset both scores to 0.
         */


    }
}
