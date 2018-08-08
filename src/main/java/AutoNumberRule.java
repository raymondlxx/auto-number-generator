import lombok.Data;

import java.util.List;

/**
 *
 * @author leolee
 * @date 2018/8/8.
 */
@Data
public class AutoNumberRule {
    /**
     * prefix parts
     */
    List<Part> prefix;
    /**
     * postfix parts
     */
    List<Part> postfix;
    /**
     * min length of self-increasing part.
     */
    int minLength;
    /**
     * the start number of the self-increasing part.
     */
    int startNumber;
}
