package com.example.case22_recyclerview_chat;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRecycler extends RecyclerView.Adapter {

    private List<DataChat> msgList;
    private final LayoutInflater mInflater;

    public AdapterRecycler(Context context, List<DataChat> messageList) {
        mInflater = LayoutInflater.from(context);
        msgList = messageList;
    }

    @Override
    public int getItemCount() {
        return msgList.size();
    }

    // Determines the appropriate ViewType according to the sender of the message.
    @Override
    public int getItemViewType(int position) {
        DataChat message = msgList.get(position);
        Log.e("tag", message.getContent());

        if (message.getType() == DataChat.TYPE_RECEIVED) {
            return DataChat.TYPE_RECEIVED;
        } else {
            return DataChat.TYPE_SENT;
        }
    }

    // Inflates the appropriate layout according to the ViewType.
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        if (viewType == DataChat.TYPE_SENT) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_send, parent, false);
            return new ViewHolderSend(view);
        } else if (viewType == DataChat.TYPE_RECEIVED) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_receive, parent, false);
            return new ViewHolderReceive(view);
        }
        return null;
    }

    // Passes the message object to a ViewHolder so that the contents can be bound to UI.
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DataChat message = msgList.get(position);

        switch (holder.getItemViewType()) {
            case DataChat.TYPE_SENT:
                //((SentMessageHolder) holder).bind(message);
                ((ViewHolderSend) holder).bind(message);
                break;
            case DataChat.TYPE_RECEIVED:
                ((ViewHolderReceive) holder).bind(message);
        }
    }

    private class ViewHolderSend extends RecyclerView.ViewHolder {
        TextView sendText;

        ViewHolderSend(View itemView) {
            super(itemView);
            sendText = itemView.findViewById(R.id.right_msg);
        }

        void bind(DataChat message) {
            sendText.setText(message.getContent());
        }
    }

    private class ViewHolderReceive extends RecyclerView.ViewHolder {
        TextView receiveText;

        ViewHolderReceive(View itemView) {
            super(itemView);
            receiveText = itemView.findViewById(R.id.left_msg);
        }

        void bind(DataChat message) {
            receiveText.setText(message.getContent());
        }
    }
}