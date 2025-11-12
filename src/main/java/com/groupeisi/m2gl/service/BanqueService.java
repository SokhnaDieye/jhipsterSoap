package com.groupeisi.m2gl.service;

import java.util.Map;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class BanqueService {

    private Map<Long, Long> comptes = new HashMap<>();
    public BanqueService() {
        comptes.put(781234567L, 150000L);
        comptes.put(761112233L, 80000L);
        comptes.put(701234567L, 25000L);
    }

    public long getSolde(long tel) {
        return comptes.getOrDefault(tel, 0L);
    }

}
