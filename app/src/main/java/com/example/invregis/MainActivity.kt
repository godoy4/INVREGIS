package com.example.invregis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var personas: Persona

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val persona1= Persona("Daniel", apellidoPaterno = "Alvarez",
            apellidoMaterno = "Galo", edad = "24")
        val persona2= Persona("Cristian", apellidoPaterno = "Godoy",
            apellidoMaterno = "Casco", edad ="24" )
        val persona3= Persona("Aleyda", apellidoPaterno =
        "Jesus", apellidoMaterno = "Cruz", edad ="33" )
        val persona4= Persona("david", apellidoPaterno =
        "rosales", apellidoMaterno = "flores", edad ="37" )
        val persona5= Persona("allan", apellidoPaterno =
        "cruz", apellidoMaterno = "fonseca", edad ="25" )

        var personas= mutableListOf(persona1,persona2,persona3,persona4,persona5)

        agregar_btn.setOnClickListener {
            val nombre = nombre.text.toString()
            val paterno= paterno.text.toString()
            val materno= materno.text.toString()
            val edad=    edad.text.toString()

            val persona= Persona(nombre,paterno,materno,edad)

            personas.add(persona)


        }


        fun actualizarListView(){}
        val listaString = mutableListOf<String>()
        for (persona in personas) {
            listaString.add("${persona.Nombres} ${persona.apellidoPaterno} " +
                    "${persona.apellidoMaterno} ${persona.edad}")


        }


        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listaString)

        list.adapter=  adapter


    }

}
