package com.muiedhossain.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView btn_x11, btn_x12, btn_x13, btn_x21, btn_x22, btn_x23, btn_x31, btn_x32, btn_x33;
    // matrix
    int x11 = 5, x12 = 5, x13 = 5, x21 = 5, x22 = 5, x23 = 5, x31 = 5, x32 = 5, x33 = 5;
    //matrix

    //initially all the slots are empty
    int slot1 = 0, slot2 = 0, slot3 = 0, slot4 = 0, slot5 = 0, slot6 = 0, slot7 = 0, slot8 = 0, slot9 = 0;
    //initially all the slots are empty

    int a_score_Count = 0, b_score_Count = 0, i = 0;

    private String startGame = "A";//initially start game will start with A
    private TextView score_of_A, score_of_B;
    private Button Reset;

    private RelativeLayout rowMatcher1, rowMatcher2, rowMatcher3, columnMatcher1, columnMatcher2, columnMatcher3;
    private ConstraintLayout leftToRight, rightToLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_x11 = findViewById(R.id.btnImgX11);
        btn_x12 = findViewById(R.id.btnImgX12);
        btn_x13 = findViewById(R.id.btnImgX13);
        btn_x21 = findViewById(R.id.btnImgX21);
        btn_x22 = findViewById(R.id.btnImgX22);
        btn_x23 = findViewById(R.id.btnImgX23);
        btn_x31 = findViewById(R.id.btnImgX31);
        btn_x32 = findViewById(R.id.btnImgX32);
        btn_x33 = findViewById(R.id.btnImgX33);

        rowMatcher1 = findViewById(R.id.firstRowMatcher);
        rowMatcher2 = findViewById(R.id.secondRowMatcher);
        rowMatcher3 = findViewById(R.id.thirdRowMatcher);
        columnMatcher1 = findViewById(R.id.firstColumnMatcher);
        columnMatcher2 = findViewById(R.id.secondColumnMatcher);
        columnMatcher3 = findViewById(R.id.thirdColumnMatcher);
        leftToRight = findViewById(R.id.leftToRightMatcher);
        rightToLeft = findViewById(R.id.rightToLeftMatcher);

        score_of_A = findViewById(R.id.ScoreA);
        score_of_B = findViewById(R.id.ScoreB);

        Reset = findViewById(R.id.Reset);

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_x11.setImageDrawable(null);
                btn_x12.setImageDrawable(null);
                btn_x13.setImageDrawable(null);
                btn_x21.setImageDrawable(null);
                btn_x22.setImageDrawable(null);
                btn_x23.setImageDrawable(null);
                btn_x31.setImageDrawable(null);
                btn_x32.setImageDrawable(null);
                btn_x33.setImageDrawable(null);
                resetValues();
                a_score_Count = 0;
                b_score_Count = 0;
                score_of_A.setText("Score of A = " + String.valueOf(a_score_Count));
                score_of_B.setText("Score of B = " + String.valueOf(b_score_Count));
            }
        });

        btn_x11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slot1 == 0) {
                    ///if Slot 1 is empty
                    if (startGame.equals("A")) {
                        btn_x11.setImageResource(R.drawable.re_cross);
                        x11 = 1;///"1" means it click contains "A"(to check the winning method)
                        i++;
                        slot1 = 1;///Slot 1 is filled with a value
                    } else {
                        btn_x11.setImageResource(R.drawable.blue_circle);
                        x11 = 0;///"0" means it click contains "B"(to check the winning method)
                        i++;
                        slot1 = 1;///Slot 1 is filled with a value
                    }
                    choosePlayer();
                    winningGame();

                } else {
                    ///if Slot 1 is not empty
                    Toast.makeText(MainActivity.this, "Slot is Already Taken ! Choose Another One", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_x12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slot2 == 0) {
                    if (startGame.equals("A")) {
                        btn_x12.setImageResource(R.drawable.re_cross);
                        x12 = 1;
                        i++;
                        slot2 = 1;
                    } else {
                        btn_x12.setImageResource(R.drawable.blue_circle);
                        x12 = 0;
                        i++;
                        slot2 = 1;
                    }
                    choosePlayer();
                    winningGame();

                } else {
                    Toast.makeText(MainActivity.this, "Slot is Already Taken ! Choose Another One", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn_x13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slot3 == 0) {
                    if (startGame.equals("A")) {
                        btn_x13.setImageResource(R.drawable.re_cross);
                        x13 = 1;
                        i++;
                        slot3 = 1;
                    } else {
                        btn_x13.setImageResource(R.drawable.blue_circle);
                        x13 = 0;
                        i++;
                        slot3 = 1;
                    }
                    choosePlayer();
                    winningGame();

                } else {
                    Toast.makeText(MainActivity.this, "Slot is Already Taken ! Choose Another One", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_x21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slot4 == 0) {
                    if (startGame.equals("A")) {
                        btn_x21.setImageResource(R.drawable.re_cross);
                        x21 = 1;
                        i++;
                        slot4 = 1;
                    } else {
                        btn_x21.setImageResource(R.drawable.blue_circle);
                        x21 = 0;
                        i++;
                        slot4 = 1;
                    }
                    choosePlayer();
                    winningGame();
                } else {
                    Toast.makeText(MainActivity.this, "Slot is Already Taken ! Choose Another One", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_x22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slot5 == 0) {
                    if (startGame.equals("A")) {
                        btn_x22.setImageResource(R.drawable.re_cross);
                        x22 = 1;
                        i++;
                        slot5 = 1;
                    } else {
                        btn_x22.setImageResource(R.drawable.blue_circle);
                        x22 = 0;
                        i++;
                        slot5 = 1;
                    }
                    choosePlayer();
                    winningGame();

                } else {
                    Toast.makeText(MainActivity.this, "Slot is Already Taken ! Choose Another One", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_x23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slot6 == 0) {
                    if (startGame.equals("A")) {
                        btn_x23.setImageResource(R.drawable.re_cross);
                        x23 = 1;
                        i++;
                        slot6 = 1;
                    } else {
                        btn_x23.setImageResource(R.drawable.blue_circle);
                        x23 = 0;
                        i++;
                        slot6 = 1;
                    }
                    choosePlayer();
                    winningGame();
                } else {
                    Toast.makeText(MainActivity.this, "Slot is Already Taken ! Choose Another One", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_x31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slot7 == 0) {
                    if (startGame.equals("A")) {
                        btn_x31.setImageResource(R.drawable.re_cross);
                        x31 = 1;
                        i++;
                        slot7 = 1;
                    } else {
                        btn_x31.setImageResource(R.drawable.blue_circle);
                        x31 = 0;
                        i++;
                        slot7 = 1;
                    }
                    choosePlayer();
                    winningGame();
                } else {
                    Toast.makeText(MainActivity.this, "Slot is Already Taken ! Choose Another One", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_x32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slot8 == 0) {
                    if (startGame.equals("A")) {
                        btn_x32.setImageResource(R.drawable.re_cross);
                        x32 = 1;
                        i++;
                        slot8 = 1;
                    } else {
                        btn_x32.setImageResource(R.drawable.blue_circle);
                        x32 = 0;
                        i++;
                        slot8 = 1;
                    }
                    choosePlayer();
                    winningGame();
                } else {
                    Toast.makeText(MainActivity.this, "Slot is Already Taken ! Choose Another One", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_x33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slot9 == 0) {
                    if (startGame.equals("A")) {
                        btn_x33.setImageResource(R.drawable.re_cross);
                        x33 = 1;
                        i++;
                        slot9 = 1;
                    } else {
                        btn_x33.setImageResource(R.drawable.blue_circle);
                        x33 = 0;
                        i++;
                        slot9 = 1;
                    }
                    choosePlayer();
                    winningGame();
                } else {
                    Toast.makeText(MainActivity.this, "Slot is Already Taken ! Choose Another One", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void winningGame() {
        if ((x11 == 1) && (x12 == 1) && (x13 == 1)) {
            rowMatcher1.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player A Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rowMatcher1.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            a_score_Count++;
            score_of_A.setText("Score of A = " + String.valueOf(a_score_Count));

        } else if ((x21 == 1) && (x22 == 1) && (x23 == 1)) {
            rowMatcher2.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player A Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rowMatcher2.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            a_score_Count++;
            score_of_A.setText("Score of A = " + String.valueOf(a_score_Count));

        } else if ((x31 == 1) && (x32 == 1) && (x33 == 1)) {

            rowMatcher3.setVisibility(View.VISIBLE);

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player A Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rowMatcher3.setVisibility(View.INVISIBLE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            a_score_Count++;
            score_of_A.setText("Score of A = " + String.valueOf(a_score_Count));

        } else if ((x11 == 1) && (x21 == 1) && (x31 == 1)) {
            columnMatcher1.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player A Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    columnMatcher1.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            a_score_Count++;
            score_of_A.setText("Score of A = " + String.valueOf(a_score_Count));

        } else if ((x12 == 1) && (x22 == 1) && (x32 == 1)) {
            columnMatcher2.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player A Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    columnMatcher2.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            a_score_Count++;
            score_of_A.setText("Score of A = " + String.valueOf(a_score_Count));

        } else if ((x13 == 1) && (x23 == 1) && (x33 == 1)) {
            columnMatcher3.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player A Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    columnMatcher3.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            a_score_Count++;
            score_of_A.setText("Score of A = " + String.valueOf(a_score_Count));

        } else if ((x11 == 1) && (x22 == 1) && (x33 == 1)) {
            leftToRight.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player A Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    leftToRight.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            a_score_Count++;
            score_of_A.setText("Score of A = " + String.valueOf(a_score_Count));

        } else if ((x13 == 1) && (x22 == 1) && (x31 == 1)) {
            rightToLeft.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player A Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rightToLeft.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            a_score_Count++;
            score_of_A.setText("Score of A = " + String.valueOf(a_score_Count));

        } else if ((x11 == 0) && (x12 == 0) && (x13 == 0)) {
            rowMatcher1.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player B Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rowMatcher1.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            b_score_Count++;
            score_of_B.setText("Score of B = " + String.valueOf(b_score_Count));

        } else if ((x21 == 0) && (x22 == 0) && (x23 == 0)) {
            rowMatcher2.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player B Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rowMatcher2.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            b_score_Count++;
            score_of_B.setText("Score of B = " + String.valueOf(b_score_Count));

        } else if ((x31 == 0) && (x32 == 0) && (x33 == 0)) {
            rowMatcher3.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player B Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rowMatcher3.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            b_score_Count++;
            score_of_B.setText("Score of B = " + String.valueOf(b_score_Count));

        } else if ((x11 == 0) && (x21 == 0) && (x31 == 0)) {
            columnMatcher1.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player B Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    columnMatcher1.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            b_score_Count++;
            score_of_B.setText("Score of B = " + String.valueOf(b_score_Count));

        } else if ((x12 == 0) && (x22 == 0) && (x32 == 0)) {
            columnMatcher2.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player B Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    columnMatcher2.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            b_score_Count++;
            score_of_B.setText("Score of B = " + String.valueOf(b_score_Count));

        } else if ((x13 == 0) && (x23 == 0) && (x33 == 0)) {
            columnMatcher3.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player B Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    columnMatcher3.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            b_score_Count++;
            score_of_B.setText("Score of B = " + String.valueOf(b_score_Count));

        } else if ((x11 == 0) && (x22 == 0) && (x33 == 0)) {
            leftToRight.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player B Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    leftToRight.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            b_score_Count++;
            score_of_B.setText("Score of B = " + String.valueOf(b_score_Count));

        } else if ((x13 == 0) && (x22 == 0) && (x31 == 0)) {
            rightToLeft.setVisibility(View.VISIBLE);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("CONGRATUALTIONS ! Player B Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rightToLeft.setVisibility(View.GONE);
                    btn_x11.setImageDrawable(null);
                    btn_x12.setImageDrawable(null);
                    btn_x13.setImageDrawable(null);
                    btn_x21.setImageDrawable(null);
                    btn_x22.setImageDrawable(null);
                    btn_x23.setImageDrawable(null);
                    btn_x31.setImageDrawable(null);
                    btn_x32.setImageDrawable(null);
                    btn_x33.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            b_score_Count++;
            score_of_B.setText("Score of B = " + String.valueOf(b_score_Count));

        }

        ////any of the above cases not run and the value of i reached to 9 then draw
        else {
            if (i == 9) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(":(  Draw Match ! Better Luck Next Time !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btn_x11.setImageDrawable(null);
                        btn_x12.setImageDrawable(null);
                        btn_x13.setImageDrawable(null);
                        btn_x21.setImageDrawable(null);
                        btn_x22.setImageDrawable(null);
                        btn_x23.setImageDrawable(null);
                        btn_x31.setImageDrawable(null);
                        btn_x32.setImageDrawable(null);
                        btn_x33.setImageDrawable(null);
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
    }

    private void choosePlayer() {
        if (startGame.equals("A")) {
            startGame = "B";
        } else {
            startGame = "A";
        }
    }

    private void resetValues() {
        x11 = 5;
        x12 = 5;
        x13 = 5;
        x21 = 5;
        x22 = 5;
        x23 = 5;
        x31 = 5;
        x32 = 5;
        x33 = 5;

        i = 0;

        slot1 = 0;
        slot2 = 0;
        slot3 = 0;
        slot4 = 0;
        slot5 = 0;
        slot6 = 0;
        slot7 = 0;
        slot8 = 0;
        slot9 = 0;
    }
}