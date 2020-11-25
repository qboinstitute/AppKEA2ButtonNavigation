package qbo.com.appkea2buttonnavigationv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar


class PrincipalFragment : Fragment() {
    private lateinit var etmensaje : EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_principal, container, false)
        val btnmensaje: Button = vista.findViewById(R.id.btnmensaje)
        etmensaje = vista.findViewById(R.id.etmensaje)
        btnmensaje.setOnClickListener {
            enviarMensaje(it)
        }
        return vista
    }
    private fun enviarMensaje(vista: View){
        val mensaje = etmensaje.text.toString()
        Snackbar.make(vista, mensaje, Snackbar.LENGTH_LONG).show()
    }

}