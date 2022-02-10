package habilitPro.enums;

public enum EnumTotal implements StringValueEnum{
    //TIPO SEGMENTO
    ALIMENTOS("ALIMENTOSBEBIDAS", "Alimentos e Bebidas"),
    CELULOSE("CELULOSE", "Celulose e Papel"),
    CONSTRUCAO("CONTRUCAO", "Construção"),
    EQUIPAMENTO("EQUIPAMENTOELETRICO","Equipamentos elétricos"),
    FARMACOS("FARMACOS", "Fármacos e Equipamentos de Saúde"),
    FUMO("FUMO", "Fumo"),
    INDUSTRIAAUTOMOTIVA("INDUSTRIAAUTOMOTIVA", "Indústria Automotiva"),
    INDUSTRIACERAMICA("INDUSTRIACERAMICA", "Indústria Cerâmica"),
    INDUSTRIADIVERSA("INDUSTRIADIVERSA", "Indústria Diversa"),
    INDUSTRIAEXTRATIVA("INDUSTRIAEXTRATIVA", "Indústria Extrativa"),
    INDUSTRIAGRAFICA("INDUSTRIAGRAFICA", "Indústria Gráfica"),

    //ENUM TIPO EMPRESA
    MATRIZ("MATRIZ","Matriz"),
    FILIAL("FILIAL", "Filial");



//    MADEIRAEMOVEIS(value, displayName),
//    MAQUINASEEQUIPAMENTOS(value, displayName),
//    METALMECANICAEMETALURGIA(value, displayName),
//    OLEOGASELETRICIDADE(value, displayName),
//    PRODUTOSQUIMICOSPLASTICOS(value, displayName),
//    SANEAMENTOBASICO(value, displayName),
//    TIC(value, displayName),
//    TEXTILCONFECCAO(value, displayName);

    private final String value;
    private final String displayName;

    EnumTotal(String value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }


    @Override
    public String getValue() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }
}
