package Systems;

public class DEC extends Base_methods {

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
            number = Integer.parseInt(num_str);
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
        return "Результат: " + super.Calc(GetNumber(), GetOperation(), GetNumber())  + "\n---------------------";
    }

    public DEC(){}
}