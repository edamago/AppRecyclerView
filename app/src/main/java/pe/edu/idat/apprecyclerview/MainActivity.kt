package pe.edu.idat.apprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.apprecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvElementos.layoutManager=LinearLayoutManager(applicationContext)
        binding.rvElementos.adapter=AdapterItem(listaElementos())
    }

    private fun listaElementos():List<String>{
        val lista=ArrayList<String>()
        var i=0
        while(i<10)
        {
            lista.add("posicion $i")
            i++
        }
        return lista
    }
}