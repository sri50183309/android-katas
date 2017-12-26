package com.example.smahali1.quizdemo.util;

import com.example.smahali1.quizdemo.Question;
import com.example.smahali1.quizdemo.R;

import java.util.Arrays;

/**
 * Created by SMAHALI1 on 12/26/2017.
 */

public class QuizUtil {
    //Constructs the question arrays
    private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_australia, true),
            new Question(R.string.question_oceans, true),
            new Question(R.string.question_mideast, true),
            new Question(R.string.question_africa, true),
            new Question(R.string.question_americas, true),
            new Question(R.string.question_asia, true)
    };

    public Question[] getQuestionBank() {
        return mQuestionBank;
    }

    public void setQuestionBank(Question[] questionBank) {
        mQuestionBank = questionBank;
    }
}
