public class q46_string_buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("world");

        System.out.println("Content of StringBuffer: " + stringBuffer);

        stringBuffer.append(", ");
        stringBuffer.append("how");
        stringBuffer.append(" ");
        stringBuffer.append("are");
        stringBuffer.append(" ");
        stringBuffer.append("you");

        System.out.println("Updated content of StringBuffer: " + stringBuffer);

        stringBuffer.insert(12, "beautiful ");
        System.out.println("Content after insertion: " + stringBuffer);

        stringBuffer.replace(21, 24, "doing");
        System.out.println("Content after replacement: " + stringBuffer);

        stringBuffer.delete(29, 33);
        System.out.println("Content after deletion: " + stringBuffer);
    }
}
