
import Systems.*;

import java.util.*;

public class Main{


    private static DEC dec = new DEC();


    private static boolean not_ended = true;
    private static int mode_ind = 0;

    private static String mode_1 = "> HEX     Инструкция:\n  DEC     < и > - переключение режима\n  OCT     = - ввести пример\n  BIN     exit - завершить работу программы\n";
    private static String mode_2 = "  HEX     Инструкция:\n> DEC     < и > - переключение режима\n  OCT     = - ввести пример\n  BIN     exit - завершить работу программы\n";
    private static String mode_3 = "  HEX     Инструкция:\n  DEC     < и > - переключение режима\n> OCT     = - ввести пример\n  BIN     exit - завершить работу программы\n";
    private static String mode_4 = "  HEX     Инструкция:\n  DEC     < и > - переключение режима\n  OCT     = - ввести пример\n> BIN     exit - завершить работу программы\n";
    private static String[] modes = {mode_1, mode_2, mode_3, mode_4};


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(not_ended)
        {
            System.out.println(modes[mode_ind]);
            String comand = sc.nextLine();

            switch(comand)
            {
                case ">":
                    if(mode_ind==3){mode_ind=0;}
                    else{mode_ind+=1;}
                    break;

                case "<":
                    if(mode_ind==0){mode_ind=3;}
                    else{mode_ind-=1;}
                    break;

                case "=":
                    if(mode_ind==1){System.out.println(dec.Calc());}
                    break;
                case "exit":
                    not_ended=!not_ended;
                    break;
            }

        }
    }
}