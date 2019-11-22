package org.pindaiaja.pindaiapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.pindaiaja.pindaiapp.model.Inbox;

import java.util.ArrayList;

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.InboxHolder>{
    private ArrayList<Inbox> inboxes;
    private InboxItemCallback inboxItemCallback;

    public InboxAdapter(ArrayList<Inbox> inboxes) {
        this.inboxes = inboxes;
    }

    public void setInboxes(ArrayList<Inbox> inboxes) {
        this.inboxes = inboxes;
    }

    public void setInboxItemCallback(InboxItemCallback inboxItemCallback) {
        this.inboxItemCallback = inboxItemCallback;
    }

    @NonNull
    @Override
    public InboxAdapter.InboxHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InboxHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inbox, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull InboxAdapter.InboxHolder holder, int position) {
        holder.bindToItem(inboxes.get(position));
    }

    @Override
    public int getItemCount() {
        return inboxes.size();
    }



    class InboxHolder extends RecyclerView.ViewHolder {
        private TextView tvSender;
        private TextView tvSubject;
        private TextView tvCaption;
        private TextView tvTime;
        private ImageView imgSender;

        InboxHolder(@NonNull View itemView) {
            super(itemView);
            tvSender = itemView.findViewById(R.id.tv_sender_detail);
            tvSubject = itemView.findViewById(R.id.tv_subject_detail);
            tvCaption = itemView.findViewById(R.id.tv_caption);
            tvTime = itemView.findViewById(R.id.tv_time_receive);
            imgSender = itemView.findViewById(R.id.img_profile_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inboxItemCallback.onItemCallback(inboxes.get(getAdapterPosition()));
                }
            });
        }

        void bindToItem(Inbox inbox){
            tvSender.setText(inbox.getName());
            tvSubject.setText(inbox.getSubject());
            tvCaption.setText(inbox.getMessage());
            tvTime.setText(inbox.getTime());
            imgSender.setImageResource(inbox.getPhoto());
        }
    }
}
