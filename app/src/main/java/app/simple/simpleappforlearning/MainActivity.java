package app.simple.simpleappforlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// When you implement the View.OnClickListener, you must to override onclick method (take a look in the last of this activity)
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.click_me);
        //setClick to button, but make attention that the interface view.OnClickListener has been implemented above
        // for avoid any error nullPointerException is highly recomanded to check if mButton is null
        if (mButton != null){
            mButton.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        // in this methode you can do any things you want hapend after click in mButton
        // in this case when click in the button we go in the nextActivity
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);

    }
}
