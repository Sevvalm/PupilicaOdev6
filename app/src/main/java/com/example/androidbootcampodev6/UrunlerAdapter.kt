package com.example.androidbootcampodev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.androidbootcampodev6.databinding.CardTasarimBinding

class UrunlerAdapter(var mContext: Context, var urunlerListesi: List<Urunler>) : RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        var binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)
        val u = holder.tasarim

        u.textViewFiyat.text = "${urun.fiyat}₺"

        u.textViewUrunAdi.text = "${urun.urunAdi}"

        u.imageViewUrun.setImageResource(
            mContext.resources.getIdentifier(urun.resim,"drawable",mContext.packageName)
        )

        u.cardViewUrun.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.anasayfaGecisUrunD(urunlerNesnesi = urun)
            Navigation.findNavController(it).navigate(gecis)
        }

        u.buttonSepet.isEnabled = false
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }


}