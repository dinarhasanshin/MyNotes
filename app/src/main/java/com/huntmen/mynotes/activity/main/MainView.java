package com.huntmen.mynotes.activity.main;

import com.huntmen.mynotes.model.Note;

import java.util.List;

public interface MainView {
    void showLoading();
    void hideLoading();
    void onGetResult(List<Note> notes);
    void onErrorLoading(String message);

}
