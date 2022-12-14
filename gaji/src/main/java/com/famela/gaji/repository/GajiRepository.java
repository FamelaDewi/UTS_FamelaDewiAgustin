/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famela.gaji.repository;

import com.famela.gaji.entity.Gaji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface GajiRepository extends JpaRepository<Gaji, Long>{
    public Gaji findByGajiId(Long gajiId);
}
