package structural.decorator;

import java.util.Date;

public class EmployeeDecorator implements IEmployeeComponent {

    protected IEmployeeComponent employee;

    public EmployeeDecorator(IEmployeeComponent employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void doTask() {
        // TODO Auto-generated method stub
    }

    @Override
    public void join(Date joinDate) {
        employee.join(joinDate);        
    }

    @Override
    public void terminate(Date terminateDate) {
        employee.terminate(terminateDate);        
    }
    
}
