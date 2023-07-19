

public final class Calculator implements iCalculable {

    private int primaryArgD; // действительная часть 
    private int primaryArgM; // мнимая часть

    public Calculator(int primaryArgD, int primaryArgM) {
        this.primaryArgD = primaryArgD;
        this.primaryArgM = primaryArgM;
    }

    // считаем сумму
    @Override
    public iCalculable sum(int argD, int argM) {
        primaryArgD += argD;
        primaryArgM += argM;
        return this;
    }

    // считаем умножение
    @Override
    public iCalculable multi(int argD, int argM) {
        primaryArgD = primaryArgD*argD - primaryArgM*argM;
        primaryArgM = primaryArgD*argM + primaryArgM*argD;
        return this;
    }

    /*
     * получаем результат в виде массива из двух элементов: действительная часть и мнимая
     */
    @Override
    public int[] getResult() {
        int[] res = new int[2];
        res[0] = primaryArgD;
        res[1] = primaryArgM;
        return res;
    }

    // считаем деление
    @Override
    public iCalculable divide(int argD, int argM) {
        primaryArgD = (primaryArgD*argD + primaryArgM*argM) / (argD*argD + argM*argM);
        primaryArgM = (primaryArgM*argD - primaryArgD*argM) / (argD*argD + argM*argM);
        return this;
    }
}
