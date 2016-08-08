package com.source.kevin.ftsample.popup;


import com.source.kevin.ftsample.data.TransInfo;
import com.source.kevin.ftsample.mvp.BasePresenter;
import com.source.kevin.ftsample.mvp.BaseView;

/**
 * the popup contract class
 */
public class PopContract {

    interface View extends BaseView<Presenter> {
        void showPopView(TransInfo info);

    }
    interface Presenter extends BasePresenter {
        void translate(String query);
    }
}
