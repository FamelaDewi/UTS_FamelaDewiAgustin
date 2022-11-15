/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famela.gaji.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author HP
 */
public class Gaji {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gajiTanggal;
    private Long pegawaiNIP;
    private Long gapok;
    private Long tunj_anak;
    private Long tunj_istri;
    private Long getGapok;
    private Long getGajiBersih;

    public String getPegawaiNIP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
