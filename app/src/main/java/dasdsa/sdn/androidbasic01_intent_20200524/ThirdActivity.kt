package dasdsa.sdn.androidbasic01_intent_20200524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val myContent = intent.getStringExtra("content")

        val myNumber = intent.getIntExtra("number", -1)

        contentTxt.text = myContent

    }
}
