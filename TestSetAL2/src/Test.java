import java.sql.SQLOutput;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        HashSet h1=new HashSet();

        h1.add("test");
        h1.add(2);
        h1.add("test");
        h1.add(2);
        h1.add(5);
        h1.add(6.2);
        h1.add("5");
        h1.add("5");
        System.out.println(h1.size());
        System.out.println(h1);

        HashSet<Personne> has1=new HashSet();

        Personne p1=new Personne(1,"nom1","prenom1");
        Personne p2=new Personne(2,"nom2","prenom2");
        Personne p3=new Personne(3,"nom3","prenom3");
        Personne p4=new Personne(1,"nom1","prenom1");

        has1.add(p1);
        has1.add(p2);
        has1.add(p3);
        has1.add(p3);
        has1.add(p4);
        System.out.println(has1);
        System.out.println(has1.size());


        System.out.println(has1.contains(new Personne(1,"nom1","prenom1")));


        System.out.println(p1.hashCode());
        System.out.println(p4.hashCode());

        System.out.println(has1.remove(p4));

        for(Personne p:has1)
            System.out.println(p);

        //cree TreeSet Integeer ,String (crois et decr)
        // et de personne;

        TreeSet<Integer> trei=new TreeSet<>();//Compa
        trei.add(5);
        trei.add(2);
        trei.add(12);

        System.out.println(trei);

        TreeSet<Integer> trde
                =new TreeSet<>(Collections.reverseOrder());
        trde.addAll(trei);

        System.out.println();

        TreeSet<String> trest=new TreeSet<>();
        trest.add("tst");
        trest.add("abc");
        trest.add("Abc");

        System.out.println(trest);

        TreeSet<Personne> treper=new TreeSet<>();//Comparable
        treper.add(p2);
        treper.add(p1);
        treper.add(p3);

        System.out.println(treper);
        TreeSet<Personne> trperp=new TreeSet<>(Collections.reverseOrder());
            trperp.add(p1);
            trperp.addAll(treper);
        System.out.println(trperp);

TreeSet<Personne> trpno=new TreeSet<>(new TriNom());
trpno.addAll(has1);

        System.out.println(trpno);



    }
}
