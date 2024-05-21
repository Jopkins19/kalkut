package Systems;

import java.util.Scanner;
abstract class Base_methods {

    protected String GetLine()
    {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();

    }

    protected  char GetOperation()
    {
        System.out.println("Операция:");
        Scanner scanner = new Scanner(System.in);
        char operation;
        String allow_op = "+/-*";
        try
        {
            String stroka =  scanner.nextLine();
            if(stroka.length()>1)
            {
                throw new Exception();
            }
            operation = stroka.toCharArray()[0];
            if(!allow_op.contains(String.valueOf(operation)))
            {
                throw new Exception();
            }
        }
        catch(Throwable t)
        {
            System.out.println("Введено неверное значение! Повторите попытку");
            operation = GetOperation();
        }
        return  operation;
    }

    protected String Calc(int num_1,char operation, int num_2)
    {
        String result;
        switch(operation)
        {
            case '+':
                result = Integer.toString(num_1+num_2);
                break;
            case '-':
                result = Integer.toString(num_1-num_2);
                break;
            case '*':
                result = Integer.toString(num_1*num_2);
                break;
            case '/':
                if(num_2 == 0)
                {
                    return "Деление на ноль невозможно";
                }
                else
                {
                    result = Integer.toString(num_1/num_2);
                }
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = Calc(num_1, GetOperation(), num_2);

        }

        return result;
    }

    public Base_methods(){}
}
