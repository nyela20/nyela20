package smartij.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementIG {
    private final int rowid;
    private final int cellid;
    private final ArrayList<Object> objectsIGS = new ArrayList<>();
    private final String name;
    private final String nameLevel;


    public ElementIG(Object[] objects, NiveauIG niveauIG) {
        this.rowid = niveauIG.getRowid();
        this.cellid = niveauIG.getCellid();
        this.nameLevel = niveauIG.getLevelname();
        Collections.addAll(objectsIGS, objects);
        this.name = objects[0].toString();
    }

    public void addObject(Object object){
        objectsIGS.add(object);
    }

    public String getNameLevel(){
        return nameLevel;
    }

    public int numberOfObjects(){
        return (objectsIGS.size() -2) ;
    }

    public String getNameElement(){
        return name;
    }

    public String getUnitElement(){
        return  objectsIGS.get(1).toString();
    }

    public int getvalueElement(int i){
        return Integer.parseInt(objectsIGS.get(i).toString());
    }

    public String getStringValueElement(int i){
        return objectsIGS.get(i).toString();
    }

    public int getCellid() {
        return cellid;
    }


    public ArrayList<Object> obj(){
        return objectsIGS;
    }

    public int getRowid() {
        return rowid;
    }





}
