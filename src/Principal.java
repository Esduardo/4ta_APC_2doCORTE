import models.LecturaDatos;
import models.Procesos;
import models.SalidaInformacion;

public class Principal {
    public static void main(String [] srgs){
        //--------------------------------------------------------------------------------------------------------------
        //                                              LECTURA
        LecturaDatos.lectura();
        //--------------------------------------------------------------------------------------------------------------
        //                                          PROCESOS
       double procesos = Procesos.procesos(LecturaDatos.getLongitudRadio());
       //---------------------------------------------------------------------------------------------------------------
       //                                         SALDIA DE INFORMACION
        double salida = SalidaInformacion.salidaDatos(procesos);
    }
}
