package kr.ac.ssu.kjminn.mirimlayouttest2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout linear1 = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                                                            LinearLayout.LayoutParams.MATCH_PARENT);
        linear1.setBackgroundColor(Color.rgb(181, 178, 255));
        linear1.setOrientation(LinearLayout.VERTICAL);

        Button btn = new Button(this);
        btn.setText("클릭해 보세요~");
        btn.setBackgroundColor(Color.rgb(128, 65, 217));
        btn.setTextColor(Color.WHITE);
        linear1.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

        setContentView(linear1, params);
    }
}