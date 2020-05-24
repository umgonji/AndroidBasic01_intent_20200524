package dasdsa.sdn.androidbasic01_intent_20200524

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFirstBtn.setOnClickListener {

            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)
        }
    }
}
