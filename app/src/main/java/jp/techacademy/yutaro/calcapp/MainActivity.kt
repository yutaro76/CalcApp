package jp.techacademy.yutaro.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import com.google.android.material.snackbar.Snackbar;
import jp.techacademy.yutaro.calcapp.R.id.button1
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        if (editText1.text.toString() == "" || editText2.text.toString() == "") {
            Snackbar.make(v, "fill in the blank", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        } else {

            when (v.id) {
                R.id.button1 -> calc1(v)
                R.id.button2 -> calc2(v)
                R.id.button3 -> calc3(v)
                R.id.button4 -> calc4(v)
            }
        }
    }

    private fun calc1(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        val value1: Double = editText1.text.toString().toDouble()
        val value2: Double = editText2.text.toString().toDouble()
        val value3 = value1 + value2
        intent.putExtra("number", value3.toString().toDouble())
        startActivity(intent)
    }


    private fun calc2(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        val value1: Double = editText1.text.toString().toDouble()
        val value2: Double = editText2.text.toString().toDouble()
        val value4 = value1 - value2
        intent.putExtra("number", value4.toString().toDouble())
        startActivity(intent)
        }



    private fun calc3(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        val value1: Double = editText1.text.toString().toDouble()
        val value2: Double = editText2.text.toString().toDouble()
        val value5 = value1 * value2
        intent.putExtra("number", value5.toString().toDouble())
        startActivity(intent)
        }


    private fun calc4(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        val value1: Double = editText1.text.toString().toDouble()
        val value2: Double = editText2.text.toString().toDouble()
        val value6 = value1 / value2
        intent.putExtra("number", value6.toString().toDouble())
        startActivity(intent)
    }

}
