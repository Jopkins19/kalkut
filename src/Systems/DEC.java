package Systems;

public class DEC extends Base_methods {

    protected  int GetNumber()
    {
        int number;

        String num_str = super.GetLine();

        number = Integer.parseInt(num_str);

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