package wyruwnawcze;

public class SinleNumber extends Object{
    private Integer id;

    public SinleNumber(Integer number) {
        this.id = number;
    }

    @Override
    protected void finalize() {
        System.out.println(String.format("id %s in remove", this.id));
    }

    public static void main(String[] args) {
        final int MAX_NUMBER = 100000000;

        for (int i = 0; i < MAX_NUMBER; ++i) {
            //SinleNumber num = new SinleNumber(i);
            //num = null;
            new SinleNumber(i);
        }
        //System.gc();
        System.out.println("koniec");
    }
}
