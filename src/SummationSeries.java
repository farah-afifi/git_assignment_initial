public class SummationSeries implements ISubscriber
{
    @Override
    public void notifySubscriber(String input) {
        int end = Integer.parseInt(input);
        int sum = sigma(end);
        System.out.println("The sum from 1 to the end number = " + sum);
    }

    public static int sigma(int end)
    {
        return (end*(end+1))/2;
    }
}