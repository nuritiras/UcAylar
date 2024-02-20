package tr.gov.enerji.ucaylar;

public class Recep extends Normal{
    public int teheccud;
    @Override
    public int ibadetHesapla() {
        return (namaz+oruc+kuran+teheccud)*100;
    }
}
