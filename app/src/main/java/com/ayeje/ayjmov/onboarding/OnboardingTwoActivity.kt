package com.ayeje.ayjmov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayeje.ayjmov.R
import kotlinx.android.synthetic.main.activity_onboarding_two.*

class OnboardingTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)

        btn_home.setOnClickListener {
            val intent = Intent(this@OnboardingTwoActivity,
                OnboardingThreeActivity::class.java)
            startActivity(intent)
        }

        btn_sebelumnya.setOnClickListener {
            val intent = Intent(this@OnboardingTwoActivity,
                OnboardingOneActivity::class.java)
            startActivity(intent)
        }
    }
}
