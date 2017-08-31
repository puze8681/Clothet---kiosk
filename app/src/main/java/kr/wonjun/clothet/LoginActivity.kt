package kr.wonjun.clothet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        splash_btn_login.setOnClickListener {
            startActivity<MainActivity>()
        }

        splash_btn_register.setOnClickListener {
            startActivity<RegisterActivity>()
        }


    }
}