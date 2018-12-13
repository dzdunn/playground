import java.util.EnumMap;
import java.util.Map;

public class MyPojo {

    private Map<MyEnum, Object> valueMap = new EnumMap(MyEnum.class);

    public <T> T getValue(MyEnum myEnum) {
        return (T) getValue(myEnum, myEnum.getClazz());
    }

    private <T> T getValue(MyEnum myEnum, Class<T> clazz) {
        if (clazz.isAssignableFrom(valueMap.get(myEnum).getClass())) {
            return (T) myEnum.getClazz().cast(valueMap.get(myEnum));
        }
        return null;
    }

    public void setValueMap(Map<MyEnum, Object> valueMap) {
        this.valueMap = valueMap;
    }


}
