
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pavilion
 */
public class Pistas {

    public class Vertice {

        public String info;
        public ArrayList<Vertice> vertices;

        public Vertice(String info) {
            this.info = info;
            this.vertices = new ArrayList<>();
        }

    }

    //Pistas más generales
    public Vertice ptr = new Vertice("");

    public void AgregarPistas() {
        ptr.vertices.add(new Vertice("Cabello"));
        ptr.vertices.add(new Vertice("Piel"));
        ptr.vertices.add(new Vertice("Accesorios"));
        ptr.vertices.add(new Vertice("Cara"));
        Vertice p = ptr.vertices.get(0);
        p.vertices.add(new Vertice("Largo"));
        p.vertices.add(new Vertice("Corto"));
        for (Vertice vertice : p.vertices) {
            vertice.vertices.add(new Vertice("Liso"));
            vertice.vertices.add(new Vertice("Rizado"));
            vertice.vertices.add(new Vertice("Ondulado"));
            vertice.vertices.add(new Vertice("Afro"));

            for (Vertice vertice1 : vertice.vertices) {
                vertice1.vertices.add(new Vertice("Negro"));
                vertice1.vertices.add(new Vertice("Castaño"));
                vertice1.vertices.add(new Vertice("Rojo"));
                vertice1.vertices.add(new Vertice("Blanco"));
                vertice1.vertices.add(new Vertice("Rubio"));
            }
        }
        p.vertices.add(new Vertice("Calvo"));
        p = ptr.vertices.get(1);
        p.vertices.add(new Vertice("Oscura"));
        p.vertices.add(new Vertice("Mestiza"));
        p.vertices.add(new Vertice("Clara"));
        p = ptr.vertices.get(2);
        p.vertices.add(new Vertice("Oscura"));
        p.vertices.add(new Vertice("Mestiza"));
        p.vertices.add(new Vertice("Clara"));
    }

}
