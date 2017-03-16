package com.example.paulius.hsquiz;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GoblinsActivity extends AppCompatActivity {

    private GoblinsQuestionLibrary goblinsQuestionLibrary = new GoblinsQuestionLibrary();
    private RankLibrary rankLibrary = new RankLibrary();
    private TextView Question;
    private Button Choice1;
    private Button Choice2;
    private Button Choice3;
    private Button Choice4;
    private ImageView Photo;
    private ImageView RankPhoto;
    private ImageView BestRankPhoto;
    private Button Back;
    DatabaseHelper MYdb;

    private String Answer;
    private int Questionnumber = 0;
    private int Score = 25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    setTitle("Goblins Vs Gnomes");
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                         WindowManager.LayoutParams.FLAG_FULLSCREEN);

    setContentView(R.layout.activity_basics);

    MYdb= new DatabaseHelper(this);

    Question = (TextView)findViewById(R.id.questionarea);
    Choice1 = (Button)findViewById(R.id.button1);
    Choice2 = (Button)findViewById(R.id.button2);
    Choice3 = (Button)findViewById(R.id.button3);
    Choice4 = (Button)findViewById(R.id.button4);
    Photo = (ImageView)findViewById(R.id.imageView2);

    updateQuestion();


    Choice1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Choice1.getText()== Answer){
                Score = Score - 1;
                updateQuestion();

            }else {
                if (Score  < 20)
                    Score = Score +1;
                updateQuestion();

            }
        }
    });
    Choice2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Choice2.getText()== Answer){
                Score = Score - 1;
                updateQuestion();
            }else {
                if (Score  < 20)
                    Score = Score +1;
                updateQuestion();
            }
        }
    });
    Choice3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Choice3.getText()== Answer){
                Score = Score - 1;
                updateQuestion();
            }else {
                if (Score  < 20)
                    Score = Score +1;
                updateQuestion();
            }
        }
    });
    Choice4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Choice4.getText()== Answer){
                Score = Score - 1;
                updateQuestion();
            }else {
                if (Score  < 20)
                    Score = Score +1;
                updateQuestion();
            }
        }
    });
}
    private void updateQuestion(){
        if (Questionnumber == 4){
            Choice1.setTextSize(11);
            Choice2.setTextSize(11);
            Choice3.setTextSize(11);
            Choice4.setTextSize(11);
        }else {
            Choice1.setTextSize(14);
            Choice2.setTextSize(14);
            Choice3.setTextSize(14);
            Choice4.setTextSize(14);
        }
        Question.setText(goblinsQuestionLibrary.GetQuestion(Questionnumber));
        Choice1.setText(goblinsQuestionLibrary.getChoices1(Questionnumber));
        Choice2.setText(goblinsQuestionLibrary.getChoices2(Questionnumber));
        Choice3.setText(goblinsQuestionLibrary.getChoices3(Questionnumber));
        Choice4.setText(goblinsQuestionLibrary.getChoices4(Questionnumber));
        Photo.setImageResource(goblinsQuestionLibrary.GetPhoto(Questionnumber));
        Answer = goblinsQuestionLibrary.getAnwer(Questionnumber);
        Questionnumber++;
        if (Questionnumber == goblinsQuestionLibrary.GetSize()) {
            setContentView(R.layout.activity_rank);
            RankPhoto = (ImageView)findViewById(R.id.imageView);
            BestRankPhoto = (ImageView)findViewById(R.id.imageView1);
            Back = (Button)findViewById(R.id.button5);

            final Intent allstages = new Intent(this, AllStages.class);

            RankPhoto.setImageResource(rankLibrary.GetPhoto(Score));
            Cursor res = MYdb.gvg();
            res.moveToFirst();
            if (Score < Integer.parseInt(res.getString(0))) {
                MYdb.Update("GVG", String.valueOf(Score));
            }
            BestRankPhoto.setImageResource(rankLibrary.GetPhoto(Integer.parseInt(res.getString(0))));
            Back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(allstages);
                    finish();
                }
            });


        }
    }
}
