package app.simple.simpleappforlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mFirstButton;
    private Button mSecondButton;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        mTextView = (TextView) findViewById(R.id.tv);

        mFirstButton  = (Button) findViewById(R.id.first_button);
        mSecondButton = (Button) findViewById(R.id.second_button);

        mFirstButton.setOnClickListener(this);
        mSecondButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // notice that we have two button, so we need to check button by id
        switch(v.getId()){
            case R.id.first_button:
                // we set the ButtonText in the textView
                mTextView.setText(mFirstButton.getText().toString());
                break;
            case R.id.second_button:
                // we set the ButtonText in the textView
                mTextView.setText(mSecondButton.getText().toString());
                break;
        }
    }
}
