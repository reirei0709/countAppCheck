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

            if (count >= 18) {
                Log.d("count", count.toString())
                textView.setTextColor(Color.RED)

            }
            if(count == 19){
                Log.d("count", count.toString())
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                clearButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE

            }
            if(count >= 20){
                textView.textSize = 150.0F
                plusButton.visibility = View.INVISIBLE
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                bombAnimation.visibility = View.VISIBLE
                clearButton.text = "もう一回！"
              clearButton.visibility = View.VISIBLE

            }


            clearButton.setOnClickListener {
                plusButton.visibility = View.VISIBLE
                plus2Button.visibility = View.VISIBLE
                plus3Button.visibility = View.VISIBLE
                plus4Button.visibility = View.VISIBLE
                plus5Button.visibility = View.VISIBLE
                minusButton.visibility = View.VISIBLE
                specialButton.visibility = View.VISIBLE
                kakeruButton.visibility = View.VISIBLE
                clearButton.text = "clear"
                count = 0
                textView.text = count.toString()
                textView.setTextColor(Color.rgb(156,39,176))
                bombAnimation.visibility = View.INVISIBLE

            }



        }

        plus2Button.setOnClickListener{
            count += 2
            textView.text = count.toString()

            if (count >= 18) {
                Log.d("count", count.toString())
                textView.setTextColor(Color.RED)

            }
            if(count == 19){
                Log.d("count", count.toString())
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                clearButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE

            }
            if(count >= 20){
                textView.textSize = 150.0F
                plusButton.visibility = View.INVISIBLE
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                bombAnimation.visibility = View.VISIBLE
                clearButton.text = "もう一回！"
                clearButton.visibility = View.VISIBLE

            }


            clearButton.setOnClickListener {
                plusButton.visibility = View.VISIBLE
                plus2Button.visibility = View.VISIBLE
                plus3Button.visibility = View.VISIBLE
                plus4Button.visibility = View.VISIBLE
                plus5Button.visibility = View.VISIBLE
                minusButton.visibility = View.VISIBLE
                specialButton.visibility = View.VISIBLE
                kakeruButton.visibility = View.VISIBLE
                clearButton.text = "clear"
                count = 0
                textView.text = count.toString()
                textView.setTextColor(Color.rgb(156,39,176))
                bombAnimation.visibility = View.INVISIBLE

            }





        }

        plus3Button.setOnClickListener{
            count += 3
            textView.text = count.toString()

            if (count >= 18) {
                Log.d("count", count.toString())
                textView.setTextColor(Color.RED)

            }
            if(count == 19){
                Log.d("count", count.toString())
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                clearButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE

            }
            if(count >= 20){
                textView.textSize = 150.0F
                plusButton.visibility = View.INVISIBLE
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                bombAnimation.visibility = View.VISIBLE
                clearButton.text = "もう一回！"
                clearButton.visibility = View.VISIBLE

            }


            clearButton.setOnClickListener {
                plusButton.visibility = View.VISIBLE
                plus2Button.visibility = View.VISIBLE
                plus3Button.visibility = View.VISIBLE
                plus4Button.visibility = View.VISIBLE
                plus5Button.visibility = View.VISIBLE
                minusButton.visibility = View.VISIBLE
                specialButton.visibility = View.VISIBLE
                kakeruButton.visibility = View.VISIBLE
                clearButton.text = "clear"
                count = 0
                textView.text = count.toString()
                textView.setTextColor(Color.rgb(156,39,176))
                bombAnimation.visibility = View.INVISIBLE

            }




        }

        plus4Button.setOnClickListener{
            count += 4
            textView.text = count.toString()

            if (count >= 18) {
                Log.d("count", count.toString())
                textView.setTextColor(Color.RED)

            }
            if(count == 19){
                Log.d("count", count.toString())
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                clearButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE

            }
            if(count >= 20){
                textView.textSize = 150.0F
                plusButton.visibility = View.INVISIBLE
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                bombAnimation.visibility = View.VISIBLE
                clearButton.text = "もう一回！"
                clearButton.visibility = View.VISIBLE

            }


            clearButton.setOnClickListener {
                plusButton.visibility = View.VISIBLE
                plus2Button.visibility = View.VISIBLE
                plus3Button.visibility = View.VISIBLE
                plus4Button.visibility = View.VISIBLE
                plus5Button.visibility = View.VISIBLE
                minusButton.visibility = View.VISIBLE
                specialButton.visibility = View.VISIBLE
                kakeruButton.visibility = View.VISIBLE
                clearButton.text = "clear"
                count = 0
                textView.text = count.toString()
                textView.setTextColor(Color.rgb(156,39,176))
                bombAnimation.visibility = View.INVISIBLE

            }


        }

        plus5Button.setOnClickListener{
            count += 5
            textView.text = count.toString()

            if (count >= 18) {
                Log.d("count", count.toString())
                textView.setTextColor(Color.RED)

            }
            if(count == 19){
                Log.d("count", count.toString())
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                clearButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE

            }
            if(count >= 20){
                textView.textSize = 150.0F
                plusButton.visibility = View.INVISIBLE
                plusButton.visibility = View.INVISIBLE
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                bombAnimation.visibility = View.VISIBLE
                clearButton.text = "もう一回！"
                clearButton.visibility = View.VISIBLE

            }


            clearButton.setOnClickListener {
                plusButton.visibility = View.VISIBLE
                plus2Button.visibility = View.VISIBLE
                plus3Button.visibility = View.VISIBLE
                plus4Button.visibility = View.VISIBLE
                plus5Button.visibility = View.VISIBLE
                minusButton.visibility = View.VISIBLE
                clearButton.visibility = View.VISIBLE
                kakeruButton.visibility = View.VISIBLE
                specialButton.text = "special"
                count = 0
                textView.text = count.toString()
                textView.setTextColor(Color.rgb(156,39,176))
                bombAnimation.visibility = View.INVISIBLE

            }


        }


        minusButton.setOnClickListener{
            count -= 1
            textView.text = count.toString()

            minusButton.visibility = View.INVISIBLE


        }

        clearButton.setOnClickListener {
            count = 0
            textView.text = count.toString()
        }

        kakeruButton.setOnClickListener {
            count = count*2
            textView.text = count.toString()

            kakeruButton.visibility = View.INVISIBLE

            if (count >= 18) {
                Log.d("count", count.toString())
                textView.setTextColor(Color.RED)

            }
            if(count == 19){
                Log.d("count", count.toString())
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                clearButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE

            }
            if(count >= 20){
                textView.textSize = 150.0F
                plusButton.visibility = View.INVISIBLE
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                bombAnimation.visibility = View.VISIBLE
                clearButton.text = "もう一回！"
                clearButton.visibility = View.VISIBLE

            }


            clearButton.setOnClickListener {
                plusButton.visibility = View.VISIBLE
                plus2Button.visibility = View.VISIBLE
                plus3Button.visibility = View.VISIBLE
                plus4Button.visibility = View.VISIBLE
                plus5Button.visibility = View.VISIBLE
                minusButton.visibility = View.VISIBLE
                specialButton.visibility = View.VISIBLE
                kakeruButton.visibility = View.VISIBLE
                clearButton.text = "clear"
                count = 0
                textView.text = count.toString()
                textView.setTextColor(Color.rgb(156,39,176))
                bombAnimation.visibility = View.INVISIBLE

            }



        }

        specialButton.setOnClickListener {

            val number = random.nextInt(10)
            Log.d("Number",  number.toString())
            count = count + number
            textView.text = count.toString()

            specialButton.visibility = View.INVISIBLE

            if (count >= 18) {
                Log.d("count", count.toString())
                textView.setTextColor(Color.RED)

            }
            if(count == 19){
                Log.d("count", count.toString())
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                clearButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE

            }
            if(count >= 20){
                textView.textSize = 150.0F
                plusButton.visibility = View.INVISIBLE
                plus2Button.visibility = View.INVISIBLE
                plus3Button.visibility = View.INVISIBLE
                plus4Button.visibility = View.INVISIBLE
                plus5Button.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                specialButton.visibility = View.INVISIBLE
                kakeruButton.visibility = View.INVISIBLE
                bombAnimation.visibility = View.VISIBLE
                clearButton.text = "もう一回！"
                clearButton.visibility = View.VISIBLE

            }


            clearButton.setOnClickListener {
                plusButton.visibility = View.VISIBLE
                plus2Button.visibility = View.VISIBLE
                plus3Button.visibility = View.VISIBLE
                plus4Button.visibility = View.VISIBLE
                plus5Button.visibility = View.VISIBLE
                minusButton.visibility = View.VISIBLE
                specialButton.visibility = View.VISIBLE
                kakeruButton.visibility = View.VISIBLE
                clearButton.text = "clear"
                count = 0
                textView.text = count.toString()
                textView.setTextColor(Color.rgb(156,39,176))
                bombAnimation.visibility = View.INVISIBLE

            }



        }




    }
}