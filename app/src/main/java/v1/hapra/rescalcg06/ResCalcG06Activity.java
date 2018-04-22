package v1.hapra.rescalcg06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResCalcG06Activity extends AppCompatActivity {

    private Button btn;
    private TextView text = null;

    private int first_row;
    private int second_row;
    private int third_row;
    private String multi;
    private String tol;
    private String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_calc_g06);
    }

    public void fr_brown(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_brown));
        first_row = 1;
        updateStatus();
    }

    public void fr_red(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_red));
        first_row = 2;
        updateStatus();
    }

    public void fr_orange(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_orange));
        first_row = 3;
        updateStatus();
    }

    public void fr_yellow(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_yellow));
        first_row = 4;
        updateStatus();
    }

    public void fr_green(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_green));
        first_row = 5;
        updateStatus();
    }

    public void fr_blue(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_blue));
        first_row = 6;
        updateStatus();
    }

    public void fr_violet(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_violet));
        first_row = 7;
        updateStatus();
    }

    public void fr_grey(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_grey));
        first_row = 8;
        updateStatus();
    }

    public void fr_white(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_white));
        first_row = 9;
        updateStatus();
    }

    public void sr_black(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_black));
        second_row = 0;
        updateStatus();
    }

    public void sr_brown(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_brown));
        second_row = 1;
        updateStatus();
    }

    public void sr_red(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_red));
        second_row = 2;
        updateStatus();
    }

    public void sr_orange(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_orange));
        second_row = 3;
        updateStatus();
    }

    public void sr_yellow(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_yellow));
        second_row = 4;
        updateStatus();
    }

    public void sr_green(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_green));
        second_row = 5;
        updateStatus();
    }

    public void sr_blue(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_blue));
        second_row = 6;
        updateStatus();
    }

    public void sr_violet(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_violet));
        second_row = 7;
        updateStatus();
    }

    public void sr_grey(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_grey));
        second_row = 8;
        updateStatus();
    }

    public void sr_white(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_white));
        second_row = 9;
        updateStatus();
    }

    public void tr_black(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_black));
        third_row = 0;
        updateStatus();
    }

    public void tr_brown(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_brown));
        third_row = 1;
        updateStatus();
    }

    public void tr_red(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_red));
        third_row = 2;
        updateStatus();
    }

    public void tr_orange(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_orange));
        third_row = 3;
        updateStatus();
    }

    public void tr_yellow(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_yellow));
        third_row = 4;
        updateStatus();
    }

    public void tr_green(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_green));
        third_row = 5;
        updateStatus();
    }

    public void tr_blue(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_blue));
        third_row = 6;
        updateStatus();
    }

    public void tr_violet(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_violet));
        third_row = 7;
        updateStatus();
    }

    public void tr_grey(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_grey));
        third_row = 8;
        updateStatus();
    }

    public void tr_white(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_white));
        third_row = 9;
        updateStatus();
    }

    public void multi_silver(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_silver));
        multi = getResources().getString(R.string.multi_silver);
        updateStatus();
    }

    public void multi_gold(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_gold));
        multi = getResources().getString(R.string.multi_gold);
        updateStatus();
    }

    public void multi_black(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_black));
        multi = getResources().getString(R.string.multi_black);
        updateStatus();
    }

    public void multi_brown(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_brown));
        multi = getResources().getString(R.string.multi_brown);
        updateStatus();
    }

    public void multi_red(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_red));
        multi = getResources().getString(R.string.multi_red);
        updateStatus();
    }

    public void multi_orange(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_orange));
        multi = getResources().getString(R.string.multi_orange);
        updateStatus();
    }

    public void multi_yellow(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_yellow));
        multi = getResources().getString(R.string.multi_yellow);
        updateStatus();
    }

    public void multi_green(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_green));
        multi = getResources().getString(R.string.multi_green);
        updateStatus();
    }

    public void multi_blue(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_blue));
        multi = getResources().getString(R.string.multi_blue);
        updateStatus();
    }

    public void multi_violet(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_violet));
        multi = getResources().getString(R.string.multi_violet);
        updateStatus();
    }

    public void multi_grey(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_grey));
        multi = getResources().getString(R.string.multi_grey);
        updateStatus();
    }

    public void multi_white(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_white));
        multi = getResources().getString(R.string.multi_white);
        updateStatus();
    }

    public void tol_silver(View view){
        btn = findViewById(R.id.tol_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_silver));
        tol = getResources().getString(R.string.tol_silver);
        updateStatus();
    }

    public void tol_gold(View view){
        btn = findViewById(R.id.tol_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_gold));
        tol = getResources().getString(R.string.tol_gold);
        updateStatus();
    }

    public void tol_brown(View view){
        btn = findViewById(R.id.tol_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_brown));
        tol = getResources().getString(R.string.tol_brown);
        updateStatus();
    }

    public void tol_red(View view){
        btn = findViewById(R.id.tol_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_red));
        tol = getResources().getString(R.string.tol_red);
        updateStatus();
    }

    public void tol_green(View view){
        btn = findViewById(R.id.tol_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_green));
        tol = getResources().getString(R.string.tol_green);
        updateStatus();
    }

    public void tol_blue(View view){
        btn = findViewById(R.id.tol_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_blue));
        tol = getResources().getString(R.string.tol_blue);
        updateStatus();
    }

    public void tol_violet(View view){
        btn = findViewById(R.id.tol_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_violet));
        tol = getResources().getString(R.string.tol_violet);
        updateStatus();
    }

    public void tol_grey(View view){
        btn = findViewById(R.id.tol_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_grey));
        tol = getResources().getString(R.string.tol_grey);
        updateStatus();
    }

    public void temp_brown(View view){
        btn = findViewById(R.id.temp_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_brown));
        temp = getResources().getString(R.string.temp_brown);
        updateStatus();
    }

    public void temp_red(View view){
        btn = findViewById(R.id.temp_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_red));
        temp = getResources().getString(R.string.temp_red);
        updateStatus();
    }

    public void temp_orange(View view){
        btn = findViewById(R.id.temp_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_orange));
        temp = getResources().getString(R.string.temp_brown);
        updateStatus();
    }

    public void temp_yellow(View view){
        btn = findViewById(R.id.temp_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_yellow));
        temp = getResources().getString(R.string.temp_yellow);
        updateStatus();
    }

    public void temp_blue(View view){
        btn = findViewById(R.id.temp_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_blue));
        temp = getResources().getString(R.string.temp_blue);
        updateStatus();
    }

    public void temp_violet(View view){
        btn = findViewById(R.id.temp_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_violet));
        temp = getResources().getString(R.string.temp_violet);
        updateStatus();
    }

    public void temp_white(View view){
        btn = findViewById(R.id.temp_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_white));
        temp = getResources().getString(R.string.temp_white);
        updateStatus();
    }

    public void reset_fr(View view){
        btn = findViewById(R.id.fr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_calc_background));
        first_row = 0;
        updateStatus();
    }

    public void reset_sr(View view){
        btn = findViewById(R.id.sr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_calc_background));
        second_row = 0;
        updateStatus();
    }

    public void reset_tr(View view){
        btn = findViewById(R.id.tr_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_calc_background));
        third_row = 0;
        updateStatus();
    }

    public void reset_multi(View view){
        btn = findViewById(R.id.multi_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_calc_background));
        multi = "";
        updateStatus();
    }

    public void reset_tol(View view){
        btn = findViewById(R.id.tol_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_calc_background));
        tol = "";
        updateStatus();
    }

    public void reset_temp(View view){
        btn = findViewById(R.id.temp_stat);
        btn.setBackgroundColor(getResources().getColor(R.color.res_calc_background));
        temp = "";
        updateStatus();
    }

    private void updateStatus(){
        if(text == null)
            text = findViewById(R.id.textView);
        String status = first_row + second_row + third_row + multi + tol + temp;
        text.setText(status);
    }
}
