package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangeAdmin extends AppCompatActivity {

    private EditText adminUsernameEditText;
    private EditText adminPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_admin);

        adminUsernameEditText = findViewById(R.id.admin_username_edit_text);
        adminPasswordEditText = findViewById(R.id.admin_url_edit_text);

        Button saveButton = findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveAdminCredentials();
            }
        });

        Button cancelButton = findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void saveAdminCredentials() {
        String adminUsername = adminUsernameEditText.getText().toString();
        String adminPassword = adminPasswordEditText.getText().toString();

        // TODO: Save admin credentials to a database or SharedPreferences

        Toast.makeText(this, "Admin credentials saved", Toast.LENGTH_SHORT).show();
        finish();
    }
}
