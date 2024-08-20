package extends_interface;

public class TrienKhaiHamCong implements interface_1,interface_2{
    @Override
    public int cong(int a, int b) {
        return a+b;
    }

    @Override
    public int tru(int a, int b) {
        return a-b;
    }
}
