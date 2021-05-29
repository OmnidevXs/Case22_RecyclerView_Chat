package com.example.case22_recyclerview_chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView        mRecyclerView;
    private AdapterRecycler mAdapter;
    private EditText            inputText;
    private List<DataChat> msgList = new ArrayList<DataChat>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText   = findViewById(R.id.edit_text_input);
        Button send = findViewById(R.id.button_send);
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        initMsgs();         //feed the data

        mAdapter = new AdapterRecycler(this, msgList);
        mRecyclerView.setAdapter(mAdapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String content = inputText.getText().toString();
                if (!"".equals(content)) {
                    DataChat msg1 = new DataChat(content, DataChat.TYPE_SENT);
                    DataChat msg2 = new DataChat("If you build it, he will come.", DataChat.TYPE_RECEIVED);
                    msgList.add(msg1);
                    msgList.add(msg2);
                    //mAdapter.notifyDataSetChanged(); // refresh the whole View when new messages coming
                    mAdapter.notifyItemInserted(msgList.size()-1); // refresh only new item
                    mRecyclerView.scrollToPosition(msgList.size()-1);
                    inputText.setText("");
                }
            }
        });
    }

    private void initMsgs() {
        DataChat msg1 = new DataChat("Fasten your seatbelts. It's going to be a bumpy night.", DataChat.TYPE_RECEIVED);
        msgList.add(msg1);
    }
}