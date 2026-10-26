import java.util.*;

public class GenericCollectionsDemo {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Bala");
        students.add("Kumar");
        students.add("Arun");

        System.out.println("Student List: " + students);

        Set<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("Java");

        System.out.println("\nCourse Set: " + courses);

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Arun");
        studentMap.put(102, "Bala");
        studentMap.put(103, "Kumar");

        System.out.println("\nStudent Roll Numbers and Names:");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Queue<String> queue = new LinkedList<>();

        queue.offer("Arun");
        queue.offer("Bala");
        queue.offer("Kumar");

        System.out.println("\nQueue Before Processing: " + queue);

        String processed = queue.poll();

        System.out.println("Processed Element: " + processed);
        System.out.println("Queue After Processing: " + queue);
    }
}