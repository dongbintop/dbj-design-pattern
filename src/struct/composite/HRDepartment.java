package struct.composite;

import java.util.Collections;

public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "-")) + this.getName());
    }

    @Override
    public void LineOfDuty() {
        System.out.println(String.format("%s 负责招聘人员", this.getName()));
    }
}
