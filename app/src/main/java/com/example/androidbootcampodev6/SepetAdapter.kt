package com.example.androidbootcampodev6

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

import com.example.androidbootcampodev6.databinding.SepetCardTasarimBinding
import com.google.android.material.snackbar.Snackbar

class SepetAdapter(var mContext: Context, var sepetListesi: ArrayList<Urunler>) :
    RecyclerView.Adapter<SepetAdapter.CardSepetTasarimTutucu>() {

    inner class CardSepetTasarimTutucu(var tasarim: SepetCardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardSepetTasarimTutucu {
        val binding = SepetCardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardSepetTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardSepetTasarimTutucu, position: Int) {
        val urun = sepetListesi.first()
        val t = holder.tasarim

        t.imageViewUrun.setImageResource(
            mContext.resources.getIdentifier(urun.resim, "drawable", mContext.packageName)
        )

        t.textViewFiyat.text = "${urun.fiyat}₺"
        t.textViewUrunAdi.text = urun.urunAdi

        t.buttonSatinAl.setOnClickListener {
            Snackbar.make(it, "${urun.urunAdi} satın alındı!", Snackbar.LENGTH_SHORT).show()
        }
    }


    override fun getItemCount(): Int {
        return sepetListesi.size
    }
}
