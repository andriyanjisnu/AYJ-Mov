package com.ayeje.ayjmov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayeje.ayjmov.R
import com.ayeje.ayjmov.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_onboarding_three.*

class OnboardingThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_three)

        btn_home.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OnboardingThreeActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }

        `btn_sebelumnya`.setOnClickListener {
            val intent = Intent(this@OnboardingThreeActivity,
                OnboardingTwoActivity::class.java)
            startActivity(intent)
        }
    }
}
