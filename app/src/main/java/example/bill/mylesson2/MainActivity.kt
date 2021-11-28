package example.bill.mylesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Под ночной тучей западной\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Наезжал на белый камень Илья.")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Из-за тучи месяц выглянул.\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Прочитай вон, на камени")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Придорожном надписочка\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Чётко-ясно повысечена:")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Влево ехать — женатому быть!")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Вправо ехать — богатому быть!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Развернуться назад - счастливому быть!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Прямо ехать — убитому быть!")
    }
}