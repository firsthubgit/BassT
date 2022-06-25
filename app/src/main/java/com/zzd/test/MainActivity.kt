package com.zzd.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zzd.test.databinding.ActivityMainBinding
import com.zzd.dsptest.DSPTest
import com.zzd.fxtest.FXTest
import com.zzd.livespec.LiveSpec
import com.zzd.netradio.NetRadio
import com.zzd.plugins.Plugins
import com.zzd.rectest.RecTest
import com.zzd.spectrum.Spectrum

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.DSPTest.text = stringFromJNI()

        binding.DSPTest.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, DSPTest::class.java)
            startActivity(intent)
        }

        binding.FXTest.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, FXTest::class.java)
            startActivity(intent)
        }

        binding.LiveSpec.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, LiveSpec::class.java)
            startActivity(intent)
        }


        binding.NetRadio.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, NetRadio::class.java)
            startActivity(intent)
        }

        binding.Plugins.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, Plugins::class.java)
            startActivity(intent)
        }

        binding.RecTest.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, RecTest::class.java)
            startActivity(intent)
        }

        binding.Spectrum.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, Spectrum::class.java)
            startActivity(intent)
        }





    }

    /**
     * A native method that is implemented by the 'bass' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'bass' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}