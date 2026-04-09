import java.util.*;

public class Employee {
    int id;
    int importance;
    List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }

    public static int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(e.id, e);
        }

        return dfs(map, id);
    }

    private static int dfs(Map<Integer, Employee> map, int id) {
        Employee emp = map.get(id);
        int total = emp.importance;

        for (int subId : emp.subordinates) {
            total += dfs(map, subId);
        }

        return total;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, 5, Arrays.asList(2, 3)));
        employees.add(new Employee(2, 3, new ArrayList<>()));
        employees.add(new Employee(3, 3, new ArrayList<>()));

        int id = 1;

        int result = getImportance(employees, id);

        System.out.println(result); // Output: 11
    }
}