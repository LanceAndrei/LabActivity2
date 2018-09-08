package lance.wico.com.wicolancelab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.relative_layout);
        //setContentView(R.layout.linears_layout);

        //CONSTRAINT
        Button moveButton = (Button) findViewById(R.id.moveConstraint);
        Button moveButton1 = (Button) findViewById(R.id.moveLinear);
        Button moveButton2 = (Button) findViewById(R.id.moveRelative);


        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveSecond = new Intent(getApplicationContext(), constraintActivity.class);
                startActivity(moveSecond);
            }



        });

        //LINEAR
        moveButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveSecond = new Intent(getApplicationContext(), linearActivity.class);
                startActivity(moveSecond);
            }



        });

        //RELATIVE
        moveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveSecond = new Intent(getApplicationContext(), relativeActivity.class);
                startActivity(moveSecond);
            }



        });

    }
}
