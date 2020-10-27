package comscisdu.weerawich.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;
    EditText passEditText;
    Button startButton;
    String nameString;
    String passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.edtName);
        passEditText = findViewById(R.id.edtPass);
        startButton = findViewById(R.id.button);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameString = nameEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();

                if ((nameString.length() == 0) || (passString.length() == 0)) {
                    Toast.makeText(getApplicationContext(), "กรุณาใส่ชื่อหรือพาสเวิร์ด", Toast.LENGTH_SHORT).show();
                } else if (!passString.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "พาสเวิร์ดไม่ถูกต้อง", Toast.LENGTH_SHORT).show();
                } else {
                    Intent startIntent = new Intent(MainActivity.this, LogonActivity.class);
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);
                }
            }
        });
    }

}