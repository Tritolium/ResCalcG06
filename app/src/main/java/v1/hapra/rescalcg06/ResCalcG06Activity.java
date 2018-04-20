package v1.hapra.rescalcg06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResCalcG06Activity extends AppCompatActivity {

    private Button btn;

    private int first_row;
    private int second_row;
    private Integer third_row = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_calc_g06);
    }

    public void fr_brown(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_brown));
        first_row = 1;
    }

    public void fr_red(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_red));
        first_row = 2;
    }

    public void fr_orange(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_orange));
        first_row = 3;
    }

    public void fr_yellow(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_yellow));
        first_row = 4;
    }

    public void fr_green(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_green));
        first_row = 5;
    }

    public void fr_blue(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_blue));
        first_row = 6;
    }

    public void fr_violet(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_violet));
        first_row = 7;
    }

    public void fr_grey(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_grey));
        first_row = 8;
    }

    public void fr_white(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_white));
        first_row = 9;
    }

    public void sr_black(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_black));
        second_row = 0;
    }

    public void sr_brown(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_brown));
        second_row = 1;
    }

    public void sr_red(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_red));
        second_row = 2;
    }

    public void sr_orange(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_orange));
        second_row = 3;
    }

    public void sr_yellow(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_yellow));
        second_row = 4;
    }

    public void sr_green(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_green));
        second_row = 5;
    }

    public void sr_blue(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_blue));
        second_row = 6;
    }

    public void sr_violet(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_violet));
        second_row = 7;
    }

    public void sr_grey(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_grey));
        second_row = 8;
    }

    public void sr_white(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_white));
        second_row = 9;
    }

    public void tr_black(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_black));
        third_row = 0;
    }

    public void tr_brown(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_brown));
        third_row = 1;
    }

    public void tr_red(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_red));
        third_row = 2;
    }

    public void tr_orange(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_orange));
        third_row = 3;
    }

    public void tr_yellow(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_yellow));
        third_row = 4;
    }

    public void tr_green(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_green));
        third_row = 5;
    }

    public void tr_blue(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_blue));
        third_row = 6;
    }

    public void tr_violet(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_violet));
        third_row = 7;
    }

    public void tr_grey(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_grey));
        third_row = 8;
    }

    public void tr_white(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_white));
        third_row = 9;
    }

    public void reset_fr(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_calc_background));
        first_row = 0;
    }

    public void reset_sr(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_calc_background));
        second_row = 0;
    }

    public void reset_tr(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_calc_background));
        third_row = 0;
    }
}
