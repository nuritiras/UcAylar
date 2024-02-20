package tr.gov.enerji.ucaylar;

public class Ramazan extends Saban{
    public int zekat;
    @Override
    public int ibadetHesapla() {
        return (namaz+oruc+kuran+teheccud+salavat+zekat)*1000;
    }
    public int kadirGecesi(){
        return (namaz+oruc+kuran+teheccud+salavat+zekat)*1000;
    }
}
