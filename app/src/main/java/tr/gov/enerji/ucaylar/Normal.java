package tr.gov.enerji.ucaylar;

public class Normal {
    public int namaz;
    public int oruc;
    public int kuran;
    public int ibadetHesapla(){
        return (namaz+oruc+kuran)*10;
    }
}
