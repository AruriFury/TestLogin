package comscisdu.weerawich.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogonActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    String nameString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logon);

        textView = findViewById(R.id.textView2);
        button = findViewById(R.id.button2);
        nameString = getIntent().getStringExtra("Name");
        textView.setText("ยินดีต้อนรับ " + nameString);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbIntent = new Intent(Intent.ACTION_VIEW);
                fbIntent.setData(Uri.parse("https://www.facebook.com/beaching.01/"));
                startActivity(fbIntent);
            }
        });
    }
}