package me.alfod.hard;

/**
 * @author Yang Dong
 * @createTime 2018/6/26  10:05
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/26  10:05
 * @note
 */
public interface Utils {

    default void print(Object o) {
        System.out.println(o.toString());
    }
}
