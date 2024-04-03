
package pe.edu.upn.mateapp.test;


import pe.edu.upn.mateapp.service.MateService;

/**
 *
 * @author UPN
 */
public class Test01 {
    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 40;
        int shouldBe = 100;
        
        MateService service = new MateService();
        
        if (service.sumar(num1, num2) == shouldBe){
            System.out.println("It´s ok");
        } else {
            System.out.println("Faild");
        }
    }
}
