package Jihe;

public class Phone {
    private String pinPai;
    private int jiaGe;
    private int nianXi;

    public Phone() {
    }

    public Phone(String pinPai, int jiaGe, int nianXi) {
        this.pinPai = pinPai;
        this.jiaGe = jiaGe;
        this.nianXi = nianXi;
    }

    public String getPinPai() {
        return pinPai;
    }

    public void setPinPai(String pinPai) {
        this.pinPai = pinPai;
    }

    public int getJiaGe() {
        return jiaGe;
    }

    public void setJiaGe(int jiaGe) {
        this.jiaGe = jiaGe;
    }

    public int getNianXi() {
        return nianXi;
    }

    public void setNianXi(int nianXi) {
        this.nianXi = nianXi;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "pinPai='" + pinPai + '\'' +
                ", jiaGe=" + jiaGe +
                ", nianXi=" + nianXi +
                '}';
    }
}
