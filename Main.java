import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("wybierz se program");
     System.out.println("1-Czy liczba jest parzysta- liczba wpisywana z       klawiatury");
    System.out.println("2-Czy liczba jest parzysta- wpisywana z tablicy podaje wczesniej");
    System.out.println("3-kalkulator bez switcha(dodawanie mnozenie dzielenie)");
    System.out.println("4-podajesz 3 liczbny szukasz najwiekszej");
    System.out.println("5-zamiana z m/s na km/h");
    Scanner scan=new Scanner(System.in);
     int z = scan.nextInt();
    switch(z)
      {
      case 1:
        {
        System.out.println("Napisz jakas liczbe");
          int x=scan.nextInt();
          if (x%2==0)
        {
          System.out.println("Parzysta");
        }else
          {
            System.out.println("nie Parzysta");
          }
        break;
        }
      case 2:
          {
            int[] podane={1,2,3,4,5,6};
            System.out.println("liczby parrzyste to:");
            for (int i=0;i<podane.length;i++)
              {
                if (podane[i]%2==0)
                  System.out.println(podane[i]);
              }break;
          }
      case 3:
          {
            System.out.println("podaj se liczby");
              {
              int a=scan.nextInt();
              int b=scan.nextInt();
              int mnozenie=a*b;
              int dodawanie=a+b;
              int dzielenie=a/b;
              
              System.out.println("mnozenie="+ mnozenie);
              }break;
             
          }
      case 4:
          {
              System.out.println("podaj 3 liczby");
            double m=scan.nextDouble();
            double n=scan.nextDouble();
            double b=scan.nextDouble();
            System.out.println("najwieksza to");
            
            if (m>n && m>b)
            {
              System.out.println(m);
            } else if (n>m && n>b)
            {
             System.out.println(n);
            }else if (b>m && b>n)
            {
               System.out.println(b);
            } 
          
           
            
      
              
            
          }
      case 5:
          {
            System.out.println("Podaj predkosc w m/s");
            int predkosc=scan.nextInt();
            
            predkosc=predkosc*(3600/1000);
             System.out.println("predkosc w km/h to "+predkosc);

            
          }
          
      }
    
  }
}