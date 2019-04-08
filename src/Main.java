import com.test.dao.ITestDAO;

public class Main {

    public static void main(String args[]) throws Exception{
        ITestDAO coDao = TestFactory.getTestDAO();
        coDao.getAll();
    }
}
