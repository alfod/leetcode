package leetcode;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Yang Dong
 * @createTime 2018/6/25  18:49
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/25  18:49
 * @note
 */
public class BaseTest {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    protected void print(Object object) {
        System.out.println(gson.toJson(object));
    }

}
