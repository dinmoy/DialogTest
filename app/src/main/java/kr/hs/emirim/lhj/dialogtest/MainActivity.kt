package kr.hs.emirim.lhj.dialogtest

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kr.hs.emirim.lhj.dialogtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var btnItem:Button
    lateinit var textResult:TextView
    lateinit var imgv:ImageView
    var verrionArray=arrayOf("장미","튤립","프리지아")
    var flowerImgRes= arrayOf(R.drawable.rose,R.drawable.tulip,R.drawable.prigia)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnItem=findViewById(R.id.btn_item)
        textResult=findViewById(R.id.text_result)
        imgv=findViewById<ImageView>(R.id.imgv)

        btnItem.setOnClickListener{
            var dlg=AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 꽃은?")
            dlg.setIcon(R.drawable.people)
            dlg.setItems(verrionArray){dialog,index ->
                textResult.text=verrionArray[index]
                imgv.setImageResource(flowerImgRes[index])


            }
            dlg.setNegativeButton("닫기",null)
            dlg.show()


        }

    }
}