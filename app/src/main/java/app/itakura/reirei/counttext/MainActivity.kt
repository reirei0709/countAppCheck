package app.itakura.reirei.counttext

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        var random : Random = Random

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        plusButton.setOnClickListener{
            count += 1
            textView.text = count.toString()

        }

        plus2Button.setOnClickListener{
            count += 2
            textView.text = count.toString()

        }

        plus3Button.setOnClickListener{
            count += 3
            textView.text = count.toString()

        }

        plus4Button.setOnClickListener{
            count += 4
            textView.text = count.toString()

        }

        plus5Button.setOnClickListener{
            count += 5
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

        kakeruButton.setOnClickListener {
            count = count*2
            textView.text = count.toString()
        }

        specialButton.setOnClickListener {

            val number = random.nextInt(10)
            Log.d("Number",  number.toString())
            count = count + number
            textView.text = count.toString()

            specialButton.visibility = View.INVISIBLE
        }


        if (count >= 18) {
            Log.d("count", count.toString())
            textView.setTextColor(Color.RED)
        }



//        }else if(count == 19){
//            plus2Button.visibility = View.INVISIBLE
//            plus3Button.visibility = View.INVISIBLE
//            plus4Button.visibility = View.INVISIBLE
//            plus5Button.visibility = View.INVISIBLE
//            minusButton.visibility = View.INVISIBLE
//            clearButton.visibility = View.INVISIBLE
//            kakeruButton.visibility = View.INVISIBLE
//            specialButton.visibility = View.INVISIBLE
//
//        }









//        if(count%3 == 0){
//            textView.setTextColor(Color.GREEN)
//        }else if(count%5 == 0){
//            textView.setTextColor(Color.BLUE)
//        }else if(count%15 == 0){
//            textView.setTextColor(Color.RED)
//        }else{
//            textView.setTextColor(Color.BLACK)
//        }


    }
}