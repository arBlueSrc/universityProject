package ir.bluesource.q

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import ir.bluesource.q.databinding.ActivityExpBinding

class ExpActivity : AppCompatActivity() {

    private lateinit var binding : ActivityExpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityExpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val model = ViewModelProvider(this).get(SharedViewModel::class.java)


        binding.btnSend.setOnClickListener {
            startActivity(Intent(this@ExpActivity, ResultActivity::class.java))
            finish()
        }
    }
}