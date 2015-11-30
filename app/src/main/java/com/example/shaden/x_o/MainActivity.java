package com.example.shaden.x_o;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button[][] Abuttons;
    String Button_text = "O";
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Abuttons = new Button[3][3];
        text = (TextView) findViewById(R.id.textView);

        Abuttons[0][0] = (Button) findViewById(R.id.btn1);
        Abuttons[0][1] = (Button) findViewById(R.id.btn2);
        Abuttons[0][2] = (Button) findViewById(R.id.btn3);
        Abuttons[1][0] = (Button) findViewById(R.id.btn4);
        Abuttons[1][1] = (Button) findViewById(R.id.btn5);
        Abuttons[1][2] = (Button) findViewById(R.id.btn6);
        Abuttons[2][0] = (Button) findViewById(R.id.btn7);
        Abuttons[2][1] = (Button) findViewById(R.id.btn8);
        Abuttons[2][2] = (Button) findViewById(R.id.btn9);
        GridLayout g = (GridLayout) findViewById(R.id.gridLayout);
        g.setVisibility(View.INVISIBLE);
    }

    public void start(View view) {
        GridLayout g = (GridLayout) findViewById(R.id.gridLayout);
        g.setVisibility(View.VISIBLE);
        TextView t = (TextView) findViewById(R.id.button);
        t.setVisibility(View.INVISIBLE);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Abuttons[i][j].setText("");
            }
            flag = 0;
            text.setText("Tic-Tac-Toe");
        }


    }

    public void Click(View view) {

        if (Button_text == "X") {
            Button_text = "O";

            ((Button) view).setText(Button_text);
            ((Button) view).setTextColor(getResources().getColor(R.color.colorAccent));


        } else {
            Button_text = "X";
            ((Button) view).setTextColor(getResources().getColor(R.color.colorPrimary));
            ((Button) view).setText(Button_text);
        }

        Check_method(view);
    }

    public int flag = 0;

    public void Check_method(final View view) {

        GridLayout g = (GridLayout) findViewById(R.id.gridLayout);

        TextView t = (TextView) findViewById(R.id.button);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {


                if (Abuttons[0][0].getText() == "X"
                        && Abuttons[1][0].getText() == "X"
                        && Abuttons[2][0].getText() == "X") {
                    text.setText("Player X wins");
                    flag = 0;

                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][1].getText() == "X"
                        && Abuttons[1][1].getText() == "X"
                        && Abuttons[2][1].getText() == "X") {
                    text.setText("Player X wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][2].getText() == "X"
                        && Abuttons[1][2].getText() == "X"
                        && Abuttons[2][2].getText() == "X")

                {
                    text.setText("Player X wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][0].getText() == "X" && Abuttons[1][1].getText() == "X" && Abuttons[2][2].getText() == "X") {
                    text.setText("Player X wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][2].getText() == "X" && Abuttons[1][1].getText() == "X" && Abuttons[2][0].getText() == "X") {
                    text.setText("Player X wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][0].getText() == "X"
                        && Abuttons[0][1].getText() == "X"
                        && Abuttons[0][2].getText() == "X") {
                    text.setText("Player X wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[1][0].getText() == "X"
                        && Abuttons[1][1].getText() == "X"
                        && Abuttons[1][2].getText() == "X") {
                    text.setText("Player X wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[2][0].getText() == "X"
                        && Abuttons[2][1].getText() == "X"
                        && Abuttons[2][2].getText() == "X") {
                    text.setText("Player X wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][0].getText() == "O"
                        && Abuttons[1][0].getText() == "O"
                        && Abuttons[2][0].getText() == "O") {
                    text.setText("Player O wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][1].getText() == "O" && Abuttons[1][1].getText() == "O" && Abuttons[2][1].getText() == "O") {
                    text.setText("Player O wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][2].getText() == "O" && Abuttons[1][2].getText() == "O" && Abuttons[2][2].getText() == "O") {
                    text.setText("Player O wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][0].getText() == "O" && Abuttons[1][1].getText() == "O" && Abuttons[2][2].getText() == "O") {
                    text.setText("Player O wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][2].getText() == "O" && Abuttons[1][1].getText() == "O" && Abuttons[2][0].getText() == "O") {
                    text.setText("Player O wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[0][0].getText() == "O"
                        && Abuttons[0][1].getText() == "O"
                        && Abuttons[0][2].getText() == "O") {
                    text.setText("Player O wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[1][0].getText() == "O"
                        && Abuttons[1][1].getText() == "O"
                        && Abuttons[1][2].getText() == "O") {
                    text.setText("Player O wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                } else if (Abuttons[2][0].getText() == "O"
                        && Abuttons[2][1].getText() == "O"
                        && Abuttons[2][2].getText() == "O") {
                    text.setText("Player O wins");
                    flag = 0;
                    g.setVisibility(View.INVISIBLE);
                    t.setVisibility(View.VISIBLE);
                }

            }
        }
        flag++;
        if (flag == 9) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Abuttons[i][j].setText("");
                }
                flag = 0;
                text.setText("No one wins");
                g.setVisibility(View.INVISIBLE);
                t.setVisibility(View.VISIBLE);
            }
        }
    }
}
