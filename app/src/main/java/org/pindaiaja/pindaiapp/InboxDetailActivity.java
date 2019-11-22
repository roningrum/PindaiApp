package org.pindaiaja.pindaiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import org.pindaiaja.pindaiapp.model.Inbox;

public class InboxDetailActivity extends AppCompatActivity {
    public static final String EXTRA_INBOX = "myInbox";

    private TextView tvSubject;
    private TextView tvSender;
    private TextView tvMessage;
    private TextView tvTime;
    private Toolbar toolbar;

    private ImageView imgSender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox_detail);
        tvSubject = findViewById(R.id.tv_subject_detail);
        tvSender = findViewById(R.id.tv_sender_detail);
        tvMessage = findViewById(R.id.tv_message_detail);
        tvTime = findViewById(R.id.tv_time_receive_detail);
        imgSender = findViewById(R.id.img_profile_detail);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }
        showInBoxDetail();
    }

    private void showInBoxDetail() {
        Inbox inbox = getIntent().getParcelableExtra(EXTRA_INBOX);
        if(inbox != null){
            tvSubject.setText(inbox.getSubject());
            tvMessage.setText(inbox.getMessage());
            tvTime.setText(inbox.getTime());
            tvSender.setText(inbox.getName());
            imgSender.setImageResource(inbox.getPhoto());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
