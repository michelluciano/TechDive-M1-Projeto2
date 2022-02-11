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
    FILIAL("FILIAL", "Filial"),

    //ENUM SATISFACAO
    SATISFACAO1("1","Satisfação 1"),
    SATISFACAO2("2","Satisfação 2"),
    SATISFACAO3("3","Satisfação 3"),
    SATISFACAO4("4","Satisfação 4"),
    SATISFACAO5("5","Satisfação 5"),

    //ENUM MÒDULO
    NAOINICIADO("NAOINICIADO", "Curso não iniciado"),
    EMANDAMENTO("EMANDAMENTO", "Curso em andamento"),
    FASEAVALIACAO("FASEAVALIACAO", "Em fase de valiação"),
    AVALIACAOFINALIZADA("AVALIACAOFINALIZADA", "Fase de avaliação finalizada");


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
