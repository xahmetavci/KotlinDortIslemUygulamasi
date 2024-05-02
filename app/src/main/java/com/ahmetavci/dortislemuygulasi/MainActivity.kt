package com.ahmetavci.dortislemuygulasi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    /*
    var sayiGirdisi1 = findViewById<EditText>(R.id.editText1)
    var sayiGirdisi2 = findViewById<EditText>(R.id.editText2)
    var sonuc = findViewById<TextView>(R.id.textView)
    */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun topla(view: View){
        var sayiGirdisi1 = findViewById<EditText>(R.id.editText1)
        var sayiGirdisi2 = findViewById<EditText>(R.id.editText2)
        var sonuc = findViewById<TextView>(R.id.textView)

        var sayim1 = sayiGirdisi1.text.toString().toIntOrNull() //Null olabilir nedeni ise; Uygulamayı kullanna son kullanıcı metin(string) yazar yada boş bırakabilir
        var sayim2 = sayiGirdisi2.text.toString().toIntOrNull()

        if (sayim1 == null || sayim2 == null){ //sayim1 ve sayim2 ikisinden birisi yada ikiside null gelirse son kullanıcııya hata measajı göstermek için if kontrolünden geçirmekteyiz.
            sonuc.text = "Hatalı Tuşlama Yaptınız! Lütfen Tamsayi bir değer giriniz"
        } else {
            var toplam = sayim1 + sayim2
            sonuc.text ="Sonuç: ${toplam}"
        }
    }

    fun cikar(view: View){
        var sayiGirdisi1 = findViewById<EditText>(R.id.editText1)
        var sayiGirdisi2 = findViewById<EditText>(R.id.editText2)
        var sonuc = findViewById<TextView>(R.id.textView)

        var sayim1 = sayiGirdisi1.text.toString().toIntOrNull() //Null olabilir nedeni ise; Uygulamayı kullanna son kullanıcı metin(string) yazar yada boş bırakabilir
        var sayim2 = sayiGirdisi2.text.toString().toIntOrNull()

        if (sayim1 == null || sayim2 == null){ //sayim1 ve sayim2 ikisinden birisi yada ikiside null gelirse son kullanıcııya hata measajı göstermek için if kontrolünden geçirmekteyiz.
            sonuc.text = "Hatalı Tuşlama Yaptınız! Lütfen Tamsayi bir değer giriniz"
        } else {
            var toplam = sayim1 - sayim2
            sonuc.text ="Sonuç: ${toplam}"
        }
    }

    fun bol(view: View){
        var sayiGirdisi1 = findViewById<EditText>(R.id.editText1)
        var sayiGirdisi2 = findViewById<EditText>(R.id.editText2)
        var sonuc = findViewById<TextView>(R.id.textView)

        var sayim1 = sayiGirdisi1.text.toString().toDoubleOrNull() //Null olabilir nedeni ise; Uygulamayı kullanna son kullanıcı metin(string) yazar yada boş bırakabilir
        var sayim2 = sayiGirdisi2.text.toString().toDoubleOrNull()

        if (sayim1 == null || sayim2 == null){ //sayim1 ve sayim2 ikisinden birisi yada ikiside null gelirse son kullanıcııya hata measajı göstermek için if kontrolünden geçirmekteyiz.
            sonuc.text = "Hatalı Tuşlama Yaptınız! Lütfen Tamsayi bir değer giriniz"
        } else {
            var toplam = sayim1 / sayim2
            sonuc.text ="Sonuç: ${toplam}"
        }
    }

    fun carp(view: View){
        var sayiGirdisi1 = findViewById<EditText>(R.id.editText1)
        var sayiGirdisi2 = findViewById<EditText>(R.id.editText2)
        var sonuc = findViewById<TextView>(R.id.textView)

        var sayim1 = sayiGirdisi1.text.toString().toIntOrNull() //Null olabilir nedeni ise; Uygulamayı kullanna son kullanıcı metin(string) yazar yada boş bırakabilir
        var sayim2 = sayiGirdisi2.text.toString().toIntOrNull()

        if (sayim1 == null || sayim2 == null){ //sayim1 ve sayim2 ikisinden birisi yada ikiside null gelirse son kullanıcııya hata measajı göstermek için if kontrolünden geçirmekteyiz.
            sonuc.text = "Hatalı Tuşlama Yaptınız! Lütfen Tamsayi bir değer giriniz"
        } else {
            var toplam = sayim1 * sayim2
            sonuc.text ="Sonuç: ${toplam}"
        }
    }

}