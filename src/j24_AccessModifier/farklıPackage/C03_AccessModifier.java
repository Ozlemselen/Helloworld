package j24_AccessModifier.farklıPackage;

import j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {


    private String privadeTeamLead="Hakan Aydın";
    String defaultName="Cebrail bey";
    protected String protectedName="Dilek hanım";
    public String publicName="Gamze hanım";

    public static void main(String[] args) {

        C01_AccessModifier obj9=new C01_AccessModifier(23,3);
        //agama public cons. selam :)
        System.out.println("obj9.publicYas = " + obj9.publicYas);//48->public variable
        // obj9.defaultYas// default variable package dısı erişlimez
        // obj9.protectedMethod()//protected methoc package dışı call edilemez


    }

}
