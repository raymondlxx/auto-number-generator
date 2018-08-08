/**
 * @author leolee
 * @date 2018/8/8.
 */
public interface AutoNumberService {

    AutoNumberRule getAutoNumberRule();

    AutoNumberResetRule getAutoNumberResetRule();

    String getNextNumber();
}
