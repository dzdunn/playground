import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.EnumMap;
import java.util.Map;

@RunWith(BlockJUnit4ClassRunner.class)
public class MyPojoTest {

    private Map<MyEnum, Object> valueMap = new EnumMap(MyEnum.class);

    @Before
    public void setUp(){
        Object o1 = new BigDecimal("1000");
        Object o2 = "TEST_STRING";
        Calendar cal = Calendar.getInstance();
        cal.set(1990, 05, 27);
        Object o3 = new MyType("Danny", 28, cal.getTime());

        valueMap.put(MyEnum.BIGDECIMAL_FIELD, o1);
        valueMap.put(MyEnum.STRING_FIELD, o2);
        valueMap.put(MyEnum.MY_TYPE_FIELD, o3);


    }

    @Test
    public void testEnum(){
        MyPojo myPojo = new MyPojo();
        myPojo.setValueMap(valueMap);

        BigDecimal bigDecimal = myPojo.getValue(MyEnum.BIGDECIMAL_FIELD);
        String string = myPojo.getValue(MyEnum.STRING_FIELD);
        MyType myType = myPojo.getValue(MyEnum.MY_TYPE_FIELD);

        System.out.println(myPojo.getValue(MyEnum.STRING_FIELD).toString());
        System.out.println(myPojo.getValue(MyEnum.BIGDECIMAL_FIELD).toString());

        System.out.println("****MY_TYPE*****");
        System.out.println(myType.getAge());
        System.out.println(myType.getDob());
        System.out.println(myType.getName());
    }

}
