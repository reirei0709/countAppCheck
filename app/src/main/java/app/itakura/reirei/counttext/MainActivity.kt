package app.itakura.reirei.counttext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        plusButton.setOnClickListener{
            count += 1
            textView.text = count.toString()

        }

        minusButton.setOnClickListener{
            count -= 1
            textView.text = count.toString()

        }

        clearButton.setOnClickListener {
            count = 0
            textView.text = count.toString()
        }


    }
}