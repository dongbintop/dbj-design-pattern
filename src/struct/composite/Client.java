package struct.composite;

public class Client {

    public static void main(String[] args) {
        Company root = new CompanyImpl("FIT2CLOUD北京总公司");
        root.add(new HRDepartment("北京总公司HR"));
        root.add(new FinanceDepartment("北京总公司财务"));

        Company north = new CompanyImpl("FIT2CLOUD北区分公司");
        north.add(new HRDepartment("北区分公司HR"));
        north.add(new FinanceDepartment("北区分公司财务"));
        root.add(north);

        Company east = new CompanyImpl("FIT2CLOUD东区分公司");
        east.add(new HRDepartment("东区分公司HR"));
        east.add(new FinanceDepartment("东区分公司财务"));
        root.add(east);

        Company south = new CompanyImpl("FIT2CLOUD南区分公司");
        south.add(new HRDepartment("南区分公司HR"));
        south.add(new FinanceDepartment("南区分公司财务"));
        root.add(south);

        Company cd = new CompanyImpl("FIT2CLOUD成都办事处");
        root.add(cd);

        System.out.println("结构图:");
        root.display(1);
        System.out.println();
        System.out.println("职责:");
        root.LineOfDuty();
    }
}
