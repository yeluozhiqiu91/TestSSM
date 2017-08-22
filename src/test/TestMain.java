import com.google.gson.GsonBuilder;

/**
 * Created by wang on 2017/8/22.
 * gson将对象转为json时忽略注解了@Ignore的字段
 */
public class TestMain {
    public static void main(String args[]){
        TestBean testBean=new TestBean();
        testBean.setName("abc");
        testBean.setAge(20);
        testBean.setIdcard("skadjflajdfkalfjakdkfajkdjfladfkaskj");
        GsonBuilder gsonBuilder=new GsonBuilder();
        System.out.println(gsonBuilder.addSerializationExclusionStrategy(new IgnoreStrategy()).create().toJson(testBean));
        //结果输出：{"name":"abc","age":20}
        //如果idcard不注解的话就输出：{"name":"abc","age":20,"idcard":"skadjflajdfkalfjakdkfajkdjfladfkaskj"}
    }
}
