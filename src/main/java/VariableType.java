/**
 * @author leolee
 * @date 2018/8/8.
 */
public enum VariableType {
    /**
     * year
     */
    YYYY("yyyy"),
    /**
     * month
     */
    MM("mm"),
    /**
     * day
     */
    DD("dd"),
    /**
     * field variable
     */
    Field("field_variable"),
    /**
     * global variable
     */
    GLOBAL("global_variable"),
    /**
     * chars
     */
    Chars("chars");

    String variableType;

    VariableType(String variableType){
        this.variableType = variableType;
    }

}
