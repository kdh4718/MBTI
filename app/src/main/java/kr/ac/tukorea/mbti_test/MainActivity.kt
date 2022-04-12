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
            문항선택 기준
            
            - 지속적이고 일관성 있게 사용하는 경향
            - 습관처럼 크게 의식하지 않고 자주 쓰는 경향
            - 상대적으로 더 쉽게 끌리는 경향
            - 자신이 바라는 이상형이 아닌 편안한 경향
            
            피해야 할 사항
            
            - 한 문장에 너무 오래 머무르지 말 것
            - 의식적으로 일관성 있게 응답하려 하지 말 것
            
            이 애플리케이션에서의 테스트로 나오는 
            MBTI 유형은 정확하지 않을 수 있고 
            특정 유형이 더 좋거나 나쁘지 않습니다.
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
        result.text = "당신의 MBTI는 "+MBTI+"입니다."
        when(MBTI){
            "ISTJ" -> explanation.text = """
                ISTJ는
             책임감이 강하며, 현실적입니다. 
             매사에 철저하고 보수적입니다.
        """.trimIndent()
            "ISFJ" -> explanation.text = """
                ISFJ는
               차분하고 헌신적이며, 인내심이 강합니다. 
                타인의 감정 변화에 주의를 많이 기울이는 편입니다.
            """.trimIndent()
            "INFJ" -> explanation.text = """
                INFJ는
                높은 통찰력으로 사람들에게 영감을 주며, 
                공동체의 이익을 중요시합니다.
            """.trimIndent()
            "INTJ" -> explanation.text = """
                INTJ는
                의지가 강하고, 독립적인 사람입니다. 
                또한, 분석력이 뛰어납니다.
            """.trimIndent()
            "ISTP" -> explanation.text = """
                ISTP는
                과묵하고 분석적이며, 적응력이 강합니다.
            """.trimIndent()
            "ISFP" -> explanation.text = """
                ISFP는
                온화하고 겸손한 성격을 갖고 있으며. 
                여유롭게 사는 것을 좋아합니다.
            """.trimIndent()
            "INFP" -> explanation.text = """
                INFP는
                성실하고 이해심 많으며, 개방적인 사람입니다. 
                잘 표현하지 않으나, 내적 신념도 강한 편입니다.
            """.trimIndent()
            "INTP" -> explanation.text = """
                INTP는
                지적 호기심이 높으며, 
                잠재력과 가능성을 중요시합니다.
            """.trimIndent()
            "ESTP" -> explanation.text = """
                ESTP는
                느긋하고, 관용적이며, 타협하는 능력이 뛰어납니다. 
                그에 따라 현실적 문제 해결에도 능숙합니다.
            """.trimIndent()
            "ESFP" -> explanation.text = """
                ESFP는
                호기심이 많으며, 개방적인 사람입니다. 
                구체적인 사실을 중시합니다.
            """.trimIndent()
            "ENFP" -> explanation.text = """
                ENFP는
                상상력이 풍부하고, 순발력이 뛰어납니다. 
                일상적인 활동에 지루함을 느끼는 경우가 있습니다.
            """.trimIndent()
            "ENTP" -> explanation.text = """
                ENTP는
                박학다식하고, 독창적인 면모를 가지고 있습니다. 
                그러한 성격답게 끊임없이 새로운 시도를 하는 편입니다.
            """.trimIndent()
            "ESTJ" -> explanation.text = """
                ESTJ는
                체계적으로 일하고, 규칙을 준수하는 것을 좋아합니다. 
                그런 성격에 걸맞게 사실적 목표 설정에 능합니다.
            """.trimIndent()
            "ESFJ" -> explanation.text = """
                ESFJ는
                사람에 대한 관심이 많고,
                친절하며 동정심 또한 많습니다.
            """.trimIndent()
            "ENFJ" -> explanation.text = """
                ENFJ는
                사교적이고, 타인의 의견을 매우 존중합니다. 
                비판을 받으면 예민하게 반응하기도 합니다.
            """.trimIndent()
            "ENTJ" -> explanation.text = """
                ENTJ는
                준비를 할 때 철저하게 하는 편입니다.
                통솔력이 있으며, 활동적이고, 단호한 면모가 있는 편입니다. 
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

        var quest1 : List<String> = listOf("5. 처음 만나는 사람이 많은 장소에서도 활발하게 행동한다."
        , "9. 평소에 활발하며 친구를 많이 사귀는 편이다.", "13. 모임에서 활동을 적극적으로 주도하는 편이다."
        , "17. 생각을 많이 하기보다는 일단 행동하고 보는 편이다.", "21. 낯가림이나 부끄러움이 없는 편이다."
        , "25. 자신의 의견이나 감정을 표현하는 것에 거리낌이 없다.", "29. 혼자 시간을 보내는 것보다 다른 사람들과 어울리는 것을 좋아한다."
        , "33. 유행을 따르는 것을 좋아한다.")

        var quest2 : List<String> = listOf("6. 설명은 잘 하지만 머릿속으로 구상하는 것을 잘 하지 못한다."
        , "10. 요리를 할 때 레시피대로 정확히 하는 편이다.", "14. 일을 할 때 꼼꼼하게 하는 편이다."
        , "18. 1분 동안 아무런 생각을 하지 않을 수 있다.", "22. 노래를 들을 때 가사보다는 멜로디가 좋은 노래를 선호한다."
        , "26. 새로운 일보다는 늘 하는 일이 편하다.", "30. 즉흥적으로 시간을 보내기보다는 계획적으로 움직인다."
        , "34. 새로운 제품을 사면 제품 설명서를 다 읽는 편이다.")

        var quest3 : List<String> = listOf("7. 다른 사람들이 나를 어떻게 생각할지 신경이 쓰인다."
        , "11. 말싸움에서 이기는 것보다 상대방을 불쾌하지 않게 하는 것이 더 중요하다.", "15. 결과보다는 과정이 중요하다고 생각한다."
        , "19. 잘했다는 말보다 고생했다는 말을 듣는 것이 기분이 더 좋다.", "23. 슬픔을 나누면 반이 된다고 생각한다."
        , "27. 이해보다는 공감을 우선시합니다.", "31. 실패에 대한 빠른 피드백보다는 격려하고 위로해 주는 말이 더 중요하다고 생각한다."
        , "35. 중요한 판단을 할 때 논리보다 감정에 따른 선택을 한다.")

        var quest4 : List<String> = listOf("8. 방이 어수선하거나 지저분해도 신경 쓰지 않는 편이다."
        , "12. 일을 계획적으로 진행하기보다는 상황에 따라 유동적으로 진행하는 편이다.", "16. 섣부른 판단이나 계획을 좋아하지 않는다."
        , "20. 규칙보다는 자유로운 것이 더 중요하다 생각한다.", "24. 다른 사람이 나의 행동에 영향을 주는 것을 좋아하지 않는다."
        , "28. 여행을 가면 즉흥적으로 움직이는 편이다.", "32. 개인 공간의 정리 정돈이 잘 되어있지 않다."
        , "36. 계획을 세워도 잘 지키지 않는 편이다.")

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
                Toast.makeText(applicationContext,"모든 문항을 선택하세요", Toast.LENGTH_SHORT).show()
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
                Toast.makeText(applicationContext, "모든 문항을 선택하세요", Toast.LENGTH_SHORT).show()
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