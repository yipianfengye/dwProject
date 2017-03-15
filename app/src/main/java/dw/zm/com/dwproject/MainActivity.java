package dw.zm.com.dwproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button buttonSearch = null;
    LinearLayout linearContent = null;
    LinearLayout item1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initLayoutView();
    }

    private void initLayoutView() {
        buttonSearch = (Button) findViewById(R.id.buttonSearch);
        linearContent = (LinearLayout) findViewById(R.id.linearContent);
        item1 = (LinearLayout) findViewById(R.id.item1);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearContent.setVisibility(View.VISIBLE);
            }
        });

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DetailActivity.class));
            }
        });
    }
}
