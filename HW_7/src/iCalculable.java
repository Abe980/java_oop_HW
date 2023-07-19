

public interface iCalculable {
    iCalculable sum(int argD, int argM);
    iCalculable multi(int argD, int argM);
    iCalculable divide(int argD, int argM); // добавил деление
    int[] getResult();
}
