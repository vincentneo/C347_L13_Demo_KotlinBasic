package sg.edu.rp.c347.id19007966.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGetAge.setOnClickListener {
            val userInput = editTextBirthYear.text.toString()
            if (userInput.isNotEmpty()) {
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userInput.toInt()
                val formattedText = "Your age is $age"
                textViewShowAge.text = formattedText
                textViewAgeDescription.text = describe(age);
            }
            else {
                Toast.makeText(this, "Please enter your birth year", Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun describe(age: Int): String {
        if (age < 18) {
            return "Underage"
        }
        else if (age in 18..65) {
            return "Young people"
        }
        else if (age in 66..79) {
            return "Middle-aged"
        }
        else if (age in 80..99) {
            return "Elderly"
        }
        else {
            return "Long-lived elderly"
        }
    }
}