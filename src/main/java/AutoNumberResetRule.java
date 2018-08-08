import lombok.Data;

import java.util.List;

/**
 *
 * @author leolee
 * @date 2018/8/8
 */
@Data
public class AutoNumberResetRule {
    /**
     * is reset rule enabled
     */
    boolean resetEnabled;
    /**
     * the variables trigger resetting
     */
    List<IVariable> variables;

}
