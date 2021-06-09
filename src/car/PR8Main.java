package car;

public class PR8Main {
    String mark;
    String naim;
    String tip;
    String cvet;
    int god;

    public void info() {
        System.out.println("Марка: " + mark);
        System.out.println("Название: " + naim);
    }

    public PR8Main(String mark, String naim, String tip, String cvet) {
        this.mark = mark;
        this.naim = naim;
        this.tip = tip;
        this.cvet = cvet;
    }

//    private infoA(){
//        if(god > 2010){
//            System.out.println("Год: " + god);
//        }
//    }
//    public PR8M(String tip, String cvet) {
//        this.tip = tip;
//        this.cvet = cvet;
//    }

}
