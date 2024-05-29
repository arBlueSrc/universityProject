package ir.bluesource.q

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import ir.bluesource.q.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    private lateinit var binding : ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val model = ViewModelProvider(this).get(SharedViewModel::class.java)


        binding.button33.setOnClickListener {

            val name = binding.editTextText.text.toString().trim()
            if (name.isNullOrEmpty()) {
                Toast.makeText(this, "لطفا اسم و فامیل خود را وارد کنید", Toast.LENGTH_LONG).show()
            }else{

                model.name = binding.editTextText.text.toString().trim()
                model.phone = binding.editTextText2.text.toString().trim()
                model.job = binding.editTextText3.text.toString().trim()

                startActivity(Intent(this@InfoActivity, ExpActivity::class.java))
                finish()
            }

        }
    }
}