/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hugo.pe.programando_02;

import hugo.pe.dto.VentaDto;
import hugo.pe.service.VentaService;

public class Programando_02 {

    public static void main(String[] args) {
        VentaDto dto = new VentaDto();
        
        dto.setProduct("TV");
        dto.setPrice(100);
        dto.setQuantity(2);
        
        VentaService service = new VentaService();
        
        dto = service.process(dto);
        
        System.out.println("name " + dto.getProduct());
        System.out.println("importe " + dto.getImporte());
        System.out.println("taxes " + dto.getTaxes());
        System.out.println("total = " + dto.getTotal());
    }
}
