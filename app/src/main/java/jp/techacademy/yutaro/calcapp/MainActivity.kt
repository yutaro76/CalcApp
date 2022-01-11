package jp.techacademy.yutaro.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import com.google.android.material.snackbar.Snackbar;
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
        when(v.id){
            R.id.button1 -> calc1(v)
            R.id.button2 -> calc2(v)
            R.id.button3 -> calc3(v)
            R.id.button4 -> calc4(v)
        }
        


    }

    var value1 = editText1.text.toString().toDouble()
    var value2 = editText2.text.toString().toDouble()

    var value3 = value1 + value2
    var value4 = value1 - value2
    var value5 = value1 * value2
    var value6 = value1 / value2


    private fun calc1(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("number", value3)
        startActivity(intent)

        if (editText1 == null || editText2 == null) {
            Snackbar.make(v, "fill number in the blank", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            }
        }



    private fun calc2(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("number", value4)
        startActivity(intent)

        if (editText1 == null || editText2 == null) {
            Snackbar.make(v, "fill number in the blank", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }


    private fun calc3(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("number", value5)
        startActivity(intent)

        if (editText1 == null || editText2 == null) {
            Snackbar.make(v, "fill number in the blank", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    private fun calc4(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("number", value6)
        startActivity(intent)

        if (editText1 == null || editText2 == null) {
            Snackbar.make(v, "fill number in the blank", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
