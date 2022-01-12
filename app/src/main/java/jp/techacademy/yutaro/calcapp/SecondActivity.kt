package jp.techacademy.yutaro.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*
import android.content.Intent

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val answer = intent.getDoubleExtra("number", 0.0)
        textView.text = answer.toString()

    }
}

//        val value1 = calc1().getDoubleExtra("VALUE1", 0.0)
//        val value2 = calc1().getDoubleExtra("VALUE2", 0.0)
//
//        textView.text = "${value1 + value2}"
//
//        val value3 = intent2.getDoubleExtra("VALUE3", 0.0)
//        val value4 = intent2.getDoubleExtra("VALUE4", 0.0)
//
//        textView.text = "${value3 - value4}"
//
//        val value5 = intent3.getDoubleExtra("VALUE5", 0.0)
//        val value6 = intent3.getDoubleExtra("VALUE6", 0.0)
//
//        textView.text = "${value5 * value6}"
//
//        val value7 = intent4.getDoubleExtra("VALUE7", 0.0)
//        val value8 = intent4.getDoubleExtra("VALUE8", 0.0)
//
//        textView.text = "${value7 / value8}"



