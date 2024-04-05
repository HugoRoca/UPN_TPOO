/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hugo.pe.service;

import hugo.pe.dto.VentaDto;

/**
 *
 * @author hugoroca
 */
public class VentaService {

    public VentaDto process(VentaDto dto) {
        double importe = 0;
        double taxes = 0;
        double total = 0;
        
        dto.setImporte(importe);
        dto.setTaxes(taxes);
        dto.setTotal(total);
        
        return dto;
    }
}
