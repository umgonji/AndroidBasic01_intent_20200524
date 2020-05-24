package dasdsa.sdn.androidbasic01_intent_20200524

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*
import kotlinx.android.synthetic.main.activity_main.*

class EditNickNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        okBtn.setOnClickListener {

            val inputNickName = nickNameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickName)

            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }
    }
}
