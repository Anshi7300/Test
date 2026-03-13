public class echoargs{
    public static void main(String[] args) {
    System.out.println("Number of arguments: " + args.length);
    if (args.length > 0) {
    System.out.println("Arguments provided:");
    for (int i = 0; i < args.length; i++) {
    System.out.println("Argument " + i + ": " + args[i]);
    }
    } else {
    System.out.println("No command-line arguments were provided.");
    }
    }
    }
