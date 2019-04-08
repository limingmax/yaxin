import com.ai.appframe2.service.ServiceFactory;
import com.test.dao.ITestDAO;

public class TestFactory {

    @SuppressWarnings("unchecked")
    public static <T> T getService(Class<T> cls) throws Exception {
        return (T) ServiceFactory.getService(cls);
    }


    public static ITestDAO getTestDAO() throws Exception {
        return (ITestDAO) ServiceFactory.getService(ITestDAO.class);
    }
}
