package kr.ac.tukorea.mbti_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    var E = 0; var I = 0; var S = 0; var N = 0; var T = 0; var F = 0; var J = 0; var P = 0

    lateinit var startbtn : Button
    lateinit var confirmbtn : Button
    lateinit var nextbtn : Button
    lateinit var finbtn : Button
    lateinit var gostart: Button

    lateinit var caution : TextView
    lateinit var question1 : TextView
    lateinit var question2 : TextView
    lateinit var question3 : TextView
    lateinit var question4 : TextView
    lateinit var result : TextView
    lateinit var explanation : TextView

    lateinit var questbtngroup1: RadioGroup
    lateinit var radiobtn1_1 : RadioButton
    lateinit var radiobtn1_2 : RadioButton
    lateinit var radiobtn1_3 : RadioButton
    lateinit var radiobtn1_4 : RadioButton
    lateinit var radiobtn1_5 : RadioButton
    lateinit var radiobtn1_6 : RadioButton

    lateinit var questbtngroup2: RadioGroup
    lateinit var radiobtn2_1 : RadioButton
    lateinit var radiobtn2_2 : RadioButton
    lateinit var radiobtn2_3 : RadioButton
    lateinit var radiobtn2_4 : RadioButton
    lateinit var radiobtn2_5 : RadioButton
    lateinit var radiobtn2_6 : RadioButton

    lateinit var questbtngroup3: RadioGroup
    lateinit var radiobtn3_1 : RadioButton
    lateinit var radiobtn3_2 : RadioButton
    lateinit var radiobtn3_3 : RadioButton
    lateinit var radiobtn3_4 : RadioButton
    lateinit var radiobtn3_5 : RadioButton
    lateinit var radiobtn3_6 : RadioButton

    lateinit var questbtngroup4: RadioGroup
    lateinit var radiobtn4_1 : RadioButton
    lateinit var radiobtn4_2 : RadioButton
    lateinit var radiobtn4_3 : RadioButton
    lateinit var radiobtn4_4 : RadioButton
    lateinit var radiobtn4_5 : RadioButton
    lateinit var radiobtn4_6 : RadioButton

    fun start(){
        setContentView(R.layout.activity_start)
        startbtn = findViewById<Button>(R.id.StartBtn)
        startbtn.setOnClickListener {
            caution()
        }
    }

    fun caution(){
        setContentView(R.layout.activity_caution)
        confirmbtn = findViewById<Button>(R.id.Confirm_button)
        caution = findViewById<TextView>(R.id.CautionText)
        E= 0; I = 0; S = 0; N = 0; T = 0; F = 0; J = 0; P = 0
        caution.text = """
            ???????????? ??????
            
            - ??????????????? ????????? ?????? ???????????? ??????
            - ???????????? ?????? ???????????? ?????? ?????? ?????? ??????
            - ??????????????? ??? ?????? ????????? ??????
            - ????????? ????????? ???????????? ?????? ????????? ??????
            
            ????????? ??? ??????
            
            - ??? ????????? ?????? ?????? ???????????? ??? ???
            - ??????????????? ????????? ?????? ???????????? ?????? ??? ???
            
            ??? ??????????????????????????? ???????????? ????????? 
            MBTI ????????? ???????????? ?????? ??? ?????? 
            ?????? ????????? ??? ????????? ????????? ????????????.
        """.trimIndent()
        confirmbtn.setOnClickListener {
            main()
        }
    }

    fun end(){
        setContentView(R.layout.activity_end)
        result = findViewById<TextView>(R.id.Result)
        explanation = findViewById<TextView>(R.id.Explanation)
        gostart = findViewById<Button>(R.id.GoStart)
        var EI = "e or i"; var SN = "s or n"; var TF = "t or f"; var JP = "j or p"

        if(E>I){ EI = "E"
        }else{EI = "I"}
        if(S>N){ SN = "S"
        }else{SN = "N"}
        if(T>F){ TF = "T"
        }else{TF = "F"}
        if(J>P){ JP = "J"
        }else{JP = "P"}

        var MBTI = EI+SN+TF+JP
        result.text = "????????? MBTI??? "+MBTI+"?????????."
        when(MBTI){
            "ISTJ" -> explanation.text = """
                ISTJ???
             ???????????? ?????????, ??????????????????. 
             ????????? ???????????? ??????????????????.
        """.trimIndent()
            "ISFJ" -> explanation.text = """
                ISFJ???
               ???????????? ???????????????, ???????????? ????????????. 
                ????????? ?????? ????????? ????????? ?????? ???????????? ????????????.
            """.trimIndent()
            "INFJ" -> explanation.text = """
                INFJ???
                ?????? ??????????????? ??????????????? ????????? ??????, 
                ???????????? ????????? ??????????????????.
            """.trimIndent()
            "INTJ" -> explanation.text = """
                INTJ???
                ????????? ?????????, ???????????? ???????????????. 
                ??????, ???????????? ???????????????.
            """.trimIndent()
            "ISTP" -> explanation.text = """
                ISTP???
                ???????????? ???????????????, ???????????? ????????????.
            """.trimIndent()
            "ISFP" -> explanation.text = """
                ISFP???
                ???????????? ????????? ????????? ?????? ?????????. 
                ???????????? ?????? ?????? ???????????????.
            """.trimIndent()
            "INFP" -> explanation.text = """
                INFP???
                ???????????? ????????? ?????????, ???????????? ???????????????. 
                ??? ???????????? ?????????, ?????? ????????? ?????? ????????????.
            """.trimIndent()
            "INTP" -> explanation.text = """
                INTP???
                ?????? ???????????? ?????????, 
                ???????????? ???????????? ??????????????????.
            """.trimIndent()
            "ESTP" -> explanation.text = """
                ESTP???
                ????????????, ???????????????, ???????????? ????????? ???????????????. 
                ?????? ?????? ????????? ?????? ???????????? ???????????????.
            """.trimIndent()
            "ESFP" -> explanation.text = """
                ESFP???
                ???????????? ?????????, ???????????? ???????????????. 
                ???????????? ????????? ???????????????.
            """.trimIndent()
            "ENFP" -> explanation.text = """
                ENFP???
                ???????????? ????????????, ???????????? ???????????????. 
                ???????????? ????????? ???????????? ????????? ????????? ????????????.
            """.trimIndent()
            "ENTP" -> explanation.text = """
                ENTP???
                ??????????????????, ???????????? ????????? ????????? ????????????. 
                ????????? ???????????? ???????????? ????????? ????????? ?????? ????????????.
            """.trimIndent()
            "ESTJ" -> explanation.text = """
                ESTJ???
                ??????????????? ?????????, ????????? ???????????? ?????? ???????????????. 
                ?????? ????????? ????????? ????????? ?????? ????????? ????????????.
            """.trimIndent()
            "ESFJ" -> explanation.text = """
                ESFJ???
                ????????? ?????? ????????? ??????,
                ???????????? ????????? ?????? ????????????.
            """.trimIndent()
            "ENFJ" -> explanation.text = """
                ENFJ???
                ???????????????, ????????? ????????? ?????? ???????????????. 
                ????????? ????????? ???????????? ??????????????? ?????????.
            """.trimIndent()
            "ENTJ" -> explanation.text = """
                ENTJ???
                ????????? ??? ??? ???????????? ?????? ????????????.
                ???????????? ?????????, ???????????????, ????????? ????????? ?????? ????????????. 
            """.trimIndent()
        }

        gostart.setOnClickListener {
            start()
        }
    }

    fun main(){
        setContentView(R.layout.activity_main)
        question1 = findViewById<TextView>(R.id.Question1)
        question2 = findViewById<TextView>(R.id.Question2)
        question3 = findViewById<TextView>(R.id.Question3)
        question4 = findViewById<TextView>(R.id.Question4)
        nextbtn = findViewById<Button>(R.id.NextBtn)
        finbtn = findViewById<Button>(R.id.FinBtn)

        questbtngroup1 = findViewById<RadioGroup>(R.id.Rgroup1)
        radiobtn1_1 = findViewById<RadioButton>(R.id.RadioBtn1_1)
        radiobtn1_2 = findViewById<RadioButton>(R.id.RadioBtn1_2)
        radiobtn1_3 = findViewById<RadioButton>(R.id.RadioBtn1_3)
        radiobtn1_4 = findViewById<RadioButton>(R.id.RadioBtn1_4)
        radiobtn1_5 = findViewById<RadioButton>(R.id.RadioBtn1_5)
        radiobtn1_6 = findViewById<RadioButton>(R.id.RadioBtn1_6)

        questbtngroup2 = findViewById<RadioGroup>(R.id.Rgroup2)
        radiobtn2_1 = findViewById<RadioButton>(R.id.RadioBtn2_1)
        radiobtn2_2 = findViewById<RadioButton>(R.id.RadioBtn2_2)
        radiobtn2_3 = findViewById<RadioButton>(R.id.RadioBtn2_3)
        radiobtn2_4 = findViewById<RadioButton>(R.id.RadioBtn2_4)
        radiobtn2_5 = findViewById<RadioButton>(R.id.RadioBtn2_5)
        radiobtn2_6 = findViewById<RadioButton>(R.id.RadioBtn2_6)

        questbtngroup3 = findViewById<RadioGroup>(R.id.Rgroup3)
        radiobtn3_1 = findViewById<RadioButton>(R.id.RadioBtn3_1)
        radiobtn3_2 = findViewById<RadioButton>(R.id.RadioBtn3_2)
        radiobtn3_3 = findViewById<RadioButton>(R.id.RadioBtn3_3)
        radiobtn3_4 = findViewById<RadioButton>(R.id.RadioBtn3_4)
        radiobtn3_5 = findViewById<RadioButton>(R.id.RadioBtn3_5)
        radiobtn3_6 = findViewById<RadioButton>(R.id.RadioBtn3_6)

        questbtngroup4 = findViewById<RadioGroup>(R.id.Rgroup4)
        radiobtn4_1 = findViewById<RadioButton>(R.id.RadioBtn4_1)
        radiobtn4_2 = findViewById<RadioButton>(R.id.RadioBtn4_2)
        radiobtn4_3 = findViewById<RadioButton>(R.id.RadioBtn4_3)
        radiobtn4_4 = findViewById<RadioButton>(R.id.RadioBtn4_4)
        radiobtn4_5 = findViewById<RadioButton>(R.id.RadioBtn4_5)
        radiobtn4_6 = findViewById<RadioButton>(R.id.RadioBtn4_6)

        var quest1 : List<String> = listOf("5. ?????? ????????? ????????? ?????? ??????????????? ???????????? ????????????."
        , "9. ????????? ???????????? ????????? ?????? ????????? ?????????.", "13. ???????????? ????????? ??????????????? ???????????? ?????????."
        , "17. ????????? ?????? ??????????????? ?????? ???????????? ?????? ?????????.", "21. ??????????????? ??????????????? ?????? ?????????."
        , "25. ????????? ???????????? ????????? ???????????? ?????? ???????????? ??????.", "29. ?????? ????????? ????????? ????????? ?????? ???????????? ???????????? ?????? ????????????."
        , "33. ????????? ????????? ?????? ????????????.")

        var quest2 : List<String> = listOf("6. ????????? ??? ????????? ??????????????? ???????????? ?????? ??? ?????? ?????????."
        , "10. ????????? ??? ??? ??????????????? ????????? ?????? ?????????.", "14. ?????? ??? ??? ???????????? ?????? ?????????."
        , "18. 1??? ?????? ????????? ????????? ?????? ?????? ??? ??????.", "22. ????????? ?????? ??? ??????????????? ???????????? ?????? ????????? ????????????."
        , "26. ????????? ???????????? ??? ?????? ?????? ?????????.", "30. ??????????????? ????????? ?????????????????? ??????????????? ????????????."
        , "34. ????????? ????????? ?????? ?????? ???????????? ??? ?????? ?????????.")

        var quest3 : List<String> = listOf("7. ?????? ???????????? ?????? ????????? ???????????? ????????? ?????????."
        , "11. ??????????????? ????????? ????????? ???????????? ???????????? ?????? ?????? ?????? ??? ????????????.", "15. ??????????????? ????????? ??????????????? ????????????."
        , "19. ???????????? ????????? ??????????????? ?????? ?????? ?????? ????????? ??? ??????.", "23. ????????? ????????? ?????? ????????? ????????????."
        , "27. ??????????????? ????????? ??????????????????.", "31. ????????? ?????? ?????? ?????????????????? ???????????? ????????? ?????? ?????? ??? ??????????????? ????????????."
        , "35. ????????? ????????? ??? ??? ???????????? ????????? ?????? ????????? ??????.")

        var quest4 : List<String> = listOf("8. ?????? ?????????????????? ??????????????? ?????? ?????? ?????? ?????????."
        , "12. ?????? ??????????????? ????????????????????? ????????? ?????? ??????????????? ???????????? ?????????.", "16. ????????? ???????????? ????????? ???????????? ?????????."
        , "20. ??????????????? ???????????? ?????? ??? ???????????? ????????????.", "24. ?????? ????????? ?????? ????????? ????????? ?????? ?????? ???????????? ?????????."
        , "28. ????????? ?????? ??????????????? ???????????? ?????????.", "32. ?????? ????????? ?????? ????????? ??? ???????????? ??????."
        , "36. ????????? ????????? ??? ????????? ?????? ?????????.")

        var i = 0

        var next = 0

        nextbtn.setOnClickListener {
            next = 0
            when(questbtngroup1.checkedRadioButtonId){
                R.id.RadioBtn1_1 -> E+=3; R.id.RadioBtn1_2 -> E+=2; R.id.RadioBtn1_3 -> E+=1
                R.id.RadioBtn1_4 -> I+=1; R.id.RadioBtn1_5 -> I+=2; R.id.RadioBtn1_6 -> I+=3
                else -> next=1
            }
            when(questbtngroup2.checkedRadioButtonId){
                R.id.RadioBtn2_1 -> S+=3; R.id.RadioBtn2_2 -> S+=2; R.id.RadioBtn2_3 -> S+=1
                R.id.RadioBtn2_4 -> N+=1; R.id.RadioBtn2_5 -> N+=2; R.id.RadioBtn2_6 -> N+=3
                else -> next=1
            }
            when(questbtngroup3.checkedRadioButtonId){
                R.id.RadioBtn3_1 -> T+=3; R.id.RadioBtn3_2 -> T+=2; R.id.RadioBtn3_3 -> T+=1
                R.id.RadioBtn3_4 -> F+=1; R.id.RadioBtn3_5 -> F+=2; R.id.RadioBtn3_6 -> F+=3
                else -> next=1
            }
            when(questbtngroup4.checkedRadioButtonId){
                R.id.RadioBtn4_1 -> J+=3; R.id.RadioBtn4_2 -> J+=2; R.id.RadioBtn4_3 -> J+=1
                R.id.RadioBtn4_4 -> P+=1; R.id.RadioBtn4_5 -> P+=2; R.id.RadioBtn4_6 -> P+=3
                else -> next=1
            }

            if(next == 1){
                Toast.makeText(applicationContext,"?????? ????????? ???????????????", Toast.LENGTH_SHORT).show()
            }else{
                question1.text = quest1[i]
                question2.text = quest2[i]
                question3.text = quest3[i]
                question4.text = quest4[i]

                questbtngroup1.clearCheck()
                questbtngroup2.clearCheck()
                questbtngroup3.clearCheck()
                questbtngroup4.clearCheck()
                if(i<quest1.size-1){i+=1}
                else{
                    nextbtn.visibility = android.view.View.INVISIBLE
                    finbtn.visibility = android.view.View.VISIBLE
                }
            }
        }

        finbtn.setOnClickListener {
            next = 0
            when(questbtngroup1.checkedRadioButtonId){
                R.id.RadioBtn1_1 -> E+=3; R.id.RadioBtn1_2 -> E+=2; R.id.RadioBtn1_3 -> E+=1
                R.id.RadioBtn1_4 -> I+=1; R.id.RadioBtn1_5 -> I+=2; R.id.RadioBtn1_6 -> I+=3
                else -> next=1
            }
            when(questbtngroup2.checkedRadioButtonId){
                R.id.RadioBtn2_1 -> S+=3; R.id.RadioBtn2_2 -> S+=2; R.id.RadioBtn2_3 -> S+=1
                R.id.RadioBtn2_4 -> N+=1; R.id.RadioBtn2_5 -> N+=2; R.id.RadioBtn2_6 -> N+=3
                else -> next=1
            }
            when(questbtngroup3.checkedRadioButtonId){
                R.id.RadioBtn3_1 -> T+=3; R.id.RadioBtn3_2 -> T+=2; R.id.RadioBtn3_3 -> T+=1
                R.id.RadioBtn3_4 -> F+=1; R.id.RadioBtn3_5 -> F+=2; R.id.RadioBtn3_6 -> F+=3
                else -> next=1
            }
            when(questbtngroup4.checkedRadioButtonId){
                R.id.RadioBtn4_1 -> J+=3; R.id.RadioBtn4_2 -> J+=2; R.id.RadioBtn4_3 -> J+=1
                R.id.RadioBtn4_4 -> P+=1; R.id.RadioBtn4_5 -> P+=2; R.id.RadioBtn4_6 -> P+=3
                else -> next=1
            }
            if(next == 1) {
                Toast.makeText(applicationContext, "?????? ????????? ???????????????", Toast.LENGTH_SHORT).show()
            }else{
                end()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        start()
    }
}