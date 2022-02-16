package habilitPro.Utils;

import habilitPro.Cidade;
import habilitPro.Estado;

import java.util.ArrayList;

import static habilitPro.HabilitPro.cidades;
import static habilitPro.HabilitPro.estados;

public class PopularArrays {
    public void populacidade(){
        Estado est1 = new Estado(1,"Santa Catarina","SC");
        estados.add(est1);
        Cidade cid1 = new Cidade(1,"Florianópolis",est1);
        cidades.add(cid1);
    }

}
