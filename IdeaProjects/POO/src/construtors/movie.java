package construtors;

public class movie {

    private String name;
    private String gender;
    private int duration;

    private String estudio;


    public movie(String name){//CONSTRUCTORS
        System.out.println(" teste de chamada de construtor::::::::");
        this.name=name;
        this.gender=gender;
        this.duration=duration;
        this.estudio = estudio;
    }

    public movie(String name,String gender,int duration,String estudio){

        this.name=name;
        this.gender=gender;
        this.duration=duration;
        this.estudio = estudio;
    }

    public void initial(String name,String gender,int duration,String estudio){
        this.name=name;
        this.gender=gender;
        this.duration=duration;
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.duration);
        System.out.println(this.estudio);
        System.out.println(this.gender);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDuratio() {
        return duration;
    }

    public void setDuratio(int duratio) {
        this.duration = duratio;
    }
}
