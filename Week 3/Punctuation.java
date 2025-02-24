public class Punctuation {
    public static void main(String[] args) {
        String poem ="Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
            
            // Define punctuation symbols
        char[] punctuationSymbols = {'.', ',', ';', ':', '!', '?', '"', '\'', '(', ')', '-', '[', ']', '{', '}'};
        int[] counts = new int[punctuationSymbols.length]; // Array to store counts
            
            // Count occurrences
        for (char c : poem.toCharArray()) {
            for (int i = 0; i < punctuationSymbols.length; i++) {
                if (c == punctuationSymbols[i]) {
                    counts[i]++;
                }
            }
        }
            
            // Print table header
        System.out.printf("%-10s | %s%n", "Symbol", "Count");
        System.out.println("----------------------");
            
            // Print counts
        for (int i = 0; i < punctuationSymbols.length; i++) {
            if (counts[i] > 0) {
                System.out.printf("%-10s | %d%n", punctuationSymbols[i], counts[i]);
            }
        }
    }
}