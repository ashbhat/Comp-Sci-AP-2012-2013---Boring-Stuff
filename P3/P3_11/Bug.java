public class Bug {

private int x;
private int deltax = 1;

public Bug(int intialposition)
{
    x = intialposition;
}

public void turn()
{
    deltax = deltax*-1;
}

public void move()
{
    x = x + deltax;
}

public int getposition()
{
    return x;
}
}x