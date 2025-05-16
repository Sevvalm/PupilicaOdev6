package com.example.androidbootcampodev6

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidbootcampodev6.databinding.FragmentSepetBinding

class SepetFragment : Fragment() {
    private lateinit var binding : FragmentSepetBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSepetBinding.inflate(inflater, container, false)

        val bundle: SepetFragmentArgs by navArgs()
        val urun = bundle.urunlerNesnesi
        val urunlerListesi = ArrayList<Urunler>()
        urunlerListesi.add(urun)

        //val sepetListesi = urun
        Log.e("urun","${urunlerListesi.first().urunAdi}")

        // Adapter ve RecyclerView bağlama
        val adapter = SepetAdapter(requireContext(), urunlerListesi)
        binding.sepetRv.layoutManager = LinearLayoutManager(requireContext())
        binding.sepetRv.adapter = adapter

        return binding.root
    }
}
