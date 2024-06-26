package com.streafy.androidacademyfundamentals

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SampleBottomSheet : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_fragment_ws04, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("TEST", "?")

        view.findViewById<Button>(R.id.btn_ok).apply {
            setOnClickListener {
                Log.d("TEST", "ok")
                Toast.makeText(context, "ok", Toast.LENGTH_SHORT).show()
                dismiss()
            }
        }

        view.findViewById<Button>(R.id.btn_cancel).apply {
            setOnClickListener {
                Log.d("TEST", "cancel")
                Toast.makeText(context, "cancel", Toast.LENGTH_SHORT).show()
                dismiss()
            }
        }
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        Toast.makeText(context, "AlertDialog closed", Toast.LENGTH_SHORT).show()
    }
}