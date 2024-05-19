package suvidha.setu.com

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.database
import com.google.firebase.database.getValue

class MainActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousInd ", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = resources.getColor(R.color.pink)
        }

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textName1: TextView = findViewById(R.id.name1)
        val textName2: TextView = findViewById(R.id.name2)
        val textName3: TextView = findViewById(R.id.name3)
        val textName4: TextView = findViewById(R.id.name4)
        val textName5: TextView = findViewById(R.id.name5)
        val textName6: TextView = findViewById(R.id.name6)
        val textName7: TextView = findViewById(R.id.name7)
        val textName8: TextView = findViewById(R.id.name8)
        val textName9: TextView = findViewById(R.id.name9)
        val textName10: TextView = findViewById(R.id.name10)
        val textName11: TextView = findViewById(R.id.name11)
        val textName12: TextView = findViewById(R.id.name12)
        val textName13: TextView = findViewById(R.id.name13)
        val textName14: TextView = findViewById(R.id.name14)
        val textName15: TextView = findViewById(R.id.name15)
        val textName16: TextView = findViewById(R.id.name16)
        val textName17: TextView = findViewById(R.id.name17)
        val textName18: TextView = findViewById(R.id.name18)
        val textName19: TextView = findViewById(R.id.name19)
        val textName20: TextView = findViewById(R.id.name20)
        val textName21: TextView = findViewById(R.id.name21)
        val textName22: TextView = findViewById(R.id.name22)
        val textName23: TextView = findViewById(R.id.name23)
        val textName24: TextView = findViewById(R.id.name24)
        val textName25: TextView = findViewById(R.id.name25)
        val textName26: TextView = findViewById(R.id.name26)
        val textName27: TextView = findViewById(R.id.name27)
        val textName28: TextView = findViewById(R.id.name28)
        val textName29: TextView = findViewById(R.id.name29)
        val textName30: TextView = findViewById(R.id.name30)
        val textName31: TextView = findViewById(R.id.name31)
        val textName32: TextView = findViewById(R.id.name32)
        val textName33: TextView = findViewById(R.id.name33)
        val textName34: TextView = findViewById(R.id.name34)
        val textName35: TextView = findViewById(R.id.name35)
        val textName36: TextView = findViewById(R.id.name36)
        val textName37: TextView = findViewById(R.id.name37)
        val textName38: TextView = findViewById(R.id.name38)
        val textName39: TextView = findViewById(R.id.name39)
        val textName40: TextView = findViewById(R.id.name40)
        val textName41: TextView = findViewById(R.id.name41)
        val textName42: TextView = findViewById(R.id.name42)
        val textName43: TextView = findViewById(R.id.name43)
        val textName44: TextView = findViewById(R.id.name44)
        val textName45: TextView = findViewById(R.id.name45)
        val textName46: TextView = findViewById(R.id.name46)
        val textName47: TextView = findViewById(R.id.name47)
        val textName48: TextView = findViewById(R.id.name48)
        val textName49: TextView = findViewById(R.id.name49)
        val textName50: TextView = findViewById(R.id.name50)


        val textPrice1: TextView = findViewById(R.id.price1)
        val textPrice2: TextView = findViewById(R.id.price2)
        val textPrice3: TextView = findViewById(R.id.price3)
        val textPrice4: TextView = findViewById(R.id.price4)
        val textPrice5: TextView = findViewById(R.id.price5)
        val textPrice6: TextView = findViewById(R.id.price6)
        val textPrice7: TextView = findViewById(R.id.price7)
        val textPrice8: TextView = findViewById(R.id.price8)
        val textPrice9: TextView = findViewById(R.id.price9)
        val textPrice10: TextView = findViewById(R.id.price10)
        val textPrice11: TextView = findViewById(R.id.price11)
        val textPrice12: TextView = findViewById(R.id.price12)
        val textPrice13: TextView = findViewById(R.id.price13)
        val textPrice14: TextView = findViewById(R.id.price14)
        val textPrice15: TextView = findViewById(R.id.price15)
        val textPrice16: TextView = findViewById(R.id.price16)
        val textPrice17: TextView = findViewById(R.id.price17)
        val textPrice18: TextView = findViewById(R.id.price18)
        val textPrice19: TextView = findViewById(R.id.price19)
        val textPrice20: TextView = findViewById(R.id.price20)
        val textPrice21: TextView = findViewById(R.id.price21)
        val textPrice22: TextView = findViewById(R.id.price22)
        val textPrice23: TextView = findViewById(R.id.price23)
        val textPrice24: TextView = findViewById(R.id.price24)
        val textPrice25: TextView = findViewById(R.id.price25)
        val textPrice26: TextView = findViewById(R.id.price26)
        val textPrice27: TextView = findViewById(R.id.price27)
        val textPrice28: TextView = findViewById(R.id.price28)
        val textPrice29: TextView = findViewById(R.id.price29)
        val textPrice30: TextView = findViewById(R.id.price30)
        val textPrice31: TextView = findViewById(R.id.price31)
        val textPrice32: TextView = findViewById(R.id.price32)
        val textPrice33: TextView = findViewById(R.id.price33)
        val textPrice34: TextView = findViewById(R.id.price34)
        val textPrice35: TextView = findViewById(R.id.price35)
        val textPrice36: TextView = findViewById(R.id.price36)
        val textPrice37: TextView = findViewById(R.id.price37)
        val textPrice38: TextView = findViewById(R.id.price38)
        val textPrice39: TextView = findViewById(R.id.price39)
        val textPrice40: TextView = findViewById(R.id.price40)
        val textPrice41: TextView = findViewById(R.id.price41)
        val textPrice42: TextView = findViewById(R.id.price42)
        val textPrice43: TextView = findViewById(R.id.price43)
        val textPrice44: TextView = findViewById(R.id.price44)
        val textPrice45: TextView = findViewById(R.id.price45)
        val textPrice46: TextView = findViewById(R.id.price46)
        val textPrice47: TextView = findViewById(R.id.price47)
        val textPrice48: TextView = findViewById(R.id.price48)
        val textPrice49: TextView = findViewById(R.id.price49)
        val textPrice50: TextView = findViewById(R.id.price50)

        val lastpdate: TextView = findViewById(R.id.update)

        val database = Firebase.database

        val Name1 = database.getReference("name1")
        val Name2 = database.getReference("name2")
        val Name3 = database.getReference("name3")
        val Name4 = database.getReference("name4")
        val Name5 = database.getReference("name5")
        val Name6 = database.getReference("name6")
        val Name7 = database.getReference("name7")
        val Name8 = database.getReference("name8")
        val Name9 = database.getReference("name9")
        val Name10 = database.getReference("name10")
        val Name11 = database.getReference("name11")
        val Name12 = database.getReference("name12")
        val Name13 = database.getReference("name13")
        val Name14 = database.getReference("name14")
        val Name15 = database.getReference("name15")
        val Name16 = database.getReference("name16")
        val Name17 = database.getReference("name17")
        val Name18 = database.getReference("name18")
        val Name19 = database.getReference("name19")
        val Name20 = database.getReference("name20")
        val Name21 = database.getReference("name21")
        val Name22 = database.getReference("name22")
        val Name23 = database.getReference("name23")
        val Name24 = database.getReference("name24")
        val Name25 = database.getReference("name25")
        val Name26 = database.getReference("name26")
        val Name27 = database.getReference("name27")
        val Name28 = database.getReference("name28")
        val Name29 = database.getReference("name29")
        val Name30 = database.getReference("name30")
        val Name31 = database.getReference("name31")
        val Name32 = database.getReference("name32")
        val Name33 = database.getReference("name33")
        val Name34 = database.getReference("name34")
        val Name35 = database.getReference("name35")
        val Name36 = database.getReference("name36")
        val Name37 = database.getReference("name37")
        val Name38 = database.getReference("name38")
        val Name39 = database.getReference("name39")
        val Name40 = database.getReference("name40")
        val Name41 = database.getReference("name41")
        val Name42 = database.getReference("name42")
        val Name43 = database.getReference("name43")
        val Name44 = database.getReference("name44")
        val Name45 = database.getReference("name45")
        val Name46 = database.getReference("name46")
        val Name47 = database.getReference("name47")
        val Name48 = database.getReference("name48")
        val Name49 = database.getReference("name49")
        val Name50 = database.getReference("name50")

        val Price1 = database.getReference("price1")
        val Price2 = database.getReference("price2")
        val Price3 = database.getReference("price3")
        val Price4 = database.getReference("price4")
        val Price5 = database.getReference("price5")
        val Price6 = database.getReference("price6")
        val Price7 = database.getReference("price7")
        val Price8 = database.getReference("price8")
        val Price9 = database.getReference("price9")
        val Price10 = database.getReference("price10")
        val Price11 = database.getReference("price11")
        val Price12 = database.getReference("price12")
        val Price13 = database.getReference("price13")
        val Price14 = database.getReference("price14")
        val Price15 = database.getReference("price15")
        val Price16 = database.getReference("price16")
        val Price17 = database.getReference("price17")
        val Price18 = database.getReference("price18")
        val Price19 = database.getReference("price19")
        val Price20 = database.getReference("price20")
        val Price21 = database.getReference("price21")
        val Price22 = database.getReference("price22")
        val Price23 = database.getReference("price23")
        val Price24 = database.getReference("price24")
        val Price25 = database.getReference("price25")
        val Price26 = database.getReference("price26")
        val Price27 = database.getReference("price27")
        val Price28 = database.getReference("price28")
        val Price29 = database.getReference("price29")
        val Price30 = database.getReference("price30")
        val Price31 = database.getReference("price31")
        val Price32 = database.getReference("price32")
        val Price33 = database.getReference("price33")
        val Price34 = database.getReference("price34")
        val Price35 = database.getReference("price35")
        val Price36 = database.getReference("price36")
        val Price37 = database.getReference("price37")
        val Price38 = database.getReference("price38")
        val Price39 = database.getReference("price39")
        val Price40 = database.getReference("price40")
        val Price41 = database.getReference("price41")
        val Price42 = database.getReference("price42")
        val Price43 = database.getReference("price43")
        val Price44 = database.getReference("price44")
        val Price45 = database.getReference("price45")
        val Price46 = database.getReference("price46")
        val Price47 = database.getReference("price47")
        val Price48 = database.getReference("price48")
        val Price49 = database.getReference("price49")
        val Price50 = database.getReference("price50")

        val Update = database.getReference("Update")

        Update.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                lastpdate.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name1.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName1.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name2.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName2.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name3.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName3.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name4.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName4.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name5.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName5.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name6.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName6.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name7.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName7.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name8.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName8.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name9.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName9.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name10.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName10.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name11.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName11.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name12.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName12.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name13.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName13.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name14.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName14.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name15.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName15.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name16.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName16.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name17.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName17.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name18.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName18.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name19.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName19.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name20.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName20.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name21.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName21.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name22.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName22.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name23.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName23.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name24.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName24.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name25.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName25.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name26.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName26.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name27.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName27.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name28.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName28.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name29.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName29.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name30.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName30.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name31.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName31.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name32.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName32.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name33.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName33.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name34.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName34.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name35.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName35.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name36.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName36.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name37.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName37.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name38.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName38.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name39.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName39.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name40.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName40.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name41.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName41.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name42.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName42.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name43.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName43.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name44.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName44.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name45.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName45.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name46.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName46.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name47.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName47.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name48.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName48.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name49.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName49.text = value // S et value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Name50.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textName50.text = value // Set value for text1
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle cancellation
            }
        })

        Price1.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice1.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price2.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice2.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price3.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice3.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price4.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice4.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price5.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice5.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price6.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice6.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price7.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice7.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price8.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice8.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price9.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice9.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price10.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice10.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price11.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice11.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price12.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice12.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price13.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice13.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price14.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice14.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price15.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice15.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price16.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice16.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price17.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice17.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price18.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice18.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price19.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice19.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price20.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice20.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price21.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice21.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price22.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice22.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price23.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice23.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price24.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice24.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price25.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice25.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price26.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice26.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price27.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice27.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price28.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice28.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price29.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice29.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price30.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice30.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price31.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice31.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price32.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice32.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price33.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice33.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price34.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice34.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price35.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice35.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price36.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice36.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price37.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice37.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price38.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice38.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price39.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice39.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price40.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice40.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price41.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice41.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price42.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice42.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price43.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice43.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price44.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice44.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price45.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice45.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price46.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice46.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price47.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice47.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price48.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice48.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price49.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice49.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        Price50.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                textPrice50.text = value
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })


        val sendButton = findViewById<Button>(R.id.send)
        sendButton.setOnClickListener {
            val number = "+918181810955"
            val message = "Welcome to Suvidha Setu" +
                    "" +
                    ""

            val isAppInstalled = isAppInstalled()

            if (isAppInstalled) {
                val launchIntent = Intent(Intent.ACTION_VIEW)
                launchIntent.data =
                    Uri.parse("https://api.whatsapp.com/send?phone=$number&text=$message")
                startActivity(launchIntent)

            } else {
                Toast.makeText(this, "Whatsapp is not installed in your phone ", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun isAppInstalled(): Boolean {
        val packageManager = packageManager
        return try {
            true

        } catch (e: PackageManager.NameNotFoundException) {
            true
        }


    }


}















