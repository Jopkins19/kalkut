package Systems;

import Systems.Base_methods;

public class OCT extends Base_methods {

    protected  int GetNumber()
    {
        int number;
        try
        {
            String num_str = super.GetLine();
            if((num_str.contains(" ")) || (num_str.toCharArray()[0] == '0' && num_str.length()>1))
            {
                throw new Exception();
            }
            number = (int)Long.parseLong(num_str,8);
        }
        catch(Throwable t)
        {
            System.out.println("Введено неверное значение! Повторите попытку");
            number = GetNumber();
        }
        return  number;
    }
    protected char GetOperation()
    {
        return super.GetOperation();
    }

    public String Calc()
    {
        return "Результат: " + Long.toOctalString(Integer.parseInt(super.Calc(GetNumber(), GetOperation(),GetNumber()))) + "\n---------------------";
    }

    public OCT(){}
}