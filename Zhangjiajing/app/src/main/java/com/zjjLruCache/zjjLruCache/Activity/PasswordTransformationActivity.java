package com.zjjLruCache.zjjLruCache.Activity;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/**
 * Created by zhangjiajing on 2016/7/26.
 * 密码有圆点变星号
 */
public class PasswordTransformationActivity extends PasswordTransformationMethod {
    @Override
    public CharSequence getTransformation(CharSequence source, View view) {
        return new PasswordCharSequence(source);
    }

    private class PasswordCharSequence implements CharSequence {
        private CharSequence mSource;

        public PasswordCharSequence(CharSequence source) {
            mSource = source; // Store char sequence
        }

        public char charAt(int index) {
            return '*'; // This is the important part
        }

        public int length() {
            return mSource.length(); // Return default
        }

        public CharSequence subSequence(int start, int end) {
            return mSource.subSequence(start, end); // Return default
        }
    }
}
