package basicTypes;

import java.util.Objects;

/**
 * @author: Cyrus
 * @date: 2020/10/23 5:38 下午
 * @description:
 */
public class Demo implements Cloneable {
    private String a;
    private Boolean b;
    private Double c;
    private Info info;

    public Demo() {
    }

    public Demo(String a, Boolean b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Boolean getB() {
        return b;
    }

    public void setB(Boolean b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return Objects.equals(a, demo.a) &&
                Objects.equals(b, demo.b) &&
                Objects.equals(c, demo.c) &&
                Objects.equals(info, demo.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, info);
    }

    @Override
    public String toString() {
        return "Demo{" +
                "a='" + a + '\'' +
                ", b=" + b +
                ", c=" + c +
                ", info=" + info +
                '}';
    }

    @Override
    protected Demo clone() throws CloneNotSupportedException {
        return (Demo) super.clone();
    }
}
