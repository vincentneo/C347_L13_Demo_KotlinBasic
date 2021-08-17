package sg.edu.rp.c347.id19007966.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGetAge.setOnClickListener {
            val userInput = editTextBirthYear.text.toString()
            val year = Calendar.getInstance().get(Calendar.YEAR)

            val age = year - userInput.toInt()
            textViewShowAge.text = "Your age is $age"
        }

    }
}