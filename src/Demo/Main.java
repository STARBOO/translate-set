package Demo;

import com.lsj.Trans.BaiduDispatch;
import com.lsj.Trans.YouDaoDispatch;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println(new YouDaoDispatch().Trans(null, null, "i am king"));
		System.out.println(new BaiduDispatch().Trans(null, null, "i am king"));
	}

}
