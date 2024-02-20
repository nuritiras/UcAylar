package tr.gov.enerji.ucaylar;

public class Saban extends Recep{
    public int salavat;
    @Override
    public int ibadetHesapla() {
        return (namaz+oruc+kuran+teheccud+salavat)*300;
    }
}
