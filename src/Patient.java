public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        super(name,email);
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + ".kg";
    }

    public  void  setHeight(double height){
        this.height = height;
    }

    public  String getHeight(){
        return this.height + "m.";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: "+birthday+"\nWeight: "+getWeight()+"\nHeight: "+getHeight()+"\nBlood: "+blood;
    }
}
