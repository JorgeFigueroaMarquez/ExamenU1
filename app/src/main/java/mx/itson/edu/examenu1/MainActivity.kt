package mx.itson.edu.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etc: EditText = findViewById(R.id.etC)
        val etf: EditText = findViewById(R.id.etF)
        val btnGC: Button = findViewById(R.id.btnGC)
        val btnGF: Button = findViewById(R.id.btnGF)

        btnGC.setOnClickListener {
            var gradosF: Double = 0.0
            try {
                gradosF = etf.text.toString().toDouble()
            }catch (ex: java.lang.Exception){
                print(ex)
            }

            var gradosC = convertFtoC(gradosF)
            val format = "%.2f".format(gradosC)
            etc.setText(format)
        }

        btnGF.setOnClickListener {
            var gradosC: Double = 0.0
            try{
                gradosC = etc.text.toString().toDouble()
            }catch (ex: java.lang.Exception){
                print(ex)
            }

             var gradosF = convertCtoF(gradosC)
            val format = "%.2f".format(gradosF)
            etf.setText(format)
        }
    }

    fun convertCtoF(gradosC: Double): Double{
       return (gradosC*1.8)+32
    }

    fun convertFtoC(gradosF: Double): Double{
        return (gradosF-32)/1.8
    }

}