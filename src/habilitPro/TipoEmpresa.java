package habilitPro;

import habilitPro.enums.EnumTotal;

public class TipoEmpresa {

    private int idTipoEmpresa;
    private EnumTotal tipoEmpresa;

    TipoEmpresa(int idTipoEmpresa, EnumTotal tipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
        this.tipoEmpresa = tipoEmpresa;
    }

    public int getIdTipoEmpresa() {
        return idTipoEmpresa;
    }

    public void setIdTipoEmpresa(int idTipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
    }

    public EnumTotal getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(EnumTotal tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public String toString() {
        return "TipoEmpresa{" +
                "idTipoEmpresa=" + idTipoEmpresa +
                ", tipoEmpresa=" + tipoEmpresa +
                '}';
    }
}
