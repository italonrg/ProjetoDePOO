package ProgramaçãoFuncional;

public class MinhaaComparações extends Comparator implements java.util.Comparator<ProductLambida> {

    public int compare(ProductLambida pro01, ProductLambida pro02){
        return pro01.getName().toUpperCase().compareTo(pro02.getName().toUpperCase());//todo: ToUpercase e para comparar uma valor com o outro ssem importar se maiusculo ou minusculo;
    }


    @Override
    public java.util.Comparator<ProductLambida> reversed() {
        return java.util.Comparator.super.reversed();
    }

}
