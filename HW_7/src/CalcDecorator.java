public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc; // старый калькулятор
    private Logger logger; // логер
 
    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    // переопределяем сумму, получаем значения из старого калькулятора
    @Override
    public iCalculable sum(int argD, int argM) {
       int firstArgD = oldCalc.getResult()[0];
       int firstArgM = oldCalc.getResult()[1];

       logger.log(String.format("Первое значение калькулятора %d + i*(%d). Начало вызова метода sum с параметром %d + i*(%d)", firstArgD, firstArgM, argD, argM));
       iCalculable result = oldCalc.sum(argD, argM);
       logger.log(String.format("Вызова метода sum произошел"));

       return result;
    }

    // переопределяем умножение
    @Override
    public iCalculable multi(int argD, int argM) {
       int firstArgD = oldCalc.getResult()[0];
       int firstArgM = oldCalc.getResult()[1];
        logger.log(String.format("Первое значение калькулятора %d+i*(%d). Начало вызова метода multi с параметром %d+i*(%d)", firstArgD, firstArgM, argD, argM));
        iCalculable result = oldCalc.multi(argD, argM);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    // переопределяем получение результата
    @Override
    public int[] getResult() {
        int[] result = oldCalc.getResult();
        logger.log(String.format("Получение результата %d+i*(%d)", result[0], result[1]));
        return result;
    }

    // переопределяем деление
    @Override
    public iCalculable divide(int argD, int argM) {
        int firstArgD = oldCalc.getResult()[0];
        int firstArgM = oldCalc.getResult()[1];
        logger.log(String.format("Первое значение калькулятора %d+i*(%d). Начало вызова метода multi с параметром %d+i*(%d)", firstArgD, firstArgM, argD, argM));
        iCalculable result = oldCalc.multi(argD, argM);
        logger.log(String.format("Вызова метода divide произошел"));
        return result;
    }
    
}
