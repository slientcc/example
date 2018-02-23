package entity;

import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;

/**
 * @author saber
 * @version 1.0
 * @create_time 2018/2/22 下午7:05
 */
public class User {

    private Integer id;

    private String realName;

    private String nickName;

    public User() {
    }

    public User(Integer id, String realName, String nickName) {
        this.id = id;
        this.realName = realName;
        this.nickName = nickName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("realName", realName)
                .add("nickName", nickName)
                .toString();
    }
}
