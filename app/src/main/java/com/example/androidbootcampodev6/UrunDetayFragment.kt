package com.example.androidbootcampodev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.androidbootcampodev6.databinding.FragmentUrunDetayBinding
import com.google.android.material.snackbar.Snackbar

class UrunDetayFragment : Fragment() {
    private lateinit var binding : FragmentUrunDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUrunDetayBinding.inflate(inflater,container,false)

        val bundle : UrunDetayFragmentArgs by navArgs()
        val urun = bundle.urunlerNesnesi

        binding.toolbarUrunDetay.title = urun.urunAdi

        binding.imageViewSepetResim.setImageResource(
            resources.getIdentifier(urun.resim, "drawable", requireContext().packageName)
        )

        binding.textViewUrunAciklama.text = urun.hakkinda
        binding.textViewFiyat.text = "${urun.fiyat}₺"


        binding.buttonSepeteEkle.setOnClickListener {
            Snackbar.make(it, "${urun.urunAdi} sepete eklendi!", Snackbar.LENGTH_SHORT).show()

            val gecis = UrunDetayFragmentDirections.urunDGecisSepet(urunlerNesnesi = urun)
            Navigation.findNavController(it).navigate(gecis)
        }



        return binding.root
    }

}