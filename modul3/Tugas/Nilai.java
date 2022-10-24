package modul3.Tugas;

public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;

    void beriNilai(int UTSValue, int UASValue, int TugasValue){
        nilaiUTS = UTSValue;
        nilaiUAS = UASValue;
        nilaiTugas = TugasValue;
    }

    double getUTS(){
        return nilaiUTS;
    }

    int getUAS(){
        return nilaiUAS;
    }

    int getTugas(){
        return nilaiTugas;
    }

    double total(){
        double nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas)/3;
        return nilaiTotal;
    }
    
    public static void main(String[] args)  {
        Nilai mhs1 = new Nilai();

        mhs1.beriNilai(80, 90, 80);
        System.out.println(
            "Nilai UTS   : " + mhs1.getUTS() + "\n" +
            "Nilai UAS   : " + mhs1.getUAS() + "\n" +
            "Nilai Tugas : " + mhs1.getTugas() + "\n" +
            "Nilai Total : " + mhs1.total()
        );

    }
}
