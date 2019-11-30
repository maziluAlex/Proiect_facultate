package echipamentbucatarie;
/**
 * @author iulic
 */
public class CuptorIncorporabil extends EchipamentBucatarie{
            private String tip_cuptor,functii_gatire,autocuratare;
            private boolean tip_alimentare,design ;
    
    //Constructor fara argumente
    CuptorIncorporabil(){
            super();
            this.tip_cuptor="Cuptor standard";
            this.functii_gatire="Grill, coacere, dezghetare, functie pizza";
            this.autocuratare="Catalitica";
            this.tip_alimentare=true;
            this.design=true;
    }
    
    //Constructor cu argument
    CuptorIncorporabil(String brand, String culoare, float pret, float capacitate, boolean displaytactil,String tip_cuptor,String functii_gatire,String autocuratare,boolean tip_alimentare,boolean design){
            super(brand, culoare, pret, capacitate, displaytactil);
            this.tip_cuptor=tip_cuptor;
            this.functii_gatire=functii_gatire;
            this.autocuratare=autocuratare;
            this.tip_alimentare=tip_alimentare;
            this.design=design;
    }
    
    CuptorIncorporabil(EchipamentBucatarie e,String tip_cuptor,String functii_gatire,String autocuratare,boolean tip_alimentare,boolean design){ 
            super(e);
            this.tip_cuptor=tip_cuptor;
            this.functii_gatire=functii_gatire;
            this.autocuratare=autocuratare;
            this.tip_alimentare=tip_alimentare;
            this.design=design;
    }
    
    //Constructor de copiere
    CuptorIncorporabil(CuptorIncorporabil ci){
            super(ci);
            this.tip_cuptor=ci.tip_cuptor;
            this.functii_gatire=ci.functii_gatire;
            this.autocuratare=ci.autocuratare;
            this.tip_alimentare=ci.tip_alimentare;
            this.design=ci.design;
    }
    
    public String getTip_cuptor(){
            return tip_cuptor;
    }
    
    public String getFunctii_gatire(){
            return functii_gatire;
    }
    
    public String getAutocuratare(){
            return autocuratare;
    }
    
    public boolean getTip_alimentare(){
            return tip_alimentare;
    }
    
    public boolean getDesign(){
            return design;
    }
    
   
    
    public void setTip_cuptor(String tip_cuptor){
            this.tip_cuptor=tip_cuptor;
    }
    
    public void setFunctii_gatire(String functii_gatire){
            this.functii_gatire=functii_gatire;
    }
    
    public void setAutocuratare(String autocuratare){
            this.autocuratare=autocuratare;
    }
    
    public void setTip_alimentare(boolean tip_alimentare){
            this.tip_alimentare=tip_alimentare;
    }

    public void setDesign(boolean design){
            this.design=design;
    }

    
    
    public String toString(){
            return super.toString()+ "\n\t Tip cuptor:"+ tip_cuptor+" Functii gatire:"+functii_gatire+" Autocuratare:"+autocuratare+" Tip alimentare:"+(tip_alimentare?" Electric":" Gaz natural")+" Design:"+(design?" Clasic":" Vintage");
    }
}
