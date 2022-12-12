import java.util.*;

class Main {
    public static void main(String[] args) {
        Main f = new Main();
        List<Double> l = new ArrayList<Double>();
       
        for(int i = 1; i < 11; i++){  //Adiciona os n�meros de 1 a 10 como elementos do Arraylist
            double x = i;
            l.add(x);
        }
       
        System.out.println(Iteracao(l));  //Itera��o.
        System.out.println("---");
        System.out.println(l);
        System.out.println("---");
        System.out.println(Recursao(l, 0.0));  //A recurs�o age sobre o Arraylist, ento agora ele esta� vazio.
        System.out.println("---");
        System.out.println(Iteracao(l));  //Como agora o Arraylist est� vazio, a soma � 0.
    }
   
    public static double Recursao(List<Double> d, double soma){
        double s;
        if(d.isEmpty())
            return 0.0;
        s = d.get(0);
        d.remove(0);
        return s + Recursao(d, s);
    }
   
    public static double Iteracao(List<Double> d){
        double s = 0;
        for(int i = 0; i < d.size(); i++){ //Passa pelos elementos do Arraylist
            s += d.get(i);
        }
        return s;
    }
}