package hu.petrik;

public class Main {

    public static void main(String[] args) {
	    Palack p1 = new Palack("tej", 1000, 1000);
	    Palack p2 = new Palack("kakao", 5000, 200);
	    VisszavalthatoPalack vp1 = new VisszavalthatoPalack("kola", 333, 100, 25);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(vp1);
    }
}
