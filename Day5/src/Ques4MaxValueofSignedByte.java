public class Ques4MaxValueofSignedByte {
    private byte num;

    public Ques4MaxValueofSignedByte(byte num) {
        this.num = num;
    }
    public byte getNum() {
        return num;
    }
    public void setToMax() {
        this.num = 127;
    }
    public static void main(String[] args) {
        Ques4MaxValueofSignedByte by = new Ques4MaxValueofSignedByte((byte) 128);
        System.out.println("Value of Num: " + by.getNum());

        by.setToMax();
        System.out.println("Largest value stored in a signed byte: " + by.getNum());
    }
}
