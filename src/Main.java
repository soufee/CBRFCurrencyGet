import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Main {
    static double rnrcrespamountrub1; //Доля ответственности РНПК по курсу в рублях = итоговая сумма по «Доля РНПК (сумма)» для всех лейеров всех секций
    static double rnrcrespamountrub2; //Доля ответственности РНПК по курсу в рублях = итоговая сумма по «Доля РНПК (сумма)» для всех лейеров всех секций
    static double limit1;
    static double limit2;
    static double factResp;
    static double USD =56.6616;
    static double EUR = 68.8826;

    public static void main(String[] args) {


        Layer l1s1 = new Layer();
        l1s1.sverhPerc = 0;
        l1s1.upperboundPerc = 25;
        l1s1.butnotmore = 2000;
        l1s1.rnrcshareperc = 50;
        l1s1.ocenpremia = 500;

        l1s1.sverhSum = l1s1.sverhPerc * l1s1.ocenpremia / 100;
        l1s1.upperboundsum = l1s1.upperboundPerc * l1s1.ocenpremia/100;

        l1s1.capacitySUM = Math.min((l1s1.upperboundsum - l1s1.sverhSum),
                l1s1.butnotmore - l1s1.sverhSum);
        l1s1.rnrcsharesum = l1s1.rnrcshareperc * l1s1.capacitySUM / 100;

        Layer l2s1 = new Layer();
        l2s1.sverhPerc = 25;
        l2s1.upperboundPerc = 50;
        l2s1.butnotmore = 2000;
        l2s1.rnrcshareperc = 50;
        l2s1.ocenpremia = 500;

        l2s1.sverhSum = l2s1.sverhPerc * l2s1.ocenpremia / 100;
        l2s1.upperboundsum = l2s1.upperboundPerc * l2s1.ocenpremia/100;
        l2s1.capacitySUM = Math.min((l2s1.upperboundsum - l2s1.sverhSum), l2s1.butnotmore - l2s1.sverhSum);
        l2s1.rnrcsharesum = l2s1.rnrcshareperc * l2s1.capacitySUM / 100;

         rnrcrespamountrub1 = l1s1.rnrcsharesum + l2s1.rnrcsharesum;
         limit1 = l1s1.capacitySUM + l2s1.capacitySUM;
         factResp = l1s1.rnrcsharesum + l2s1.rnrcsharesum;



//------------------------------------------------------
        Layer l1s2 = new Layer();
        l1s2.sverhPerc = 0;
        l1s2.upperboundPerc = 25;
        l1s2.butnotmore = 1000;
        l1s2.rnrcshareperc = 50;
        l1s2.ocenpremia = 500;

        l1s2.sverhSum = l1s2.sverhPerc * l1s2.ocenpremia / 100;
        l1s2.upperboundsum = l1s2.upperboundPerc * l1s2.ocenpremia/100;
        l1s2.capacitySUM = Math.min((l1s2.upperboundsum - l1s2.sverhSum),
                l1s2.butnotmore - l1s2.sverhSum);
        l1s2.rnrcsharesum = l1s2.rnrcshareperc * l1s2.capacitySUM / 100;

        Layer l2s2 = new Layer();
        l2s2.sverhPerc = 25;
        l2s2.upperboundPerc = 50;
        l2s2.butnotmore = 2000 ;
        l2s2.rnrcshareperc = 50;
        l2s2.ocenpremia = 500;

        l2s2.sverhSum = l2s2.sverhPerc * l2s2.ocenpremia / 100;
        l2s2.upperboundsum = l2s2.upperboundPerc * l2s2.ocenpremia/100;
        l2s2.capacitySUM = Math.min((l2s2.upperboundsum - l2s2.sverhSum),
                l2s2.butnotmore - l2s2.sverhSum);
        l2s2.rnrcsharesum = l2s2.rnrcshareperc * l2s2.capacitySUM / 100;
        rnrcrespamountrub2 = l1s2.rnrcsharesum + l2s2.rnrcsharesum;
        limit2 = l1s2.capacitySUM + l2s2.capacitySUM;
        factResp = l1s2.rnrcsharesum + l2s2.rnrcsharesum;

//        System.out.println("Сверх сумма лейер 1 секция 1 = "+(l1s1.sverhSum));
//        System.out.println("Сверх сумма лейер 2 секция 1 = "+(l2s1.sverhSum));
//        System.out.println("Сверх сумма лейер 1 секция 2 = "+(l1s2.sverhSum));
//        System.out.println("Сверх сумма лейер 1 секция 2 = "+(l2s2.sverhSum));
//
//        System.out.println("ЕМКОСТЬ сумма лейер 1 секция 1 = "+(l1s1.capacitySUM));
//        System.out.println("ЕМКОСТЬ сумма лейер 2 секция 1 = "+(l2s1.capacitySUM));
//        System.out.println("ЕМКОСТЬ сумма лейер 1 секция 2 = "+(l1s2.capacitySUM));
//        System.out.println("ЕМКОСТЬ сумма лейер 1 секция 2 = "+(l2s2.capacitySUM));
//
//        System.out.println("Верхняя граница сумма лейер 1 секция 1 = "+(l1s1.upperboundsum));
//        System.out.println("Верхняя граница сумма лейер 2 секция 1 = "+(l2s1.upperboundsum));
//        System.out.println("Верхняя граница сумма лейер 1 секция 2 = "+(l1s2.upperboundsum));
//        System.out.println("Верхняя граница сумма лейер 1 секция 2 = "+(l2s2.upperboundsum));
//
//        System.out.println("Доля РНПК сумма сумма лейер 1 секция 1 = "+(l1s1.rnrcsharesum));
//        System.out.println("Доля РНПК сумма сумма лейер 2 секция 1 = "+(l2s1.rnrcsharesum));
//        System.out.println("Доля РНПК сумма сумма лейер 1 секция 2 = "+(l1s2.rnrcsharesum));
//        System.out.println("Доля РНПК сумма сумма лейер 1 секция 2 = "+(l2s2.rnrcsharesum));
//
//        System.out.println("Итоговая сумма в долларах по первой секции "+rnrcrespamountrub1);
//        System.out.println("Итоговая сумма в Евро по первой секции "+rnrcrespamountrub2);

        System.out.println("Итоговая сумма Доля ответственности rnpk = " + (rnrcrespamountrub1*USD + rnrcrespamountrub2*USD));
        System.out.println("Лимит в размещении (сумма) " + (limit1*USD + limit2*USD));
        System.out.println("Страховая сумма в рублях = "+(((l2s1.upperboundPerc*l2s1.ocenpremia)/100)*USD + ((l2s2.upperboundPerc*l2s2.ocenpremia)/100)*USD));
        System.out.println("Лимит по договору в рублях = "+(l2s1.butnotmore * USD + l2s2.butnotmore*USD));
        System.out.println("Доля ответственности РНПК % = "+((rnrcrespamountrub1*USD + rnrcrespamountrub2*USD)/(l2s1.butnotmore * USD + l2s2.butnotmore*USD))*100);
        System.out.println("Доля РНПК в размещении % = "+((rnrcrespamountrub1*USD + rnrcrespamountrub2*USD)/(limit1*USD + limit2*USD))*100);

    }


}

class Layer {
    double rnrcshareperc; //Доля РНПК %
    double rnrcsharesum; //Доля РНПК сумма =  rnrcshareperc * capacitySUM / 100
    double capacitySUM; // MIN(upperboundsum - sverhSum) и (butnotmore - sverhSum)
    double upperboundsum; // верхняя граница сумма = upperboundPerc* ocenpremia
    double upperboundPerc; // верхняя граница %
    double sverhSum; //Сверх сумма = sverhPerc * ocenpremia
    double sverhPerc; //Сверх процент
    double ocenpremia; // Оценочная премия по лейеру
    double butnotmore; // Но не более
}