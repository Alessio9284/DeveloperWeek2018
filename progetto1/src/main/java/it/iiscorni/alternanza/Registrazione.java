package it.iiscorni.alternanza;

public class Registrazione
{
    private int idregistrazione;
    private String data;
    private String tipo;
    private float importo;
    private int idazienda;
    private String azienda;

    public Registrazione(int idr, String d, String t, float i, int ida, String a)
    {
        this.idregistrazione = idr;
        this.data = d;
        this.tipo = t;
        this.importo = i;
        this.idazienda = ida;
        this.azienda = a;
    }
    
    //Metodo di lettura delle registrazioni su file
    public void leggi()
    {
        
    }

    public int getIdregistrazione() {
        return idregistrazione;
    }

    public void setIdregistrazione(int idregistrazione) {
        this.idregistrazione = idregistrazione;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getImporto() {
        return importo;
    }

    public void setImporto(float importo) {
        this.importo = importo;
    }

    public int getIdazienda() {
        return idazienda;
    }

    public void setIdazienda(int idazienda) {
        this.idazienda = idazienda;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }
    
    
}
