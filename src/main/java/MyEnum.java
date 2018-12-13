import java.math.BigDecimal;

public enum MyEnum {

    STRING_FIELD(String.class),
    BIGDECIMAL_FIELD(BigDecimal.class),
    MY_TYPE_FIELD(MyType.class);

    private Class<?> clazz;

    private MyEnum(Class<?> clazz){
        this.clazz = clazz;
    }

    public Class<?> getClazz(){
        return clazz;
    }




}
