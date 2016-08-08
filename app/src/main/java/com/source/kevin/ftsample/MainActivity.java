package com.source.kevin.ftsample;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.source.kevin.ftsample.clip.Clipboard;
import com.source.kevin.ftsample.popup.PopPresenter;
import com.source.kevin.ftsample.popup.PopView;

public class MainActivity extends AppCompatActivity implements ClipboardManager.OnPrimaryClipChangedListener {

    Clipboard clipboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clipboard = Clipboard.getInstance();
        clipboard.setPrimaryClipChangedListener(this);
    }

    @Override
    public void onPrimaryClipChanged() {

        String text = clipboard.getText();
        Log.e("Text", "粘贴板的内容是:" + text);
        PopView view = new PopView(FingerApp.get());
        PopPresenter popPresenter = new PopPresenter(view);
        popPresenter.translate(text);
    }
}
