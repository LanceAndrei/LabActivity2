package lance.wico.com.wicolancelab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class constraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button exitButton = (Button) findViewById(R.id.backMenu);


        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveSecond = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(moveSecond);
            }



        });



        Button nextButt = (Button) findViewById(R.id.nextButton);


        nextButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveSecond = new Intent(getApplicationContext(), linearActivity.class);
                startActivity(moveSecond);
            }



        });
    }
}
