
package echipamentbucatarie;
/**
 @author Mazilu Alex
 */
public class Frigider extends EchipamentBucatarie {
            private int nr_usi,nr_compartimente;
            private String clasa;
            private boolean dozator_apa,suport_sticle;
 
    //Constructor fara parametri
    Frigider(){
            super();
            this.nr_usi=1;
            this.nr_compartimente=1;
            this.clasa="A";
            this.dozator_apa=true;
            this.suport_sticle=true;
    }
    
    //Constructor cu parametri
    Frigider(String brand, String culoare, float pret, float capacitate, boolean displaytactil,int nr_usi,int nr_compartimente,String clasa, boolean dozator_apa, boolean suport_sticle){   
            super(brand, culoare, pret, capacitate, displaytactil);
            this.nr_usi=nr_usi;
            this.nr_compartimente=nr_compartimente;
            this.clasa=clasa;
            this.dozator_apa=dozator_apa;
            this.suport_sticle=suport_sticle;
    }
    
    Frigider(EchipamentBucatarie e,int nr_usi,int nr_compartimente,String clasa, boolean dozator_apa, boolean suport_sticle){ 
            super(e);
            this.nr_usi=nr_usi;
            this.nr_compartimente=nr_compartimente;
            this.clasa=clasa;
            this.dozator_apa=dozator_apa;
            this.suport_sticle=suport_sticle;
    }
    
    Frigider(Frigider f){ 
            super(f);
            this.nr_usi=f.nr_usi;
            this.nr_compartimente=f.nr_compartimente;
            this.clasa=f.clasa;
            this.dozator_apa=f.dozator_apa;
            this.suport_sticle=f.suport_sticle;
      }
    
    public int getNr_usi(){
            return nr_usi;}
    
    public int getNr_compartimente(){
            return nr_compartimente;}
    
    public String getClasa(){
            return clasa;}
    
    public Boolean getDozator_apa(){
            return dozator_apa;}
    
    public Boolean getSuport_Sticle(){
            return suport_sticle;}
    
    public void setNr_usi(int nr_usi){
            this.nr_usi=nr_usi;}
    
    public void setNr_compartimente(int nr_compartimente){
            this.nr_compartimente=nr_compartimente;}
    
    public void setClasa(String clasa){
            this.clasa=clasa;}
    
    public void setDozator_apa(Boolean dozator_apa){
            this.dozator_apa=dozator_apa;}

    public void setSuport_sticle(Boolean suport_sticle){
            this.suport_sticle=suport_sticle;}
        
    public String toString(){
            return "Frigider " + super.toString()+ "\n\t Numar usi:"+ nr_usi+" Numar compartimente:"+nr_compartimente+" Clasa:"+clasa+" Dozator de apa:"+(dozator_apa?"da":"nu")+" Suport sticle:"+(dozator_apa?"da":"nu");
    }
    

}


