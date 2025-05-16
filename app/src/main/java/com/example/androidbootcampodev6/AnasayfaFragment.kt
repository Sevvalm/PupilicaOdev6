package com.example.androidbootcampodev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.androidbootcampodev6.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"Bordo Ayakkabı","ayakkabi1",
            "Bordo Ayakkabı! Konforu ve şıklığı bir arada sunan, her adımda rahatlık sağlayan kaliteli ayakkabı.",367)
        val u2 = Urunler(2,"Kahverengi Ayakkabı","ayakkabi2",
            "Kahverengi Ayakkabı! Konforu ve şıklığı bir arada sunan, her adımda rahatlık sağlayan kaliteli ayakkabı.",585)
        val u3 = Urunler(3,"Siyah Ayakkabı","ayakkabi3",
            "Siyah Ayakkabı! Konforu ve şıklığı bir arada sunan, her adımda rahatlık sağlayan kaliteli ayakkabı.",879)

        val u4 = Urunler(4,"Kol Çantası","canta1",
            "Kol Çntası! Modern tasarımı ve geniş iç hacmiyle günlük kullanım için ideal, şıklığınızı tamamlayan kullanışlı çanta.",459)
        val u5 = Urunler(5,"Kahverengi Çanta","canta2",
            "Kahverengi Çanta! Modern tasarımı ve geniş iç hacmiyle günlük kullanım için ideal, şıklığınızı tamamlayan kullanışlı çanta.",850)
        val u6 = Urunler(6,"Beyaz Çanta","canta3",
            "Beyaz Çanta! Modern tasarımı ve geniş iç hacmiyle günlük kullanım için ideal, şıklığınızı tamamlayan kullanışlı çanta.",969)

        val u7 = Urunler(6,"Siyah Hırka","hirka",
            "Siyah Hırka! Yumuşak dokusu ve şık kesimiyle serin havalar için vazgeçilmez, rahat hırka.",257)

        val u8 = Urunler(6,"Siyah Pantolon","pantolon1",
            "Siyah Pantolon! Şıklığı ve konforu bir arada sunan, her mevsime uygun klasik kesim pantolon. Günlük kullanıma ve özel davetlere rahatlıkla uyum sağlar.",379)
        val u9 = Urunler(6,"Beyaz Pantolon","pantolon2",
            "Beyaz Pantolon! Şıklığı ve konforu bir arada sunan, her mevsime uygun klasik kesim pantolon. Günlük kullanıma ve özel davetlere rahatlıkla uyum sağlar.",686)

        val u10 = Urunler(6,"Mavi Tshirt","tshirt1",
            "Mavi Tshirt! Nefes alabilir kumaşı ve rahat kesimiyle günlük kullanım için mükemmel, klasik tişört.",399)
        val u11 = Urunler(6,"Sarı Tshirt","tshirt2",
            "Sarı Tshirt! Nefes alabilir kumaşı ve rahat kesimiyle günlük kullanım için mükemmel, klasik tişört.",422)
        val u12 = Urunler(6,"Siyah/Beyaz Tshirt","tshirt3",
            "Siyah/Beyaz  Tshirt! Nefes alabilir kumaşı ve rahat kesimiyle günlük kullanım için mükemmel, klasik tişört.",450)

        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)
        urunlerListesi.add(u8)
        urunlerListesi.add(u9)
        urunlerListesi.add(u10)
        urunlerListesi.add(u11)
        urunlerListesi.add(u12)

        val urunlerAdapter = UrunlerAdapter(requireContext(),urunlerListesi)
        binding.urunlerRv.adapter =urunlerAdapter

        binding.urunlerRv.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        return binding.root
    }

}