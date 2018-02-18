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

        playerOneScore = ((TextView) findViewById(R.id.textView_main_activity_player1_score));
        playerTwoScore = ((TextView) findViewById(R.id.textView_main_activity_player2_score));
        playerOneButton = ((Button) findViewById(R.id.btn_main_activity_player1));
        playerTwoButton = ((Button) findViewById(R.id.btn_main_activity_player2));


        playerOneScore.setText((String.valueOf("0")));
        playerTwoScore.setText(String.valueOf("0"));

        playerOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.valueOf(playerOneScore.getText().toString());
                value++;
                if( value >= WINNING_SCORE){
                    Toast.makeText(MainActivity.this, "Player one Wins!", Toast.LENGTH_SHORT).show();
                    playerOneScore.setText((String.valueOf("0")));
                    playerTwoScore.setText(String.valueOf("0"));
                }else{
                    playerOneScore.setText(String.valueOf(value));
                }
            }
        });

        playerTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.valueOf(playerTwoScore.getText().toString());
                value++;
                if (value >= WINNING_SCORE){
                    Toast.makeText(MainActivity.this, "Player Two Wins!", Toast.LENGTH_SHORT).show();
                    playerOneScore.setText((String.valueOf("0")));
                    playerTwoScore.setText(String.valueOf("0"));
                }else{
                    playerTwoScore.setText(String.valueOf(value));
                }
            }
        });

    }
}
