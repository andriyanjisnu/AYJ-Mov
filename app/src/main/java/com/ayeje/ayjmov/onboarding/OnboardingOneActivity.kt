package com.ayeje.ayjmov.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayeje.ayjmov.R
import android.content.Intent
import com.ayeje.ayjmov.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_onboarding_one.*
import com.ayeje.ayjmov.utils.Preferences

class OnboardingOneActivity : AppCompatActivity() {

    lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)

        preferences = Preferences(this)

        if (preferences.getValues("onboarding").equals("1")) {
            finishAffinity()

            val intent = Intent(
                this@OnboardingOneActivity,
                SignInActivity::class.java
            ).also {
                startActivity(it)
            }
        }

        btn_home.setOnClickListener {
            val intent = Intent(this@OnboardingOneActivity,
                OnboardingTwoActivity::class.java)
            startActivity(intent)
        }

        btn_daftar.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OnboardingOneActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
