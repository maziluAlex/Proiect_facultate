package echipamentbucatarie;
/**
 * @author iulic
 */

public class CuptorMicrounde extends EchipamentBucatarie{
            private String modalitate_gatire,putere,material_interior;
            private float greutate;
            private int trepte_putere;
    
    //Constructor fara argumente
    CuptorMicrounde(){
            super();
            this.modalitate_gatire="Microunde";
            this.putere="800W";
            this.material_interior="Ceramica";
            this.greutate=24.6f;
            this.trepte_putere=6;
    }
    
    //Constructor cu argument
    CuptorMicrounde(String brand, String culoare, float pret, float capacitate, boolean displaytactil,String modalitate_gatire,String putere,String material_interior,float greutate,int trepte_putere){
            super(brand, culoare, pret, capacitate, displaytactil);
            this.modalitate_gatire=modalitate_gatire;
            this.putere=putere;
            this.material_interior=material_interior;
            this.greutate=greutate;
            this.trepte_putere=trepte_putere;
    }
    
    CuptorMicrounde(EchipamentBucatarie e,String modalitate_gatire,String putere,String materialinterior,float greutate,int trepte_putere){ 
            super(e);
            this.modalitate_gatire=modalitate_gatire;
            this.putere=putere;
            this.material_interior=materialinterior;
            this.greutate=greutate;
            this.trepte_putere=trepte_putere;
    }
    
    //Constructor de copiere
    CuptorMicrounde(CuptorMicrounde cm){
            super(cm);
            this.modalitate_gatire=cm.modalitate_gatire;
            this.putere=cm.putere;
            this.material_interior=cm.material_interior;
            this.greutate=cm.greutate;
            this.trepte_putere=cm.trepte_putere;
    }
    
    public String getModalitate_gatire(){
            return modalitate_gatire;
    }
    
    public String getPutere(){
            return putere;
    }
    
    public String getMatarial_interior(){
            return material_interior;
    }
    
    public float getGreutate(){
            return greutate;
    }
    
    public int getTrepte_putere(){
            return trepte_putere;
    }
    
   
    
    public void setModalitate_gatire(String modalitate_gatire){
            this.modalitate_gatire=modalitate_gatire;
    }
    
    public void setPutere(String putere){
            this.putere=putere;
    }
    
    public void setMatarial_interior(String material_interior){
            this.material_interior=material_interior;
    }
    
    public void setGreutate(float greutate){
            this.greutate=greutate;
    }

    public void setTrepte_putere(int trepte_putere){
            this.trepte_putere=trepte_putere;
    }

    
    
    public String toString(){
            return super.toString()+ "\n\t Modalitate Gatire:"+modalitate_gatire+" Putere:"+putere+" Materialul interior:"+material_interior+" Greutate:"+greutate+"kg"+" Trepte putere:"+trepte_putere;
    }
}