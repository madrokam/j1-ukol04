package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
  private final List<Integer> osudi = new ArrayList<>();

  public Sportka() {
    //TODO naplnit osudí čísly 1 až 49.


for(int i=0; i<=49;i++){this.osudi.add(i);}


  }

  /**
   * Zamíchá osudí.
   *
   * @see Collections#shuffle(List)
   */
  public void zamichat() {

    //TODO zamíchat osudí
    Collections.shuffle(this.osudi);
  }

  /**
   * Vrátí seznam s 6 vylosovanými čísly.
   *
   * @return Seznam vylosovaných čísel.
   *
   * @see List#subList(int, int)
   */
  public List<Integer> vylosovanaCisla() {
    //TODO Vrátit seznam prvních 6 čísel z osudí.
//alternativni reseni bez subListu
    /*int prvni=this.osudi.get(0);
    int druhy=this.osudi.get(1);
    int treti=this.osudi.get(2);
    int ctvrty=this.osudi.get(3);
    int paty=this.osudi.get(4);
    int sesty=this.osudi.get(5);
    List<Integer> list=new ArrayList<>();
    list.add(prvni);
    list.add(druhy);
    list.add(treti);
    list.add(ctvrty);
    list.add(paty);
    list.add(sesty);*/


    return this.osudi.subList(0,6);
  }

  /**
   * Vrátí sedmé vylosované číslo (dodatkové číslo)
   *
   * @return Dodatkové číslo.
   */
  public Integer dodatkoveCislo() {
    //TODO Vrátit sedmé číslo z osudí.
    return this.osudi.get(6);
  }
}
