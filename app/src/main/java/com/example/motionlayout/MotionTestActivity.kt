package com.example.motionlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout

class MotionTestActivity : AppCompatActivity() {

    private lateinit var motionLayout: MotionLayout
    var boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_test)
        motionLayout = findViewById(R.id.motion_layout)

        motionLayout.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {
            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {
            }
        })
    }

    fun startTransition(view: View) {
        when (motionLayout.currentState) {
            R.id.baseState -> motionLayout.transitionToState(R.id.halfState)
            R.id.halfState -> motionLayout.transitionToState(R.id.endState)
            R.id.endState -> motionLayout.transitionToState(R.id.baseState)
            /*R.id.state3 -> motionlayout.transitionToState(R.id.state4)
            R.id.state4 -> motionlayout.transitionToState(R.id.state5)
            R.id.state5 -> motionlayout.transitionToState(R.id.state1)*/
        }
    }
}
