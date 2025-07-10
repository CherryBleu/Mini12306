package Exception;

//输入选择时的数字超出123的范围
public class ChoiceOutOfIndex extends RuntimeException {
    public ChoiceOutOfIndex(String message) {
        super(message);
    }
}
