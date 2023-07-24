package sobrecarga;

public class Cartoon {
    private String nome;

    private String typo;
    private int episodes;

    private int duration;
    private String classification;
    private int exhibition;

    private String gender;

public Cartoon(){//crate the constructor

}

    public void startup(String X , String Y , int Z,String W){
        this.nome = X;// THIS IS POSSIBLE , MORE NOT RECOMMENDED;
        this.episodes=Z;
        this.typo=Y;
        this.gender=W;
    }
   public void startup(String G,int H , String D){
       this.nome = G;// THIS IS POSSIBLE , MORE NOT RECOMMENDED;
       this.episodes=H;

       this.gender=D;/// I messed up with these lyrics, it's not recommended to do that!!!
   }


    public void impress(){
        System.out.println(this.nome);
        System.out.println(this.episodes); //method of print
        System.out.println(this.typo);
        System.out.println(this.gender);
    }
    public void antherInfo(int duration, String classification, int exhibition){

        this.classification = classification;
        this.duration =duration ;//method of startup;
        this.exhibition = exhibition;

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTypo() {
        return typo;
    }

    public void setTypo(String typo) {
        this.typo = typo;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getExhibition() {
        return exhibition;
    }

    public void setExhibition(int exhibition) {
        this.exhibition = exhibition;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
