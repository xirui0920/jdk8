package basicTypes;

/**
 * @author: Cyrus
 * @date: 2020/10/23 5:47 下午
 * @description:
 */
public class Info {
    private String info;

    public Info() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Info{" +
                "info='" + info + '\'' +
                '}';
    }
}
