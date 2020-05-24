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

        //두번째 버튼 누르면 두번째액티비티로 가고, 거시서 돌아가기 버튼 누르면 다시 메인으로 돌아오도록 (SecondActivity)

        goToSecondBtn.setOnClickListener {

            val SecondIntent = Intent(this, SecondActivity::class.java)
            startActivity(SecondIntent)

        }

        goToThirdBtn.setOnClickListener {

            val inputContent = contentEdt.text.toString()

            val myIntent = Intent(this, ThirdActivity::class.java)
            myIntent.putExtra( "content", inputContent )

            startActivity(myIntent)
        }
    }
}
