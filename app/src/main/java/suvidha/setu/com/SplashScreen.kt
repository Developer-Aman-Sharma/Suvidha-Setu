package suvidha.setu.com

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import suvidha.setu.comu.R

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        // If enableEdgeToEdge() is a custom function, ensure it's defined correctly.
        // enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)
        Handler(Looper.getMainLooper()).postDelayed({
            // Corrected the Intent instantiation
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}
