package habilitPro;

import habilitPro.enums.EnumTotal;

public class TipoEmpresaFilial extends TipoEmpresa{

    private String nomeFilial;

    public TipoEmpresaFilial(int idTipoEmpresa, EnumTotal tipoEmpresa) {
        super(idTipoEmpresa, tipoEmpresa);
    }

    public TipoEmpresaFilial(int idTipoEmpresa, EnumTotal tipoEmpresa, String nomeFilial) {
        super(idTipoEmpresa, tipoEmpresa);
        this.nomeFilial = nomeFilial;
    }
}
