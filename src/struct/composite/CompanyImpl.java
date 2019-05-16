package struct.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompanyImpl extends Company {

    private List<Company> children = new ArrayList<>();

    public CompanyImpl(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "-")) + this.getName());
        children.forEach(company -> company.display(depth + 2));
    }

    @Override
    public void LineOfDuty() {
        children.forEach(Company::LineOfDuty);
    }
}
