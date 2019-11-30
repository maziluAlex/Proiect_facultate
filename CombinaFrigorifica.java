package echipamentbucatarie;
/**
@author Mazilu Alex
 */
public class CombinaFrigorifica extends EchipamentBucatarie {
            private String sistem_racire, sitem_dezghetare ,livrator;
            private int nivel_zgomot;
            private boolean tip_incastrare;
    
    CombinaFrigorifica(){
            super();
            this.sistem_racire="";
            this.sitem_dezghetare="";
            this.livrator="";
            this.nivel_zgomot=1;
            this.tip_incastrare=true;
    }
    
    CombinaFrigorifica(String brand, String culoare, float pret, float capacitate, boolean displaytactil,String sistem_racire,String sitem_dezghetare,String livrator,int nivel_zgomot,boolean tip_incastrare){
            super(brand, culoare, pret, capacitate, displaytactil);
            this.sistem_racire=sistem_racire;
            this.sitem_dezghetare=sitem_dezghetare;
            this.livrator=livrator;
            this.nivel_zgomot=nivel_zgomot;
            this.tip_incastrare=tip_incastrare;
    }
    
    CombinaFrigorifica(EchipamentBucatarie e,String sistem_racire,String sitem_dezghetare,String livrator,int nivel_zgomot,boolean tip_incastrare){
            super(e);
            this.sistem_racire=sistem_racire;
            this.sitem_dezghetare=sitem_dezghetare;
            this.livrator=livrator;
            this.nivel_zgomot=nivel_zgomot;
            this.tip_incastrare=tip_incastrare;
    }
    
    CombinaFrigorifica(CombinaFrigorifica c){
            super(c);
            this.sistem_racire=c.sistem_racire;
            this.sitem_dezghetare=c.sitem_dezghetare;
            this.livrator=c.livrator;
            this.nivel_zgomot=c.nivel_zgomot;
            this.tip_incastrare=c.tip_incastrare;
    }
    
    public String getSistem_racire(){
            return sistem_racire;}
    
    public String getSistem_dezghetare(){
            return sitem_dezghetare;}
    
    public String getLivrator(){
            return livrator;}
    
    public int getNivel_zgomot(){
            return nivel_zgomot;}
    
    public boolean getTip_incastrare(){
            return tip_incastrare;}
    
    public void setSistem_racire(String sistem_racire){
            this.sistem_racire=sistem_racire;}
    
    public void setSistem_dezghetare(String sistem_dezghetare){
            this.sitem_dezghetare=sistem_dezghetare;}
    
    public void setLivrator(String livrator){
            this.livrator=livrator;}
    
    public void setTip_incastrare(boolean tip_incastrare){
            this.tip_incastrare=tip_incastrare;}
    
    public String toString(){
            return "CombinaFrigorifica "+super.toString() + " \n\t Sistem de racire:"+sistem_racire+"|| Sistem de dezghetare:"+sitem_dezghetare+"|| Livrator:"+livrator+"|| Nivel de zgomot:"+nivel_zgomot+"dB "+"|| Tip incastrare:"+(tip_incastrare?"standard":"incorporat");
            
    }
    
}
