package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
// GitHub Pages'taki sitenin bu Java sunucusuna erişebilmesi için bu satır şart:
@CrossOrigin(origins = "*")     
public class RandevuController {

    @GetMapping("/api/mesaj")
    public Map<String, String> mesajVer() {
        Map<String, String> cevap = new HashMap<>();
        cevap.put("durum", "Aktif");
        cevap.put("icerik", "Berber Randevu Sistemi arka planı başarıyla çalışıyor kankam!");
        return cevap;
    }
}