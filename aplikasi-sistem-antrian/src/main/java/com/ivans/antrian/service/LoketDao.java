/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivans.antrian.service;

import com.ivans.antrian.domain.Loket;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ivans
 */
@Repository
public interface LoketDao extends PagingAndSortingRepository<Loket, String>{
    Loket findByNomorLoket(int nomor);
    List<Loket> findByKategoriIdOrderByNomorLoketAsc(String idKategory);
}
