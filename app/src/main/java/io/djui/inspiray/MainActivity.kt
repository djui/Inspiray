package io.djui.inspiray

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random
import kotlin.random.nextUInt


class MainActivity : AppCompatActivity() {
    private val images = intArrayOf(
        R.drawable.doodle_1,
        R.drawable.doodle_2,
        R.drawable.doodle_3,
        R.drawable.doodle_4,
        R.drawable.doodle_5,
        R.drawable.doodle_6,
        R.drawable.doodle_7,
        R.drawable.doodle_8,
        R.drawable.doodle_9,
        R.drawable.doodle_10,
        R.drawable.doodle_11,
        R.drawable.doodle_12,
        R.drawable.doodle_13,
        R.drawable.doodle_14,
        R.drawable.doodle_15,
        R.drawable.doodle_16,
        R.drawable.doodle_17,
        R.drawable.doodle_18,
        R.drawable.doodle_19,
        R.drawable.doodle_20,
        R.drawable.doodle_21,
        R.drawable.doodle_22,
        R.drawable.doodle_23,
        R.drawable.doodle_24,
        R.drawable.doodle_25,
        R.drawable.doodle_26,
        R.drawable.doodle_27,
        R.drawable.doodle_28,
        R.drawable.doodle_29,
        R.drawable.doodle_30,
        R.drawable.doodle_31,
        R.drawable.doodle_32,
        R.drawable.doodle_33,
        R.drawable.doodle_34,
        R.drawable.doodle_35,
        R.drawable.doodle_36,
        R.drawable.doodle_37,
        R.drawable.doodle_38,
        R.drawable.doodle_39,
        R.drawable.doodle_40,
        R.drawable.doodle_41,
        R.drawable.doodle_42,
        R.drawable.doodle_43,
        R.drawable.doodle_44,
        R.drawable.doodle_45,
        R.drawable.doodle_46,
        R.drawable.doodle_47,
        R.drawable.doodle_48,
        R.drawable.doodle_49,
        R.drawable.doodle_50,
        R.drawable.doodle_51,
        R.drawable.doodle_52,
        R.drawable.doodle_53,
        R.drawable.doodle_54,
        R.drawable.doodle_55,
        R.drawable.doodle_56,
        R.drawable.doodle_57,
        R.drawable.doodle_58,
        R.drawable.doodle_59,
        R.drawable.doodle_60,
        R.drawable.doodle_61,
        R.drawable.doodle_62,
        R.drawable.doodle_63,
        R.drawable.doodle_64,
        R.drawable.doodle_65,
        R.drawable.doodle_66,
        R.drawable.doodle_67,
        R.drawable.doodle_68,
        R.drawable.doodle_69,
        R.drawable.doodle_70,
        R.drawable.doodle_71,
        R.drawable.doodle_72,
        R.drawable.doodle_73,
        R.drawable.doodle_74,
        R.drawable.doodle_75,
        R.drawable.doodle_76,
        R.drawable.doodle_77,
        R.drawable.doodle_78,
        R.drawable.doodle_79,
        R.drawable.doodle_80,
        R.drawable.doodle_81,
        R.drawable.doodle_82,
        R.drawable.doodle_83,
        R.drawable.doodle_84,
        R.drawable.doodle_85,
        R.drawable.doodle_86,
        R.drawable.doodle_87,
        R.drawable.doodle_88,
        R.drawable.doodle_89,
        R.drawable.doodle_90,
        R.drawable.doodle_91,
        R.drawable.doodle_92,
        R.drawable.doodle_93,
        R.drawable.doodle_94,
        R.drawable.doodle_95,
        R.drawable.doodle_96,
        R.drawable.doodle_97,
        R.drawable.doodle_98,
        R.drawable.doodle_99,
        R.drawable.doodle_100,
        R.drawable.doodle_101,
        R.drawable.doodle_102,
        R.drawable.doodle_103,
        R.drawable.doodle_104,
        R.drawable.doodle_105,
        R.drawable.doodle_106,
        R.drawable.doodle_107,
        R.drawable.doodle_108,
        R.drawable.doodle_109,
        R.drawable.doodle_110,
        R.drawable.doodle_111,
        R.drawable.doodle_112,
        R.drawable.doodle_113,
        R.drawable.doodle_114,
        R.drawable.doodle_115,
        R.drawable.doodle_116,
        R.drawable.doodle_117,
        R.drawable.doodle_118,
        R.drawable.doodle_119,
        R.drawable.doodle_120,
        R.drawable.doodle_121,
        R.drawable.doodle_122,
        R.drawable.doodle_123,
        R.drawable.doodle_124,
        R.drawable.doodle_125,
        R.drawable.doodle_126,
        R.drawable.doodle_127,
        R.drawable.doodle_128,
        R.drawable.doodle_129,
        R.drawable.doodle_130,
        R.drawable.doodle_131,
        R.drawable.doodle_132,
        R.drawable.doodle_133,
        R.drawable.doodle_134,
        R.drawable.doodle_135,
        R.drawable.doodle_136,
        R.drawable.doodle_137,
        R.drawable.doodle_138,
        R.drawable.doodle_139,
        R.drawable.doodle_140,
        R.drawable.doodle_141,
        R.drawable.doodle_142,
        R.drawable.doodle_143,
        R.drawable.doodle_144,
        R.drawable.doodle_145,
        R.drawable.doodle_146,
        R.drawable.doodle_147,
        R.drawable.doodle_148,
        R.drawable.doodle_149,
        R.drawable.doodle_150,
    )
    private val dayOfYear = Calendar.DAY_OF_YEAR
    private val seed = Calendar.getInstance().get(dayOfYear).toUInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<FloatingActionButton>(R.id.refreshFab).setOnClickListener {
            val s = Random.nextUInt()
            val r = Random(s.toInt())
            updateContent("#$s", r)
        }
        findViewById<FloatingActionButton>(R.id.resetFab).setOnClickListener {
            initialContent()
        }

        initialContent()
    }

    private fun initialContent() {
        updateContent("Today (#$seed)", Random(seed.toInt()))
    }

    override fun onResume() {
        super.onResume()

        if (Calendar.DAY_OF_YEAR != dayOfYear) {
            initialContent()
        }
    }

    private fun updateContent(title: String, random: Random) {
        val colorA = randomColor(random)
        val colorB = randomColor(random)
        val colorAHex = "#" + Integer.toHexString(colorA).substring(2) // skip alpha
        val colorBHex = "#" + Integer.toHexString(colorB).substring(2) // skip alpha

        doodleImage.setImageResource(images[random.nextInt(images.size)])

        this.title = title

        colorAButton.setBackgroundColor(colorA)
        colorAButton.setTextColor(if(isDark(colorA)) Color.WHITE else Color.BLACK)
        colorAButton.text = colorAHex

        colorBButton.setBackgroundColor(colorB)
        colorBButton.setTextColor(if(isDark(colorB)) Color.WHITE else Color.BLACK)
        colorBButton.text = colorBHex
    }

    private fun randomColor(random: Random): Int {
        return Color.argb(
            255,
            random.nextInt(256),
            random.nextInt(256),
            random.nextInt(256)
        )
    }

    private fun isDark(c: Int): Boolean {
        return Color.luminance(c) < 0.5
    }
}