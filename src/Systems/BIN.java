package Systems;

import Systems.Base_methods;

public class BIN extends Base_methods {
    public  int GetNumber()
    {
        int number;
        try
        {
            number = (int)Long.parseLong(super.GetLine(),2);
        }
        catch(Throwable t)
        {
            System.out.println("Введено неверное значение! Повторите попытку");
            number = GetNumber();
        }
        return  number;
    }

    public char GetOperation()
    {
        return super.GetOperation();
    }

    public String Calc()
    {
        return "Результат: " + Long.toBinaryString(Integer.parseInt(super.Calc(GetNumber(), GetOperation(), GetNumber()))) + "\n---------------------";
    }

    public BIN(){}
}
