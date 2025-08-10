import java.util.Locale;
import java.util.Scanner;

public class Words_Replacer {

    /**
     * Converts the first character of a word to uppercase and the rest to lowercase.
     *
     * @param word The input word.
     * @return The word in title case.
     */
    public static String toTitleCase(String word) {
        // Handle null or empty words to prevent errors.
        if (word == null || word.isEmpty()) {
            return "";
        }
        // Convert the first character to uppercase and the rest to lowercase.
        return word.substring(0, 1).toUpperCase(Locale.ENGLISH) + word.substring(1).toLowerCase(Locale.ENGLISH);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The input string containing PL/SQL code.
        String input = "CREATE OR REPLACE FUNCTION func_performance_hours( p_start_time IN DATE, p_stop_time  IN DATE ) RETURN NUMBER IS v_hours NUMBER; BEGIN -- Calculate difference in days * 24 to get hours v_hours := (p_stop_time - p_start_time) * 24; -- Validate that hours is positive IF v_hours < 0 THEN RAISE_APPLICATION_ERROR(-20001, 'Stop time is before start time.'); END IF; RETURN v_hours; END; /";

        // Array of words to be converted to title case. These are SQL/PL/SQL keywords.
        String[] wordsToReplace = { "select", "from", "where", "and", "or", "not",
                "insert", "into", "values", "update", "set",
                "delete", "table", "create", "alter", "drop",
                "index", "unique", "primary", "key", "foreign",
                "references", "constraint", "join", "inner",
                "left", "right", "full", "outer", "on",
                "order", "by", "group", "by", "having",
                "limit", "offset", "distinct", "as", "null",
                "is", "null", "is not null", "like", "between",
                "in", "exists", "all", "any", "some",
                "count", "sum", "avg", "min", "max",
                "case", "when", "then", "else", "end",
                "view", "procedure", "function", "trigger",
                "cursor", "declare", "begin", "commit",
                "rollback", "savepoint", "grant", "revoke",
                "union", "intersect", "except",
                // Data Types (common ones)
                "int", "integer", "smallint", "bigint",
                "decimal", "numeric", "float", "real",
                "double precision", "char", "varchar", "text",
                "date", "time", "timestamp", "boolean",
                // Other keywords
                "default", "auto_increment", "identity",
                "column", "database", "schema",
                // MySQL specific (some common ones)
                "engine", "autoincrement",
                // PostgreSQL specific (some common ones)
                "serial",
                // Oracle specific (some common ones)
                "rownum", "sysdate", "sys_guid",
                // SQL Server specific (some common ones)
                "getdate", "getdate", "newid", "if", "for", "case", "end", "loop",
                // SQLite specific (some common ones)
                "sequence", "start", "with", "increment", "replace",
                "nocache", "nocycle", "cache", "cycle",
                "partition", "tablespace", "rowid",
                "rownum", "row_number", "rank", "dense_rank",
                "lead", "lag", "first_value", "constant", "number", "last_value"
        };

        StringBuilder result = new StringBuilder();

        // Prepare the input string for splitting:
        // 1. Replace all semicolons with " ;" to ensure they are treated as separate tokens
        //    during the split operation, allowing us to handle them individually.
        // 2. Trim leading/trailing whitespace.
        String modifiedInputForSplitting = input.replace(";", " ;").trim();

        // Split the modified input string into an array of words using one or more whitespace characters as delimiters.
        // This handles cases with single or multiple spaces between words.
        String[] words = modifiedInputForSplitting.split("\\s+");

        // Flag to track if the last appended word was a titled keyword.
        // Used to determine whether to add a newline before the next titled keyword.
        boolean lastWordTitled = false;

        // Iterate through each word obtained from the split input.
        for (String word : words) {
            // Skip empty strings that might result from splitting (e.g., if there are consecutive spaces).
            if (word.isEmpty()) {
                continue;
            }

            // --- New Functionality: Handle Semicolon ---
            // If the current word is exactly a semicolon, append it followed by a newline character.
            // Then, continue to the next word without applying title case logic.
            if (word.equals(";")) {
                // If the StringBuilder is not empty and the last character appended was a space,
                // remove that space before appending the semicolon. This prevents " ;" -> ";\n".
                if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
                    result.deleteCharAt(result.length() - 1); // Remove the trailing space from the previous word
                }
                result.append(word).append("\n"); // Append semicolon, then newline
                lastWordTitled = false; // Reset the flag after a newline, as it acts as a separator.
                continue; // Move to the next word in the loop.
            }
            // --- End New Functionality ---

            boolean found = false; // Flag to check if the current word is a keyword to be titled.
            // Check if the current word (case-insensitively) matches any word in the wordsToReplace array.
            for (String targetWord : wordsToReplace) {
                if (word.equalsIgnoreCase(targetWord)) {
                    // If the last word was NOT a titled keyword, add a newline for better formatting.
                    // This creates a new line for new keyword sequences.
                    if (!lastWordTitled) {
                        result.append("\n");
                    }
                    // Append the titled-case version of the word followed by a space.
                    result.append(toTitleCase(word)).append(" ");
                    found = true; // Mark as found.
                    lastWordTitled = true; // Set the flag, as the current word was titled.
                    break; // Exit the inner loop once a match is found.
                }
            }
            // If the word was not a keyword to be titled.
            if (!found) {
                // Append the word in lowercase followed by a space.
                result.append(word.toLowerCase()).append(" ");
                lastWordTitled = false; // Reset the flag, as the current word was not titled.
            }
        }

        System.out.println("Modified string:\n");
        // Print the final formatted string. Trim to remove any trailing space at the very end.
        // The semicolons themselves will now ensure newlines as per the new functionality.
        System.out.print(result.toString().trim());

        scanner.close(); // Close the scanner to release system resources.
    }
}
