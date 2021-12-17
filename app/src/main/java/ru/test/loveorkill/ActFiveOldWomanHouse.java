package ru.test.loveorkill;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActFiveOldWomanHouse extends AppCompatActivity {

    TableFiveOldWomanHouse tableFiveOldWomanHouse = new TableFiveOldWomanHouse();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public ImageView imageView2;
    public TextView textView3;
    public TextView textView4;
    public Button ActFiveTellWifeButton;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public TextView textView9;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public Button ActFiveRunButton;
    public int line=0;
    public int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_five_old_woman_house);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final Button ActFiveTellWifeButton = (Button)findViewById(R.id.ActFiveTellWifeButton);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final Button ActFiveRunButton = (Button)findViewById(R.id.ActFiveRunButton);

        textView1.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[0]);
        textView3.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[2]);
        textView4.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[3]);
        textView6.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[5]);
        textView7.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[6]);
        textView8.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[7]);
        textView9.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[8]);
        textView10.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[9]);
        textView11.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[10]);
        textView12.setText(tableFiveOldWomanHouse.dialogFiveOldWomanHouse[11]);

        //Внизу будет код, который прячет текст

        textView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        ActFiveTellWifeButton.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        ActFiveRunButton.setVisibility(View.INVISIBLE);

        //Наверху код, который прячет текст

        //Команда, которая запускает AsyncTask
        delay.execute();

    }

    //кнопка "Назад", которая закрывает игру
    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay=null;
        try {
            Intent intent = new Intent(ActFiveOldWomanHouse.this, MainActivity.class);startActivity(intent);finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    // С этого места начинается код AsyncTask
    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params){
            while (line<=15){
                if(counter==0 & line==5){
                    line=5;
                } else{
                publishProgress(line++);
                try{
                    Thread.sleep(5000);
                    if (isCancelled()) return null;
                }catch(Exception e){}
            }}
            return null;
        }

        @Override
        protected void onProgressUpdate (Integer... values){
            final TextView textView1 = (TextView)findViewById(R.id.textView1);
            final ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
            final TextView textView3 = (TextView)findViewById(R.id.textView3);
            final TextView textView4 = (TextView)findViewById(R.id.textView4);
            final Button ActFiveTellWifeButton = (Button)findViewById(R.id.ActFiveTellWifeButton);
            final TextView textView6 = (TextView)findViewById(R.id.textView6);
            final TextView textView7 = (TextView)findViewById(R.id.textView7);
            final TextView textView8 = (TextView)findViewById(R.id.textView8);
            final TextView textView9 = (TextView)findViewById(R.id.textView9);
            final TextView textView10 = (TextView)findViewById(R.id.textView10);
            final TextView textView11 = (TextView)findViewById(R.id.textView11);
            final TextView textView12 = (TextView)findViewById(R.id.textView12);
            final Button ActFiveRunButton = (Button)findViewById(R.id.ActFiveRunButton);

            final Animation a = AnimationUtils.loadAnimation(ActFiveOldWomanHouse.this, R.anim.alpha);

            switch(line){
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a); break;
                case 2: imageView2.setVisibility(View.VISIBLE); imageView2.startAnimation(a); break;
                case 3: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a); break;
                case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a); break;
                case 5:  ActFiveTellWifeButton.setVisibility(View.VISIBLE); ActFiveTellWifeButton.startAnimation(a);
                    ActFiveTellWifeButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                ActFiveTellWifeButton.setBackgroundColor(Color.parseColor("#56b1b5"));
                                counter=1;
                            } catch (Exception e){

                            }
                        }
                    });break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a); break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a); break;
                case 8: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a); break;
                case 9: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a); break;
                case 10: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a); break;
                case 11: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a); break;
                case 12: textView12.setVisibility(View.VISIBLE); textView12.startAnimation(a); break;
                case 13:  ActFiveRunButton.setVisibility(View.VISIBLE); ActFiveRunButton.startAnimation(a);
                    ActFiveRunButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                Intent intent = new Intent(ActFiveOldWomanHouse.this, ActSix.class);startActivity(intent);finish();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });break;
                default: break;

            }


        }

    }
    // На этом месте заканчивается код AsyncTask
}
