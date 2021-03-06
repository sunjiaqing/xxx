package cn.sun.factory;

import cn.sun.utils.ConfigUtils;

/**
 * 工厂
 * Created by Administrator on 2017/8/17.
 */
public enum BasicFactory {
    factory;

    public <T>T getInstence(Class<T> clz){

        try {
            return (T) Class.forName(ConfigUtils.getProperty(clz.getSimpleName())).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
