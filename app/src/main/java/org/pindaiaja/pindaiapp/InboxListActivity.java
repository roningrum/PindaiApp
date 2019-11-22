package org.pindaiaja.pindaiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import org.pindaiaja.pindaiapp.data.InboxDataDummy;
import org.pindaiaja.pindaiapp.model.Inbox;

import java.util.ArrayList;

public class InboxListActivity extends AppCompatActivity {
    private RecyclerView rvInboxMessages;
    private InboxAdapter inboxAdapter;
    private ArrayList<Inbox> inboxes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox_list);

        rvInboxMessages = findViewById(R.id.rv_item);
        rvInboxMessages.setLayoutManager(new LinearLayoutManager(this));
        inboxAdapter = new InboxAdapter(inboxes);
        inboxAdapter.setInboxes(InboxDataDummy.getDummyInbox());
        rvInboxMessages.setAdapter(inboxAdapter);
        rvInboxMessages.setHasFixedSize(true);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(rvInboxMessages.getContext(), DividerItemDecoration.VERTICAL);
        rvInboxMessages.addItemDecoration(dividerItemDecoration);

        inboxAdapter.setInboxItemCallback(new InboxItemCallback() {
            @Override
            public void onItemCallback(Inbox inbox) {
                Intent intent = new Intent(InboxListActivity.this, InboxDetailActivity.class);
                intent.putExtra(InboxDetailActivity.EXTRA_INBOX, inbox);
                startActivity(intent);
            }
        });
    }
}
