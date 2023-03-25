package Kwadratury_Gaussa_Legendrea;

import java.util.Scanner;

public class Kwadratura {

    public double Funkcja(double x) {
        double fun;
     //   fun = ((double) (x - 1)/(Math.pow(x, 2) + x));
        fun = ((double) Math.sin(0.4 * Math.pow(x, 2) - 2.1)/Math.sqrt(1.1 * x + 0.3));
        return fun;
    }

    public static double podajN() {
        int n1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n (dostępne 2 , 4, 6, 8, 10, 16, 30): ");
        n1 = Integer.parseInt(scanner.nextLine());
        while(n1 != 2 && n1 != 4 && n1 != 6 && n1 != 8 &&
                n1 != 10 && n1 != 16 && n1 != 30) {
            System.out.println("Niedostępna wartość n. Podaj jeszcze raz n: ");
            n1 = Integer.parseInt(scanner.nextLine());
        }
        return n1;
    }

    public static void main(String[] args) {
        Kwadratura k = new Kwadratura();
        float a, b, h,h2;
        double calka = 0;
        int n;

        n = (int) podajN();
    //    a = 2;
    //    b = 3;
          a = (float) 1.1;
          b = (float) 2.1;
        h = (b - a) / 2; //pierwszy współczynnik
        h2 = (b + a) / 2;//drugi współczynnik

        double w2[] = {1.0000000000000000, 1.0000000000000000};  //wagi
        double t2[] = {-0.5773502691896257, 0.5773502691896257}; //węzły

        double w4[] = {0.6521451548625461,
                0.6521451548625461,
                0.3478548451374538,
                0.3478548451374538};
        double t4[] = {-0.3399810435848563,
                0.3399810435848563,
                -0.8611363115940526,
                0.8611363115940526};

        double w6[] = {0.3607615730481386,
                0.3607615730481386,
                0.4679139345726910,
                0.4679139345726910,
                0.1713244923791704,
                0.1713244923791704};
        double t6[] = {0.6612093864662645,
                -0.6612093864662645,
                -0.2386191860831969,
                0.2386191860831969,
                -0.9324695142031521,
                0.9324695142031521};

        double w8[] = {0.3626837833783620,
                0.3626837833783620,
                0.3137066458778873,
                0.3137066458778873,
                0.2223810344533745,
                0.2223810344533745,
                0.1012285362903763,
                0.1012285362903763};
        double t8[] = {-0.1834346424956498,
                0.1834346424956498,
                -0.5255324099163290,
                0.5255324099163290,
                -0.7966664774136267,
                0.7966664774136267,
                -0.9602898564975363,
                0.9602898564975363};

        double[] w10 = {0.2955242247147529,
                0.2955242247147529,
                0.2692667193099963,
                0.2692667193099963,
                0.2190863625159820,
                0.2190863625159820,
                0.1494513491505806,
                0.1494513491505806,
                0.0666713443086881,
                0.0666713443086881};
        double[] t10 = {-0.1488743389816312,
                0.1488743389816312,
                -0.4333953941292472,
                0.4333953941292472,
                -0.6794095682990244,
                0.6794095682990244,
                -0.8650633666889845,
                0.8650633666889845,
                -0.9739065285171717,
                0.9739065285171717};

        double[] w16 = {0.1894506104550685,
                0.1894506104550685,
                0.1826034150449236,
                0.1826034150449236,
                0.1691565193950025,
                0.1691565193950025,
                0.1495959888165767,
                0.1495959888165767,
                0.1246289712555339,
                0.1246289712555339,
                0.0951585116824928,
                0.0951585116824928,
                0.0622535239386479,
                0.0622535239386479,
                0.0271524594117541,
                0.0271524594117541};
        double[] t16 = {-0.0950125098376374,
                0.0950125098376374,
                -0.2816035507792589,
                0.2816035507792589,
                -0.4580167776572274,
                0.4580167776572274,
                -0.6178762444026438,
                0.6178762444026438,
                -0.7554044083550030,
                0.7554044083550030,
                -0.8656312023878318,
                0.8656312023878318,
                -0.9445750230732326,
                0.9445750230732326,
                -0.9894009349916499,
                0.9894009349916499};

        double[] w30 = {0.1028526528935588,
                0.1028526528935588,
                0.1017623897484055,
                0.1017623897484055,
                0.0995934205867953,
                0.0995934205867953,
                0.0963687371746443,
                0.0963687371746443,
                0.0921225222377861,
                0.0921225222377861,
                0.0868997872010830,
                0.0868997872010830,
                0.0807558952294202,
                0.0807558952294202,
                0.0737559747377052,
                0.0737559747377052,
                0.0659742298821805,
                0.0659742298821805,
                0.0574931562176191,
                0.0574931562176191,
                0.0484026728305941,
                0.0484026728305941,
                0.0387991925696271,
                0.0387991925696271,
                0.0287847078833234,
                0.0287847078833234,
                0.0184664683110910,
                0.0184664683110910,
                0.0079681924961666,
                0.0079681924961666};
        double[] t30 = {-0.0514718425553177,
                0.0514718425553177,
                -0.1538699136085835,
                0.1538699136085835,
                -0.2546369261678899,
                0.2546369261678899,
                -0.3527047255308781,
                0.3527047255308781,
                -0.4470337695380892,
                0.4470337695380892,
                -0.5366241481420199,
                0.5366241481420199,
                -0.6205261829892429,
                0.6205261829892429,
                -0.6978504947933158,
                0.6978504947933158,
                -0.7677774321048262,
                0.7677774321048262,
                -0.8295657623827684,
                0.8295657623827684,
                -0.8825605357920527,
                0.8825605357920527,
                -0.9262000474292743,
                0.9262000474292743,
                -0.9600218649683075,
                0.9600218649683075,
                -0.9836681232797472,
                0.9836681232797472,
                -0.9968934840746495,
                0.9968934840746495};

        for(int i=0;i<n;i++)  { //Wzór to suma a więc sumuję w pętli:
            if(n==2){
                calka += w2[i] * k.Funkcja((h*t2[i]+h2));
            }
            if(n==4){
                calka += w4[i] * k.Funkcja((h*t4[i]+h2));
            }
            if(n==6){
                calka += w6[i] * k.Funkcja((h*t6[i]+h2));
            }
            if(n==8){
                calka += w8[i] * k.Funkcja((h*t8[i]+h2));
            }
            if(n==10){
                calka += w10[i] * k.Funkcja((h*t10[i]+h2));
            }
            if(n==16){
                calka += w16[i] * k.Funkcja((h*t16[i]+h2));
            }
            if(n==30){
                calka += w30[i] * k.Funkcja((h*t30[i]+h2));
            }
        }
        calka = h * calka;
        System.out.println("Calka: "+calka);

    }
}