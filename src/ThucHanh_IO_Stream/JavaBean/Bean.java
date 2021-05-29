package ThucHanh_IO_Stream.JavaBean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Properties;

public class Bean {
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private String property1;
    private int property2;

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        pcs.firePropertyChange("property1", this.property1, property1);
        this.property1 = property1;
    }

    public int getProperty2() {
        return property2;
    }

    public void setProperty2(int property2) {
        pcs.firePropertyChange("property2", this.property2, property2);
        this.property2 = property2;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public static class MyPropertyChangeListener implements PropertyChangeListener {
        public void propertyChange(PropertyChangeEvent event) {
            System.out.println("Name " + event.getPropertyName());
            System.out.println("Old value " + event.getOldValue());
            System.out.println("New value " + event.getNewValue());
            System.out.println("********************************");
        }
    }

    public static void main(String[] args) {
        Bean bean = new Bean();
        bean.addPropertyChangeListener(new MyPropertyChangeListener());
        bean.setProperty1("newProperty1");
        bean.setProperty2(123);
        bean.setProperty1("newnewProperty");
        bean.setProperty2(234);
    }
}
