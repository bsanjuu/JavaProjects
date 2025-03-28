import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.*;

class ConcurrentHashMapExample {
//    public static void main(String[] args) {
//        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
//
//        System.out.println("Concurrent HashMap:");
//        map.put(1,"Sanju");
//        map.put(2,"Revanth");
//        System.out.println(map);
//
//        map.replace(2,"Riskthem");
//        System.out.println(map);
//
//        HashMap<Integer, String> map2 = new HashMap<>();
//        System.out.print("Regular HashMap:\n");
//        map2.put(1,"Sanju");
//        map2.put(2,"Revanth");
//        System.out.println(map2);
//        map2.replace(2,"Riskthem");
//        System.out.println(map2);
//
//
//
//
//    }

    public static void main(String[] args) throws InterruptedException {
        // HashMap (not thread-safe)
        Map<Integer, String> hashMap = new HashMap<>();
        runTest(hashMap, "HashMap");

        // ConcurrentHashMap (thread-safe)
        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        runTest(concurrentHashMap, "ConcurrentHashMap");
    }

    // Method to run the test on the map
    private static void runTest(Map<Integer, String> map, String mapName) throws InterruptedException {
        System.out.println("\nTesting " + mapName);

        // Create 10 threads that will modify the map
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            threads.add(new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    map.put(index, "Value " + j);
                }
            }));
        }

        // Start the threads
        for (Thread t : threads) {
            t.start();
        }

        // Join the threads (wait for all to finish)
        for (Thread t : threads) {
            t.join();
        }

        // Print the result
        System.out.println("Final map size: " + map.size());
        System.out.println(map);
    }
}