package hu.petrik;

import java.io.*;
import java.util.ArrayList;

public class teszt {
    private ArrayList<Rekesz> rekeszek;
    public teszt() {
        rekeszek = new ArrayList<>();
        elso();
        masodik();
    }
    private void elso(){
        Palack p1 = new Palack("tej", 1000, 1000);
        Palack p2 = new Palack("kakao", 5000, 200);
        VisszavalthatoPalack vp1 = new VisszavalthatoPalack("kola", 333, 100, 25);

        Rekesz r = new Rekesz(6969);
        rekeszek.add(r);
        r.ujPalack(p1);
        r.ujPalack(p2);
        r.ujPalack(vp1);
    }
    private void masodik(){
        Beolvas();
        System.out.println(this.toString());
    }
    private void Beolvas(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("palackok.txt"));
            rekeszek.add(new Rekesz(1000));
            String sor = br.readLine();
            while(sor!=null){
                Palack p;
                String[] st = sor.split(";");
                if (st.length == 2){
                     p = new Palack(st[0], Integer.parseInt(st[1]));
                }
                else if (st.length == 3){
                     p = new Palack(st[0], Integer.parseInt(st[1]), Integer.parseInt(st[2]));
                }
                else {
                    p = new VisszavalthatoPalack(st[0], Integer.parseInt(st[1]), Integer.parseInt(st[2]),Integer.parseInt(st[3]));
                }
                boolean siker = rekeszek.get(rekeszek.size()-1).ujPalack(p);
                if (!siker) {
                    rekeszek.add(new Rekesz(1000));
                    rekeszek.get(rekeszek.size()-1).ujPalack(p);
                }
                sor = br.readLine();
            }
        }
        catch (FileNotFoundException e){
            e.getMessage();
        }
        catch (IOException e){
            e.getMessage();
        }
        catch (Exception e) {
            e.getMessage();
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < rekeszek.size(); i++){
            s+=(i + 1) +". rekesz: \n" + rekeszek.get(i).toString();
        }
        return s;
    }

}
