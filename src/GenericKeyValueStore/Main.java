package GenericKeyValueStore;

public class Main {
    public static void main(String[] args) {
        // Create a KeyValueStore with String as the key and Integer as the value
        KeyValueStore<String, Integer> stringIntegerStore = new KeyValueStore<>("Age", 30);
        System.out.println("String-Integer Store: " + stringIntegerStore);
        System.out.println("Key: " + stringIntegerStore.getKey());
        System.out.println("Value: " + stringIntegerStore.getValue());

        // Update the value
        stringIntegerStore.setValue(31);
        System.out.println("Updated String-Integer Store: " + stringIntegerStore);

        // Create a KeyValueStore with Character as the key and Boolean as the value
        KeyValueStore<Character, Boolean> charBooleanStore = new KeyValueStore<>('A', true);
        System.out.println("\nCharacter-Boolean Store: " + charBooleanStore);
        System.out.println("Key: " + charBooleanStore.getKey());
        System.out.println("Value: " + charBooleanStore.getValue());

        // Update the value
        charBooleanStore.setValue(false);
        System.out.println("Updated Character-Boolean Store: " + charBooleanStore);
    }
}
