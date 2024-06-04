package ir.bluesource.q

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.readystatesoftware.viewbadger.BadgeView
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import ir.bluesource.q.databinding.ActivityExpBinding
import ir.bluesource.q.databinding.DialogRateBinding
import ir.bluesource.q.network.ApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class ExpActivity : AppCompatActivity() {

    private lateinit var viewModel: SharedViewModel
    private lateinit var binding : ActivityExpBinding
    private val BASE_URL = "http://192.168.251.221:8000/"



    private lateinit var badge1: BadgeView
    private lateinit var badge2: BadgeView
    private lateinit var badge3: BadgeView
    private lateinit var badge4: BadgeView
    private lateinit var badge5: BadgeView
    private lateinit var badge6: BadgeView
    private lateinit var badge7: BadgeView
    private lateinit var badge8: BadgeView
    private lateinit var badge9: BadgeView
    private lateinit var badge10: BadgeView
    private lateinit var badge11: BadgeView
    private lateinit var badge12: BadgeView
    private lateinit var badge13: BadgeView
    private lateinit var badge14: BadgeView
    private lateinit var badge15: BadgeView
    private lateinit var badge16: BadgeView
    private lateinit var badge17: BadgeView
    private lateinit var badge18: BadgeView
    private lateinit var badge19: BadgeView
    private lateinit var badge20: BadgeView
    private lateinit var badge21: BadgeView
    private lateinit var badge22: BadgeView
    private lateinit var badge23: BadgeView
    private lateinit var badge24: BadgeView
    private lateinit var badge25: BadgeView
    private lateinit var badge26: BadgeView
    private lateinit var badge27: BadgeView
    private lateinit var badge28: BadgeView
    private lateinit var badge29: BadgeView
    private lateinit var badge30: BadgeView
    private lateinit var badge31: BadgeView
    private lateinit var badge32: BadgeView




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

        viewModel = ViewModelProvider(this).get(SharedViewModel::class.java)

        handleBadge()

        handleQuestionButton()

        binding.btnSend.setOnClickListener {
            binding.btnSend.isEnabled = false
            binding.btnSend.setText("صبر کنید ...")
            sendToDataBase()
        }
    }

    private fun handleBadge() {
        badge1 = BadgeView(this, binding.button1)
        badge2 = BadgeView(this, binding.button2)
        badge3 = BadgeView(this, binding.button3)
        badge4 = BadgeView(this, binding.button4)
        badge5 = BadgeView(this, binding.button5)
        badge6 = BadgeView(this, binding.button6)
        badge7 = BadgeView(this, binding.button7)
        badge8 = BadgeView(this, binding.button8)
        badge9 = BadgeView(this, binding.button9)
        badge10 = BadgeView(this, binding.button10)
        badge11 = BadgeView(this, binding.button11)
        badge12 = BadgeView(this, binding.button12)
        badge13 = BadgeView(this, binding.button13)
        badge14 = BadgeView(this, binding.button14)
        badge15 = BadgeView(this, binding.button15)
        badge16 = BadgeView(this, binding.button16)
        badge17 = BadgeView(this, binding.button17)
        badge18 = BadgeView(this, binding.button18)
        badge19 = BadgeView(this, binding.button19)
        badge20 = BadgeView(this, binding.button20)
        badge21 = BadgeView(this, binding.button21)
        badge22 = BadgeView(this, binding.button22)
        badge23 = BadgeView(this, binding.button23)
        badge24 = BadgeView(this, binding.button24)
        badge25 = BadgeView(this, binding.button25)
        badge26 = BadgeView(this, binding.button26)
        badge27 = BadgeView(this, binding.button27)
        badge28 = BadgeView(this, binding.button28)
        badge29 = BadgeView(this, binding.button29)
        badge30 = BadgeView(this, binding.button30)
        badge31 = BadgeView(this, binding.button30)
        badge32 = BadgeView(this, binding.button31)

    }

    private fun handleQuestionButton() {
        binding.button1.setOnClickListener {
            showRateDialog(1)
        }

        binding.button2.setOnClickListener {
            showRateDialog(2)
        }

        binding.button3.setOnClickListener {
            showRateDialog(3)
        }

        binding.button4.setOnClickListener {
            showRateDialog(4)
        }

        binding.button5.setOnClickListener {
            showRateDialog(5)
        }

        binding.button6.setOnClickListener {
            showRateDialog(6)
        }

        binding.button7.setOnClickListener {
            showRateDialog(7)
        }

        binding.button8.setOnClickListener {
            showRateDialog(8)
        }

        binding.button9.setOnClickListener {
            showRateDialog(9)
        }

        binding.button10.setOnClickListener {
            showRateDialog(10)
        }

        binding.button11.setOnClickListener {
            showRateDialog(11)
        }

        binding.button12.setOnClickListener {
            showRateDialog(12)
        }

        binding.button13.setOnClickListener {
            showRateDialog(13)
        }

        binding.button14.setOnClickListener {
            showRateDialog(14)
        }

        binding.button15.setOnClickListener {
            showRateDialog(15)
        }

        binding.button16.setOnClickListener {
            showRateDialog(16)
        }

        binding.button17.setOnClickListener {
            showRateDialog(17)
        }

        binding.button18.setOnClickListener {
            showRateDialog(18)
        }

        binding.button19.setOnClickListener {
            showRateDialog(19)
        }

        binding.button20.setOnClickListener {
            showRateDialog(20)
        }

        binding.button21.setOnClickListener {
            showRateDialog(21)
        }

        binding.button22.setOnClickListener {
            showRateDialog(22)
        }

        binding.button23.setOnClickListener {
            showRateDialog(23)
        }

        binding.button24.setOnClickListener {
            showRateDialog(24)
        }

        binding.button25.setOnClickListener {
            showRateDialog(25)
        }

        binding.button26.setOnClickListener {
            showRateDialog(26)
        }

        binding.button27.setOnClickListener {
            showRateDialog(27)
        }

        binding.button28.setOnClickListener {
            showRateDialog(28)
        }

        binding.button29.setOnClickListener {
            showRateDialog(29)
        }

        binding.button30.setOnClickListener {
            showRateDialog(30)
        }

        binding.button31.setOnClickListener {
            showRateDialog(31)
        }

        binding.button32.setOnClickListener {
            showRateDialog(32)
        }
    }

    private fun showRateDialog(i: Int) {

        val dialogLayout: DialogRateBinding = DataBindingUtil.inflate(
            LayoutInflater.from(this),
            R.layout.dialog_rate,
            null,
            false
        )

        val alert = MaterialAlertDialogBuilder(this, R.style.CustomMaterialAlertDialog)
            .setView(dialogLayout.root)
            .setCancelable(true)
            .show()

        dialogLayout.apply {
            txtQuestion.setText(viewModel.experisions.get(i-1).question)
            btnRegisterRate.setOnClickListener {
                viewModel.experisions.get(i-1).rank = this.seekBar.value.toInt()
                handleButtons(i,this.seekBar.value.toInt() )
                alert.dismiss()
            }
        }

        alert?.window
            ?.clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)
        alert?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)

    }

    private fun handleButtons(i: Int, number: Int) {
        val value = number.toString()
        when(i){
            1 -> {
                badge1.setText(value)
                badge1.show()
            }

            2 -> {
                badge2.setText(value)
                badge2.show()
            }

            3 -> {
                badge3.setText(value)
                badge3.show()
            }

            4 -> {
                badge4.setText(value)
                badge4.show()
            }

            5 -> {
                badge5.setText(value)
                badge5.show()
            }

            6 -> {
                badge6.setText(value)
                badge6.show()
            }

            8 -> {
                badge8.setText(value)
                badge8.show()
            }

            7 -> {
                badge7.setText(value)
                badge7.show()
            }

            8 -> {
                badge8.setText(value)
                badge8.show()
            }

            9 -> {
                badge9.setText(value)
                badge9.show()
            }

            10 -> {
                badge10.setText(value)
                badge10.show()
            }

            11 -> {
                badge11.setText(value)
                badge11.show()
            }

            12 -> {
                badge12.setText(value)
                badge12.show()
            }

            13 -> {
                badge13.setText(value)
                badge13.show()
            }

            14 -> {
                badge14.setText(value)
                badge14.show()
            }

            15 -> {
                badge15.setText(value)
                badge15.show()
            }

            16 -> {
                badge16.setText(value)
                badge16.show()
            }

            17 -> {
                badge17.setText(value)
                badge17.show()
            }

            18 -> {
                badge18.setText(value)
                badge18.show()
            }

            19 -> {
                badge19.setText(value)
                badge19.show()
            }

            20 -> {
                badge20.setText(value)
                badge20.show()
            }

            21 -> {
                badge21.setText(value)
                badge21.show()
            }

            22 -> {
                badge22.setText(value)
                badge22.show()
            }

            23 -> {
                badge23.setText(value)
                badge23.show()
            }

            24 -> {
                badge24.setText(value)
                badge24.show()
            }

            25 -> {
                badge25.setText(value)
                badge25.show()
            }

            26 -> {
                badge26.setText(value)
                badge26.show()
            }

            27 -> {
                badge27.setText(value)
                badge27.show()
            }

            28 -> {
                badge28.setText(value)
                badge28.show()
            }

            29 -> {
                badge29.setText(value)
                badge29.show()
            }


            30 -> {
                badge30.setText(value)
                badge30.show()
            }


            31 -> {
                badge31.setText(value)
                badge31.show()
            }

            32 -> {
                badge32.setText(value)
                badge32.show()
            }
        }
    }

    private fun sendToDataBase() {

//        val loggingInterceptor = LoggingInterceptor.Builder()
//            .setLevel(Level.BASIC)
//            .log(Platform.INFO)
//            .build()

        val okHttpClient = OkHttpClient.Builder()
//            .addInterceptor(loggingInterceptor)
            .build()

        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient)
            .addConverterFactory(
                MoshiConverterFactory.create(
                    Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
                )
            )
            .build()

        val apiService = retrofit.create(ApiService::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            apiService.registerForm(
                intent.getStringExtra("name") ?: "",
                intent.getStringExtra("phone") ?: "",
                intent.getStringExtra("job") ?: "",
                viewModel.experisions.get(0).rank,
                viewModel.experisions.get(1).rank,
                viewModel.experisions.get(2).rank,
                viewModel.experisions.get(3).rank,
                viewModel.experisions.get(4).rank,
                viewModel.experisions.get(5).rank,
                viewModel.experisions.get(6).rank,
                viewModel.experisions.get(7).rank,
                viewModel.experisions.get(8).rank,
                viewModel.experisions.get(9).rank,
                viewModel.experisions.get(10).rank,
                viewModel.experisions.get(11).rank,
                viewModel.experisions.get(12).rank,
                viewModel.experisions.get(13).rank,
                viewModel.experisions.get(14).rank,
                viewModel.experisions.get(15).rank,
                viewModel.experisions.get(16).rank,
                viewModel.experisions.get(17).rank,
                viewModel.experisions.get(18).rank,
                viewModel.experisions.get(19).rank,
                viewModel.experisions.get(20).rank,
                viewModel.experisions.get(21).rank,
                viewModel.experisions.get(22).rank,
                viewModel.experisions.get(23).rank,
                viewModel.experisions.get(24).rank,
                viewModel.experisions.get(25).rank,
                viewModel.experisions.get(26).rank,
                viewModel.experisions.get(27).rank,
                viewModel.experisions.get(28).rank,
                viewModel.experisions.get(29).rank,
                viewModel.experisions.get(30).rank,
                viewModel.experisions.get(31).rank
            )

            startActivity(Intent(this@ExpActivity, ResultActivity::class.java))
            finish()

        }
    }
}