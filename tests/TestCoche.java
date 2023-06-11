import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void Carlos_Arroyo_Galán_Test_al_Crear_un_Coche_su_velocidad_es_cero(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
    @Test
    public void Carlos_Arroyo_Galán_Test_al_acelerar_un_Coche_su_velocidad_aumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void Carlos_Arroyo_Galán_Test_al_decelerar_un_Coche_su_velocidad_disminuye(){
        Coche nuevoCoche  = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void Carlos_Arroyo_Galán_Test_al_decelerar_un_Coche_su_velocidad_no_puede_ser_menor_que_cero(){
        Coche nuevoCoche  = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(80);
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
}
